package redditjackal.history;

import redditjackal.entities.Actor;
import redditjackal.entities.Post;

import java.util.LinkedList;

public abstract class PostHistory extends RedditHistory {
    protected LinkedList<Post> newPosts;
    protected LinkedList<Post> hotPosts;
    protected LinkedList<Post> topPosts;
    protected LinkedList<Post> risingPosts;
    protected LinkedList<Post> controversialPosts;

    @Override
    public void clear()  {
        newPosts = new LinkedList<>();
        hotPosts = new LinkedList<>();
        topPosts = new LinkedList<>();
        risingPosts = new LinkedList<>();
        controversialPosts = new LinkedList<>();
    }

    public PostHistory(Actor actor)  {super(actor);}

    public LinkedList<Post> getPosts()  {return newPosts;}

    public int sizeNew()  {
        return newPosts.size();
    }

    public int sizeHot() {
        return hotPosts.size();
    }

    public int sizeTop() {
        return topPosts.size();
    }

    public int sizeRising() {
        return risingPosts.size();
    }

    public int sizeControversial() {
        return controversialPosts.size();
    }

    //getters
    public LinkedList<Post> getNewPosts() {
        return newPosts;
    }

    public LinkedList<Post> getHotPosts() {
        return hotPosts;
    }

    public LinkedList<Post> getTopPosts() {
        return topPosts;
    }

    public LinkedList<Post> getRisingPosts() {
        return risingPosts;
    }

    public LinkedList<Post> getControversialPosts() {
        return controversialPosts;
    }
}
