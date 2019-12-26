package redditjackal.history.redditor;

import redditjackal.entities.Comment;
import redditjackal.entities.Redditor;
import redditjackal.history.CommentHistory;
import redditjackal.history.RedditHistory;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsChildJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsJson;
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

    public RedditorCommentHistory updateNew()  {
        return (RedditorCommentHistory) super.updateNew();
    }
    @Override
    public RedditorCommentHistory updateHot()  {
        return (RedditorCommentHistory) super.updateHot();
    }
    @Override
    public RedditorCommentHistory updateTop()  {
        return (RedditorCommentHistory) super.updateTop();
    }
    @Override
    public RedditorCommentHistory updateRising()  {
        return (RedditorCommentHistory) super.updateRising();
    }
    @Override
    public RedditorCommentHistory updateControversial()  {
        return (RedditorCommentHistory) super.updateControversial();
    }

    public RedditorCommentHistory updateRecursive(int left, String after, List<Comment> results,
                    AbstractRedditorCommentsRequest.Builder<? extends AbstractRedditorCommentsRequest.Builder<?>> builder)  {
        AbstractRedditorCommentsRequest request;
        builder = builder.builder();
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

            return updateRecursive(left-100, results.get(results.size()-1).getName(),
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
        return updateRecursive(size, "",
                hotComments, HotCommentsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditHistory updateTop(int size) {
        topComments = new LinkedList<>();
        return updateRecursive(size, "",
                topComments, TopCommentsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditHistory updateRising(int size) {
        risingComments = new LinkedList<>();
        return updateRecursive(size, "",
                risingComments, RisingCommentsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }

    @Override
    public RedditHistory updateControversial(int size) {
        controversialComments = new LinkedList<>();
        return updateRecursive(size, "",
                controversialComments, ControversialCommentsRedditorRequest.builder(redditor.getName(), redditor.getReddit().getAccessToken()));
    }
}

