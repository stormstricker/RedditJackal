package redditjackal.things;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class PostHistory extends RedditHistory  {
    String subtype = "hot";
    private LinkedList<Post> posts;

    //constructor
    PostHistory(Actor actor)  {
        super(actor, "posts");

        posts = new LinkedList<>();
    }

    PostHistory(Actor actor, LinkedList<Post> posts)  {
        super(actor, "posts");
        this.posts = posts;
    }


    public PostHistory updateFrom(int total, String firstId) throws Exception  {
        posts = (LinkedList<Post>) updateThings(total, firstId, "");

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public PostHistory updateTo(int total, String lastId) throws Exception  {
        posts = (LinkedList<Post>) updateThings(1000,  "", lastId);

        System.out.println("comments size: " + posts.size());

        posts = new LinkedList(posts.subList(posts.size()- Math.min(total, posts.size()), posts.size()));

        System.out.println("new comments: ");
        for (Post comment: posts)  {
            System.out.println(comment);
        }

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public PostHistory updateTo(String lastId) throws Exception {
        posts.addAll(0, (LinkedList<Post>) updateThings(1000,  "", lastId));

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public PostHistory update() throws Exception  {
        if (posts==null || posts.size()==0) {
            update(1000);
        }
        else if (posts.size()!=0)  {
            updateTo(posts.get(0).getId());
        }

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    public PostHistory update(int total) throws Exception  {
        posts = (LinkedList<Post>) updateThings(total, "", "");

        calculateFrequencies();

        if (actor instanceof Redditor) {
            ((Redditor) actor).subredditHistory().update(this);
        }

        return this;
    }

    //abstract
    public boolean isEmpty()  {return posts.size()==0;}

    public int size()  {return posts.size();}

    public LinkedHashMap<String, Long> calculateFrequencies()  {
        frequencies = calculateFrequencies(posts);

        System.out.println(frequencies);

        return frequencies;
    }

    public void clear()  {posts = new LinkedList<>();}

    //getters
    public LinkedList<Post> getPosts()  {return posts;}
}
