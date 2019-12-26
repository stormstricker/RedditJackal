package redditjackal.history.subreddit;

import redditjackal.entities.Actor;
import redditjackal.entities.Post;
import redditjackal.entities.Subreddit;
import redditjackal.history.CommentHistory;
import redditjackal.history.RedditHistory;
import redditjackal.requests.listings.subreddit.AbstractSubredditListingRequest;

import java.util.List;

//TODO
public class SubredditCommentHistory extends CommentHistory {
    private Subreddit subreddit = (Subreddit) actor;
    public Subreddit getSubreddit()  {return subreddit;}

    public SubredditCommentHistory(Actor actor)  {super(actor);}

    @Override
    public SubredditCommentHistory update()  {
        return (SubredditCommentHistory) super.update();
    }
    @Override
    public SubredditCommentHistory update(int size)  {return (SubredditCommentHistory) super.update(size);}

    //TODO
    @Override
    public SubredditCommentHistory updateFrom(int size, String name) {return this;}
    @Override
    public SubredditCommentHistory updateTo(int size, String name)  {return this;}

    public SubredditCommentHistory updateRecursive(int left, String after, List<Post> results,
                                               AbstractSubredditListingRequest.Builder<? extends AbstractSubredditListingRequest.Builder<?>> builder)  {
        return null;
    }

    @Override
    public SubredditCommentHistory updateNew()  {
        return (SubredditCommentHistory) super.updateNew();
    }
    @Override
    public SubredditCommentHistory updateHot()  {
        return (SubredditCommentHistory) super.updateHot();
    }
    @Override
    public SubredditCommentHistory updateTop()  {
        return (SubredditCommentHistory) super.updateTop();
    }
    @Override
    public SubredditCommentHistory updateRising()  {
        return (SubredditCommentHistory) super.updateRising();
    }
    @Override
    public SubredditCommentHistory updateControversial()  {
        return (SubredditCommentHistory) super.updateControversial();
    }

    @Override
    public RedditHistory updateNew(int size) {
        return null;
    }

    @Override
    public RedditHistory updateHot(int size) {
        return null;
    }

    @Override
    public RedditHistory updateTop(int size) {
        return null;
    }

    @Override
    public RedditHistory updateRising(int size) {
        return null;
    }

    @Override
    public RedditHistory updateControversial(int size) {
        return null;
    }
}
