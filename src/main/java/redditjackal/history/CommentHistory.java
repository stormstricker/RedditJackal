package redditjackal.history;

import redditjackal.entities.Actor;
import redditjackal.entities.Comment;

import java.util.LinkedList;

public abstract class CommentHistory extends RedditHistory {
    protected LinkedList<Comment> newComments;
    protected LinkedList<Comment> hotComments;
    protected LinkedList<Comment> topComments;
    protected LinkedList<Comment> risingComments;
    protected LinkedList<Comment> controversialComments;

    @Override
    public void clear()  {
        newComments = new LinkedList<>();
        hotComments = new LinkedList<>();
        topComments = new LinkedList<>();
        risingComments = new LinkedList<>();
        controversialComments = new LinkedList<>();
    }

    public CommentHistory(Actor actor)  {super(actor);}

    public LinkedList<Comment> getComments()  {return newComments;}

    public int sizeNew()  {
        return newComments.size();
    }

    public int sizeHot() {
        return hotComments.size();
    }

    public int sizeTop() {
        return topComments.size();
    }

    public int sizeRising() {
        return risingComments.size();
    }

    public int sizeControversial() {
        return controversialComments.size();
    }

    //getters
    public LinkedList<Comment> getNewComments() {
        return newComments;
    }

    public LinkedList<Comment> getHotComments() {
        return hotComments;
    }

    public LinkedList<Comment> getTopComments() {
        return topComments;
    }

    public LinkedList<Comment> getRisingComments() {
        return risingComments;
    }

    public LinkedList<Comment> getControversialComments() {
        return controversialComments;
    }
}
