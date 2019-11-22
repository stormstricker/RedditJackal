package redditjackal.entities;

import redditjackal.history.CommentHistory;
import redditjackal.history.PostHistory;

public abstract class Actor {
        protected Reddit reddit;
        public abstract String getName();
        public abstract CommentHistory commentHistory();
        public abstract PostHistory postHistory();

        public Reddit getReddit() {
                return reddit;
        }

        public void setReddit(Reddit reddit) {
                this.reddit = reddit;
        }
}
