package redditjackal.history.redditor;

import redditjackal.entities.Comment;
import redditjackal.entities.Redditor;
import redditjackal.entities.Thing;
import redditjackal.history.CommentHistory;
import redditjackal.history.RedditHistory;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsChildJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsDataJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingChildJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.listings.redditor.comments.*;

import java.util.LinkedList;
import java.util.List;

public class RedditorCommentHistory extends CommentHistory {
    private Redditor redditor = (Redditor) actor;
    public Redditor getRedditor()  {return redditor;}

    public RedditorCommentHistory(Redditor redditor)  {super(redditor);}

    @Override
    public RedditorCommentHistory update()  {
        return (RedditorCommentHistory) super.update();
    }
    @Override
    public RedditorCommentHistory update(int size)  {return (RedditorCommentHistory) super.update(size);}

    //TODO
    @Override
    public RedditorCommentHistory updateFrom(int size, String name) {return this;}
    @Override
    public RedditorCommentHistory updateTo(int size, String name)  {return this;}

    //FastFood2.Builder<? extends FastFood2.Builder<?>>
    public RedditorCommentHistory updateRecursive(int left, String after, List<Comment> results,
                    AbstractRedditorCommentsRequest.Builder<? extends AbstractRedditorCommentsRequest.Builder<?>> builder)  {
        AbstractRedditorCommentsRequest request;
        if (left<=100)  {
            request= builder.setLimit(left).setAfter(after).build();

            RedditorCommentsJson comments = request.execute();
            for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
                results.add(new Comment(redditor, comment.getData()));
            }

            return this;
        }
        else  {
            request = builder.setLimit(100).setAfter(after).build();
            RedditorCommentsJson comments = request.execute();
            for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
                results.add(new Comment(redditor, comment.getData()));
            }

            return updateRecursive(left-100, results.get(results.size()-1).getAfter(),
                    results, builder);
        }
    }

    @Override
    public RedditorCommentHistory updateNew(int size)  {
        newComments = new LinkedList<>();
        return updateRecursive(size, "",
                newComments, NewCommentsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditHistory updateHot(int size) {
        hotComments = new LinkedList<>();
        HotCommentsRedditorRequest request = HotCommentsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        RedditorCommentsJson comments = request.execute();
        for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
            hotComments.add(new Comment(redditor, comment.getData()));
        }

        return this;
    }

    @Override
    public RedditHistory updateTop(int size) {
        topComments = new LinkedList<>();

        TopCommentsRedditorRequest request = TopCommentsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        RedditorCommentsJson comments = request.execute();
        for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
            topComments.add(new Comment(redditor, comment.getData()));
        }

        return this;
    }

    @Override
    public RedditHistory updateRising(int size) {
        risingComments = new LinkedList<>();

        RisingCommentsRedditorRequest request = RisingCommentsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        RedditorCommentsJson comments = request.execute();
        for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
            risingComments.add(new Comment(redditor, comment.getData()));
        }

        return this;
    }

    @Override
    public RedditHistory updateControversial(int size) {
        controversialComments = new LinkedList<>();

        ControversialCommentsRedditorRequest request = ControversialCommentsRedditorRequest.builder(redditor.getName(),
                redditor.getReddit().getAccessToken()).setLimit(size).build();

        RedditorCommentsJson comments = request.execute();
        for (RedditorCommentsChildJson comment: comments.getData().getChildren())  {
            controversialComments.add(new Comment(redditor, comment.getData()));
        }

        return this;
    }
}

