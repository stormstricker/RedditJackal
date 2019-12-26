package redditjackal.history.subreddit;

import redditjackal.entities.Post;
import redditjackal.entities.Subreddit;
import redditjackal.history.PostHistory;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingChildJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.listings.subreddit.posts.*;

import java.util.LinkedList;
import java.util.List;

public class SubredditPostHistory extends PostHistory {
    private Subreddit subreddit = (Subreddit) actor;
    public Subreddit getSubreddit()  {return subreddit;}

    public SubredditPostHistory(Subreddit subreddit)  {super(subreddit);}

    //TODO
    @Override
    public SubredditPostHistory updateFrom(int size, String name) {return this;}
    @Override
    public SubredditPostHistory updateTo(int size, String name)  {return this;}

    @Override
    public SubredditPostHistory update()  {
        return (SubredditPostHistory) super.update();
    }
    @Override
    public SubredditPostHistory update(int size)  {return (SubredditPostHistory) super.update(size);}

    @Override
    public SubredditPostHistory updateNew()  {
        return (SubredditPostHistory) super.updateNew();
    }
    @Override
    public SubredditPostHistory updateHot()  {
        return (SubredditPostHistory) super.updateHot();
    }
    @Override
    public SubredditPostHistory updateTop()  {
        return (SubredditPostHistory) super.updateTop();
    }
    @Override
    public SubredditPostHistory updateRising()  {
        return (SubredditPostHistory) super.updateRising();
    }
    @Override
    public SubredditPostHistory updateControversial()  {
        return (SubredditPostHistory) super.updateControversial();
    }


    public SubredditPostHistory updateRecursive(int left, String after, List<Post> results,
                                               AbstractSubredditPostsRequest.Builder<? extends AbstractSubredditPostsRequest.Builder<?>> builder)  {
        AbstractSubredditPostsRequest request;
        builder = builder.builder();
        if (left<=100)  {
            request= builder.setLimit(left).setAfter(after).build();

            PostsListingJson comments = request.execute();
            for (PostsListingChildJson comment: comments.getData().getChildren())  {
                results.add(new Post(subreddit, comment.getData()));
            }

            return this;
        }
        else  {
            request = builder.setLimit(100).setAfter(after).build();
            PostsListingJson comments = request.execute();
            for (PostsListingChildJson comment: comments.getData().getChildren())  {
                results.add(new Post(subreddit, comment.getData()));
            }

            return updateRecursive(left-100, results.get(results.size()-1).getName(),
                    results, builder);
        }
    }

    //TODO: make it really update, instead of just creating a new list
    @Override
    public SubredditPostHistory updateHot(int size)  {
        hotPosts = new LinkedList<>();
        return updateRecursive(size, "",
                hotPosts, HotPostsSubredditRequest.builder(subreddit.getName(), subreddit.getReddit().getAccessToken()));
    }

    @Override
    public SubredditPostHistory updateNew(int size)  {
        newPosts = new LinkedList<>();
        return updateRecursive(size, "",
                newPosts, NewPostsSubredditRequest.builder(subreddit.getName(), subreddit.getReddit().getAccessToken()));
    }

    @Override
    public SubredditPostHistory updateTop(int size)  {
        topPosts = new LinkedList<>();
        return updateRecursive(size, "",
                topPosts, TopPostsSubredditRequest.builder(subreddit.getName(), subreddit.getReddit().getAccessToken()));
    }

    @Override
    public SubredditPostHistory updateRising(int size)  {
        risingPosts = new LinkedList<>();
        return updateRecursive(size, "",
                risingPosts, RisingPostsSubredditRequest.builder(subreddit.getName(), subreddit.getReddit().getAccessToken()));
    }

    @Override
    public SubredditPostHistory updateControversial(int size)  {
        controversialPosts = new LinkedList<>();
        return updateRecursive(size, "",
                controversialPosts, ControversialPostsSubredditRequest.builder(subreddit.getName(), subreddit.getReddit().getAccessToken()));
    }
}
