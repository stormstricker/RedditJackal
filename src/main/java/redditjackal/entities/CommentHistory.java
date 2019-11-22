/*
package redditjackal.entities;

import redditjackal.exceptions.ThingNotFoundException;
import redditjackal.requests.RedditRequest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class CommentHistory extends RedditHistory {
    private LinkedList<Comment> comments;


    //constructors
    public CommentHistory(Actor actor)  {
        super(actor, "comments");

        comments = new LinkedList<>();
    }

    public CommentHistory(Actor actor, LinkedList<Comment> comments)  {
        super(actor,"comments");
        this.comments = comments;
    }

    //abstract
    public boolean isEmpty()  {return comments.size()==0;}

    public int size()  {return comments.size();}

    public void clear()  {comments = new LinkedList<>();}

    public CommentHistory updateById(String thingId) throws Exception  {
        List<String> thingIds = new ArrayList<>();
        thingIds.add(thingId);

        return updateByIds(thingIds);
    }

    public CommentHistory updateByIds(List<String> thingIds) throws ThingNotFoundException {
        comments = new LinkedList<>();

        String lastId="";
        try {
            for (String thingId : thingIds) {
                lastId = thingId;

                RedditRequest redditRequest = new RedditRequest(" https://oauth.reddit.com/api/info?id=" + thingId,
                        reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.GET);
                String inputString = redditRequest.send().getResponse();
                JSONObject jsonArray = new JSONObject(inputString);

                JSONArray things = (JSONArray) ((JSONObject) jsonArray.get("data")).get("children");
                Comment comment = new Comment(reddit, (JSONObject) ((JSONObject) things.get(0)).get("data"));

                comments.add(comment);
            }
        }
        catch (Exception e)  {
            throw new ThingNotFoundException("Couldn't found a thing with id: " + lastId, e);
        }

        return this;
    }

    public CommentHistory updateFrom(int total, String firstId) throws Exception  {
        comments = (LinkedList<Comment>) updateThings(total, firstId, "");

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public CommentHistory updateTo(int total, String lastId) throws Exception  {
        comments = (LinkedList<Comment>) updateThings(1000,  "", lastId);

        System.out.println("comments size: " + comments.size());

        comments = new LinkedList(comments.subList(comments.size()- Math.min(total, comments.size()), comments.size()));

        System.out.println("newlisting comments: ");
        for (Comment comment: comments)  {
            System.out.println(comment);
        }

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public CommentHistory updateTo(String lastId) throws Exception {
        comments.addAll(0, (LinkedList<Comment>) updateThings(1000,  "", lastId));

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public CommentHistory update() throws Exception  {
        if (comments==null || comments.size()==0) {
                update(1000);
        }
        else if (comments.size()!=0)  {
             updateTo(comments.get(0).getId());
        }

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public CommentHistory update(int total) throws Exception  {
        comments = (LinkedList<Comment>) updateThings(total, "", "");

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public LinkedHashMap<String, Long> calculateFrequencies()  {
            frequencies = calculateFrequencies(comments);

            return calculateFrequencies(comments);
    }

    //getters
    public LinkedList<Comment> getComments()  {


        return comments;
    }

    public LinkedList<Comment> getComments(int total, boolean update)  {
         if (size()>=total && update==false)  {
             return (LinkedList<Comment>) comments.subList(size()-total-1, size());
         }

         //else update

        return comments;

    }
}
*/
