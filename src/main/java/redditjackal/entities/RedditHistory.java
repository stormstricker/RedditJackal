package redditjackal.entities;

import redditjackal.requests.RedditRequest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public abstract class RedditHistory {
    protected Reddit reddit;
    protected Actor actor;
    protected String actorType;
    protected String type;

    protected LinkedHashMap<String, Long> frequencies;

    public boolean calculated;

    protected String requestLink;

    public RedditHistory(Actor actor, String type)  {
        this.reddit = actor.getReddit();
        this.actor = actor;
        actorType = actor instanceof Redditor ? "user" : "subreddit";

        this.type = type; //posts or comments for PostHistory and CommentHistory
    }

    //abstract
    public abstract boolean isEmpty();

    public abstract int size();

    public abstract void clear();

   // public void updateThings(String type) throws Exception  {
   //     updateThings(size(), type);
   // }


   // public LinkedList<? extends Thing> updateThings(String type, String firstId, String lastId) throws Exception  {
   //     return updateThings(1000, type, "", lastId);  //would load entities until lastId is met
   // }


    //oauth.reddit.com/user/username/submitted?limit=10
    //oauth.reddit.com/user/username/comments?limit=10
    //oauth.reddit.com/r/subreddit/comments?limit=10 (always new comments)
    //oauth.reddit.com/r/subreddit/new?limit=10
    //oauth.reddit.com/r/subreddit/hot?limit=10
    public LinkedList<? extends Thing> updateThings(int total, String firstId, String lastId) throws Exception {
        return updateThings(total, firstId, lastId, "hot");
    }

    public LinkedList<? extends Thing> updateThings(int total, String firstId, String lastId, String thingSort) throws Exception  {
        System.out.println("type: " + type);

        LinkedList<Thing> result = new LinkedList<>();

        String concreteLink =  "https://oauth.reddit.com";

        if (actorType.equalsIgnoreCase("user"))  {
            concreteLink+="/user/" + actor.getName();
        }
        else  {
            concreteLink+="/r/" + actor.getName();
        }

        if (type.equalsIgnoreCase("posts"))  {
            if (actorType.equalsIgnoreCase("user"))  {
                concreteLink+="/submitted";
            }
            else  {
                concreteLink+="/" + thingSort;
            }
        }
        else  {
            concreteLink+="/comments";
        }

        System.out.println("concreteLink: " + concreteLink);
            String afterThing = "";
            int count=0;
            int left=total;

            if (!firstId.equals(""))  {
                left = 1000;
            }

            System.out.println("lastId: " + lastId);

            while (count< (total/100.0)) {
                String link;

                if (left<=100) {
                    link = concreteLink + "?limit=" +
                            left + "&after=" + afterThing;
                }
                else  {
                    link = concreteLink + "?limit=" +
                            100 + "&after=" + afterThing;
                }
                RedditRequest thingsRequest = new RedditRequest(link, reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.GET);

                String inputString = thingsRequest.send().getResponse();

                System.out.println(inputString);

                JSONObject jsonArray = new JSONObject(inputString);
                JSONArray things = (JSONArray) ((JSONObject) jsonArray.get("data")).get("children");

                if (things.length()==0)  {
                    return result;
                }

                System.out.println("entities.length: " + things.length());

                int i=0;
                while (result.size()<total && i<things.length()) {
                    JSONObject commentObject = (JSONObject) things.get(i);
                    JSONObject thingData = (JSONObject) commentObject.get("data");

                    Thing thing;
                    if (type.equalsIgnoreCase("comments"))  {
                        thing = new Comment(reddit, thingData);
                    }
                    else {
                         thing = new Post(reddit, thingData);
                    }

                    if (!firstId.equals("")) {
                        if (!thing.getId().equals(firstId)) {
                            //System.out.println("before continue: " + count + left);
                            i++;
                            continue;
                        }
                    }
                    firstId = "";

                    if (!lastId.equals("") && thing.getId().equals(lastId))  {
                            return result;
                    }

                    result.add(thing);

                    i++;
                }

                afterThing =result.get(result.size()-1).getId();

                left-=Math.min(100, left);
                count++;
            }

            return result;
    }



    public abstract LinkedHashMap<String, Long> calculateFrequencies();

    public LinkedHashMap<String, Long> calculateFrequencies(LinkedList<? extends Thing> things)  {
        LinkedHashMap<String, Long> result = new LinkedHashMap<>();
        HashMap<String, Long> unsortedResult = new HashMap<String, Long>();

        if (things.size()==0)  {
            System.out.println("No entities");

            return result;
        }

        for (Thing thing: things)  {
            if (unsortedResult.containsKey(thing.getSubreddit().getName()))  {
                unsortedResult.put(thing.getSubreddit().getName(), unsortedResult.get(thing.getSubreddit().getName()) + 1);
            }
            else  {
                unsortedResult.put(thing.getSubreddit().getName(), (long) 1);
            }
        }

        result = Util.sortHashMap(unsortedResult, "desc");
        frequencies = result;
        return result;
    }

    //getters
    public LinkedHashMap<String, Long> getFrequencies()  {
        return frequencies;
    }

    public Actor getActor()  {return actor;}

    //setters
    public void setFrequencies(LinkedHashMap<String, Long> frequencies)  {
        this.frequencies = frequencies;
    }
}

