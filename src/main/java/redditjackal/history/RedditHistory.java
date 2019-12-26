package redditjackal.history;

import redditjackal.entities.Actor;
import redditjackal.utils.JackalUtils;

public abstract class RedditHistory {
    public abstract RedditHistory updateNew(int size);
    public abstract RedditHistory updateHot(int size);
    public abstract RedditHistory updateTop(int size);
    public abstract RedditHistory updateRising(int size);
    public abstract RedditHistory updateControversial(int size);

    public abstract void clear();

    public RedditHistory updateNew()  {
        return updateNew(1000);
    }
    public RedditHistory updateHot()  {
        return updateHot(1000);
    }
    public RedditHistory updateTop()  {
        return updateTop(1000);
    }
    public RedditHistory updateRising()  {
        return updateRising(1000);
    }
    public RedditHistory updateControversial()  {
        return updateControversial(1000);
    }

    public abstract RedditHistory updateFrom(int size, String name);
    public abstract RedditHistory updateTo(int size, String name);

    //Redditor or Subreddit
    protected Actor actor;
    public RedditHistory(Actor actor)  {this.actor = actor;}

    public RedditHistory update(int size)  {
        updateNew(size);
        updateHot(size);
        updateRising(size);
        updateTop(size);
        updateControversial(size);
        return this;
    }

    public RedditHistory update()  {
        updateNew();
        updateHot();
        updateRising();
        updateTop();
        updateControversial();
        return this;
    }

    public int size()  {
        return JackalUtils.max(sizeNew(), sizeHot(), sizeTop(), sizeRising(), sizeControversial());
    }

    public abstract int sizeNew();
    public abstract int sizeHot();
    public abstract int sizeTop();
    public abstract int sizeRising();
    public abstract int sizeControversial();
}
