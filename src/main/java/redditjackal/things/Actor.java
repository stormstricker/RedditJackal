package redditjackal.things;

import java.util.Collection;

public interface Actor {
        String getName();
        CommentHistory commentHistory();
        PostHistory postHistory();
}
