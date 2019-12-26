package redditjackal.history.redditor;

import redditjackal.entities.Post;
import redditjackal.entities.Redditor;
import redditjackal.history.PostHistory;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingChildJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.listings.redditor.posts.*;

import java.util.LinkedList;
import java.util.List;

public class RedditorPostHistory extends PostHistory {
    private Redditor redditor = (Redditor) actor;
    public Redditor getRedditor()  {return redditor;}

    public RedditorPostHistory(Redditor redditor)  {super(redditor);}

    @Override
    public RedditorPostHistory update()  {
        return (RedditorPostHistory) super.update();
    }
    @Override
    public RedditorPostHistory update(int size)  {return (RedditorPostHistory) super.update(size);}

    //TODO
    @Override
    public RedditorPostHistory updateFrom(int size, String name) {return this;}
    @Override
    public RedditorPostHistory updateTo(int size, String name)  {return this;}

    public RedditorPostHistory updateRecursive(int left, String after, List<Post> results,
                                                  AbstractRedditorPostsRequest.Builder<? extends AbstractRedditorPostsRequest.Builder<?>> builder)  {
        AbstractRedditorPostsRequest request;
        builder = builder.builder();
        if (left<=100)  {
            request= builder.setLimit(left).setAfter(after).build();

            PostsListingJson comments = request.execute();
            for (PostsListingChildJson comment: comments.getData().getChildren())  {
                results.add(new Post(redditor, comment.getData()));
            }

            return this;
        }
        else  {
            request = builder.setLimit(100).setAfter(after).build();
            PostsListingJson comments = request.execute();
            for (PostsListingChildJson comment: comments.getData().getChildren())  {
                results.add(new Post(redditor, comment.getData()));
            }

            return updateRecursive(left-100, results.get(results.size()-1).getName(),
                    results, builder);
        }
    }
    @Override
    public RedditorPostHistory updateNew()  {
        return (RedditorPostHistory) super.updateNew();
    }
    @Override
    public RedditorPostHistory updateHot()  {
        return (RedditorPostHistory) super.updateHot();
    }
    @Override
    public RedditorPostHistory updateTop()  {
        return (RedditorPostHistory) super.updateTop();
    }
    @Override
    public RedditorPostHistory updateRising()  {
        return (RedditorPostHistory) super.updateRising();
    }
    @Override
    public RedditorPostHistory updateControversial()  {
        return (RedditorPostHistory) super.updateControversial();
    }

    @Override
    public RedditorPostHistory updateNew(int size)  {
        newPosts = new LinkedList<>();
        return updateRecursive(size, "",
                newPosts, NewPostsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditorPostHistory updateHot(int size)  {
        hotPosts = new LinkedList<>();
        return updateRecursive(size, "",
                hotPosts, HotPostsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditorPostHistory updateTop(int size)  {
        topPosts = new LinkedList<>();
        return updateRecursive(size, "",
                topPosts, TopPostsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));

    }

    @Override
    public RedditorPostHistory updateRising(int size)  {
        risingPosts = new LinkedList<>();
        return updateRecursive(size, "",
                risingPosts, RisingPostsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));

    }

    @Override
    public RedditorPostHistory updateControversial(int size)  {
        controversialPosts = new LinkedList<>();
        return updateRecursive(size, "",
                controversialPosts, ControversialPostsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));

    }
}
