/*
package redditjackal.entities;

import redditjackal.exceptions.NotLoggedInException;

import java.util.*;

public class SubredditHistory extends RedditHistory {
        private CommentHistory commentHistory;
        private PostHistory hotPosts;
        private PostHistory newPosts;

        public CommentHistory getCommentHistory()  {return commentHistory;}

        public PostHistory getHotPosts()  {return hotPosts;}

        private HashMap<String, Subreddit> subreddits;
        //constructor
        public SubredditHistory(Actor actor)  {
            super(actor, "subreddit");
        }

        public void clear()  {
            commentHistory=null;
            hotPosts =null;
            newPosts = null;
            subreddits=null;
        }

        SubredditHistory(Actor actor, CommentHistory commentHistory, PostHistory postHistory) throws NotLoggedInException {
            super(actor, "subreddit");

            update(commentHistory, postHistory);
        }

        public boolean update(PostHistory postHistory) throws NotLoggedInException  {
            if (postHistory.isEmpty())  {
                return false;
            }

            if (subreddits==null) {
                subreddits = new HashMap<>();
            }

            this.hotPosts = postHistory;

            HashSet<String> subredditSet = new HashSet<>();

            for (String subredditName: postHistory.getFrequencies().keySet())  {
                subredditSet.add(subredditName);
            }

            for (String subredditName: subredditSet)  {
                Subreddit subreddit = reddit.getSubreddit(subredditName);
                //subreddit.getDescription();

                subreddits.put(subredditName, subreddit);
            }

            return true;
        }



        public boolean update(CommentHistory commentHistory) throws NotLoggedInException  {
            if (commentHistory.isEmpty())  {
                return false;
            }

            if (subreddits==null) {
                subreddits = new HashMap<>();
            }

            this.commentHistory = commentHistory;

            HashSet<String> subredditSet = new HashSet<>();
            for (String subredditName: commentHistory.getFrequencies().keySet())  {
                subredditSet.add(subredditName);
            }

            for (String subredditName: subredditSet)  {
                Subreddit subreddit = reddit.getSubreddit(subredditName);
                //subreddit.getDescription();

                subreddits.put(subredditName, subreddit);
            }

                return true;
        }

        public boolean update(CommentHistory commentHistory, PostHistory postHistory) throws NotLoggedInException  {
                boolean updateComment = update(commentHistory);
                boolean updatePost = update(postHistory);

                return updateComment || updatePost;
        }

        //abstract
        public boolean isEmpty()  {return subreddits.size()==0;}

        public int size()  {return subreddits.size();}

        public LinkedHashMap<String, Long> calculateFrequencies()  {
                frequencies = new LinkedHashMap<>();

                for (Subreddit subreddit: subreddits.values())  {
                    frequencies.put(subreddit.getName(), 0L);
                }

                if (commentHistory!=null)  {
                    for (Subreddit subreddit: subreddits.values())  {
                        Long comments = commentHistory.getFrequencies().get(subreddit.getName());

                        //System.out.println("comments in " + subreddit.getName() + ": " + comments);
                        if (comments!=null) {
                            frequencies.put(subreddit.getName(), comments);
                        }
                    }
                }

                //System.out.println("freq_after_comm: " + frequencies);

                if (hotPosts !=null)  {
                    for (Subreddit subreddit: subreddits.values())  {
                        Long posts = hotPosts.getFrequencies().get(subreddit.getName());

                       // System.out.println("posts in " + subreddit.getName() + ": " + posts);

                        //System.out.println(subreddit.getName());
                       // System.out.println(frequencies.get(subreddit.getName()));
                       // System.out.println(posts);

                        if (posts!=null) {
                            frequencies.put(subreddit.getName(), frequencies.get(subreddit.getName()) + posts);
                        }
                    }
                }

                //System.out.println("freq_after_posts: " + frequencies);

                //System.out.println("commentFreq: " + commentHistory.getFrequencies());
                //System.out.println("postFreq: " + hotPosts.getFrequencies());

                frequencies = Util.sortHashMap(frequencies, "desc");

               // System.out.println("subreddits array: " + subreddits);

                return frequencies;
        }



        //getters
        public HashMap<String, Subreddit> getSubreddits()  {
            return subreddits;
        }

        public PostHistory getNewPosts() {
            return newPosts;
        }
}
*/
