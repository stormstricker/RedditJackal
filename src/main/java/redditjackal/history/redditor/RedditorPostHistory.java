package redditjackal.history.redditor;

import redditjackal.entities.Post;
import redditjackal.entities.Redditor;
import redditjackal.history.PostHistory;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingChildJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingDataJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.listings.redditor.posts.*;

import java.util.LinkedList;

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

    @Override
    public PostHistory updateNew(int size)  {
        newPosts = new LinkedList<>();

        NewPostsRedditorRequest newRequest = NewPostsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = newRequest.execute();
        for (PostsListingChildJson postChild: posts.getData().getChildren())  {
            newPosts.add(new Post(redditor, postChild.getData()));
        }

        return this;
    }

    @Override
    public PostHistory updateHot(int size)  {
        hotPosts = new LinkedList<>();

        HotPostsRedditorRequest hotRequest = HotPostsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = hotRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            hotPosts.add(new Post(redditor, post.getData()));
        }

        return this;
    }

    @Override
    public PostHistory updateTop(int size)  {
        topPosts = new LinkedList<>();

        TopPostsRedditorRequest topRequest = TopPostsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = topRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            topPosts.add(new Post(redditor, post.getData()));
        }

        return this;
    }

    @Override
    public PostHistory updateRising(int size)  {
        risingPosts = new LinkedList<>();

        RisingPostsRedditorRequest risingRequest = RisingPostsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = risingRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            risingPosts.add(new Post(redditor, post.getData()));
        }

        return this;
    }

    @Override
    public PostHistory updateControversial(int size)  {
        controversialPosts = new LinkedList<>();

        ControversialPostsRedditorRequest controRequest = ControversialPostsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = controRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            controversialPosts.add(new Post(redditor, post.getData()));
        }

        return this;
    }
}
