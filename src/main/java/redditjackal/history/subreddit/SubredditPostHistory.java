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


    //TODO: make it really update, instead of just creating a new list
    @Override
    public SubredditPostHistory updateHot(int size)  {
        hotPosts = new LinkedList<>();

        int count = 0;
        int left = size;
        String after = "";
        while (count< (size/100.0)) {
            HotPostsSubredditRequest hotRequest;
            if (left<=100) {
                hotRequest = HotPostsSubredditRequest.builder(subreddit.getName(),
                        subreddit.getReddit().getAccessToken()).setLimit(left).setAfter(after).build();
            }
            else  {
                hotRequest = HotPostsSubredditRequest.builder(subreddit.getName(),
                        subreddit.getReddit().getAccessToken()).setLimit(100).setAfter(after).build();
            }

            PostsListingJson posts = hotRequest.execute();
            for (PostsListingChildJson post : posts.getData().getChildren()) {
                hotPosts.add(new Post(getSubreddit(), post.getData()));
            }

            count++;
            left-=Math.min(100, left);
            after = hotPosts.get(hotPosts.size()-1).getName();
        }

        return this;
    }

    @Override
    public SubredditPostHistory updateNew(int size)  {
        newPosts = new LinkedList<>();

        NewPostsSubredditRequest newRequest = NewPostsSubredditRequest.builder(subreddit.getName(),
                subreddit.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = newRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            newPosts.add(new Post(subreddit, post.getData()));
        }

        return this;
    }

    @Override
    public SubredditPostHistory updateTop(int size)  {
        topPosts = new LinkedList<>();

        TopPostsSubredditRequest topRequest = TopPostsSubredditRequest.builder(subreddit.getName(),
                subreddit.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = topRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            topPosts.add(new Post(subreddit, post.getData()));
        }

        return this;
    }

    @Override
    public SubredditPostHistory updateRising(int size)  {
        risingPosts = new LinkedList<>();

        RisingPostsSubredditRequest risingRequest = RisingPostsSubredditRequest.builder(subreddit.getName(),
                subreddit.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = risingRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            risingPosts.add(new Post(subreddit, post.getData()));
        }

        return this;
    }

    @Override
    public SubredditPostHistory updateControversial(int size)  {
        controversialPosts = new LinkedList<>();

        ControversialPostsSubredditRequest controRequest = ControversialPostsSubredditRequest.builder(subreddit.getName(),
                subreddit.getReddit().getAccessToken()).setLimit(size).build();

        PostsListingJson posts = controRequest.execute();
        for (PostsListingChildJson post: posts.getData().getChildren())  {
            controversialPosts.add(new Post(subreddit, post.getData()));
        }

        return this;
    }
}
