package redditjackal.entities;

import org.json.JSONArray;
import org.json.JSONObject;
import redditjackal.requests.RedditRequest;

import java.net.URLEncoder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public abstract class Thing {
    public static enum THING_TYPE {COMMENT, POST};
    protected Reddit reddit;
    protected Subreddit subreddit;
    protected Redditor author;

    protected Time time;
    protected String authorFlair="";

    public Thing(Redditor author)  {
        this.reddit = author.getReddit();
        this.author = author;
    }

    public Thing(Subreddit subreddit)  {
        this.subreddit = subreddit;
        this.reddit = subreddit.getReddit();
    }



    public abstract String getName();

    public class Time  {
        private long seconds;
        private long minutes;
        private long hours;
        private long days;
        private long months;
        private long years;

        private String timeString="";

        public String toString()  {
            String result = "";

            if (years>0)  {
                result = years + (years>1 ? " years" : " year") +" ago";
            }
            else if (months>0)  {
                result = months + (months>1 ? " months" : " month") +" ago";
            }
            else if (days>0)  {
                result = days + (days>1 ? " days" : " day") +" ago";
            }
            else if (hours>0)  {
                if (minutes>0)  {
                    result = hours + "h" + minutes + "m" + " ago";
                }
                else  {
                    result = hours + (hours>1 ? " hours" : " hour") +" ago";
                }
            }
            else if (minutes>0)  {
                result = minutes + (minutes>1 ? " minutes" : " minute") +" ago";
            }
            else if (seconds>0)  {
                result = seconds + (seconds>1 ? " seconds" : " second") +" ago";
            }
            else  {
                result = "now";
            }

            return result;
        }

        public Time(double unixSeconds)  {
            Instant now = Instant.now();
            Instant ago = Instant.ofEpochSecond((long) unixSeconds);

            long passedSeconds = ChronoUnit.SECONDS.between(
                    ago.atZone(ZoneId.systemDefault()),
                    now.atZone(ZoneId.systemDefault()));

            //start
            LocalDateTime fromDateTime = LocalDateTime.ofInstant(ago, ZoneOffset.UTC);
            LocalDateTime toDateTime = LocalDateTime.ofInstant(now, ZoneOffset.UTC);
            LocalDateTime tempDateTime = LocalDateTime.from( fromDateTime );

            years = tempDateTime.until( toDateTime, ChronoUnit.YEARS);
            tempDateTime = tempDateTime.plusYears( years );
            months = tempDateTime.until( toDateTime, ChronoUnit.MONTHS);
            tempDateTime = tempDateTime.plusMonths( months );
            days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);
            tempDateTime = tempDateTime.plusDays( days );
            hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS);
            tempDateTime = tempDateTime.plusHours( hours );
            minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES);
            tempDateTime = tempDateTime.plusMinutes( minutes );
            seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS);

            System.out.println( years + " years " +
                    months + " months " +
                    days + " days " +
                    hours + " hours " +
                    minutes + " minutes " +
                    seconds + " seconds.");
                    //prints: 29 years 8 months 24 days 22 hours 54 minutes 50 seconds.
            //end
        }


        public long getSeconds() {
            return seconds;
        }

        public long getHours() {
            return hours;
        }

        public long getDays() {
            return days;
        }

        public long getMonths() {
            return months;
        }

        public long getYears() {
            return years;
        }
    }

    public void reply(String text) throws Exception  {
        String link = "https://oauth.reddit.com/api/comment?api_type=json&thing_id="  + getName()  +"&text=" + URLEncoder.encode(text, "utf-8");
        RedditRequest request = new RedditRequest(link, reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.POST);
        String response = request.send().getResponse();
        System.out.println(response);

        JSONObject jsonArray = new JSONObject(response);
        JSONArray things = (JSONArray) ((JSONObject) ((JSONObject) jsonArray.get("json")).get("data")).get("things");

        /*Comment result = new Comment(reddit, (JSONObject) ((JSONObject) things.get(0)).get("data"));
        return result;*/
    }

    //setters
    public void setTime(Time time) {
        this.time = time;
    }
    public void setReddit(Reddit reddit) {
        this.reddit = reddit;
    }
    public void setAuthor(Redditor author)  {this.author = author;}

    //getters
    public Reddit getReddit() {
        return reddit;
    }
    public Subreddit getSubreddit()  {
        return subreddit;
    }
    public Redditor getAuthor()  {
        return author;
    }

    public Time getTime() {
        return time;
    }
/*
    public String toString()  {
        return subreddit + "=> " + score + "=>" + author + ": " + body;
    }*/


}

/*

t1_	Comment
t2_	Account
t3_	Link
t4_	Message
t5_	AboutRedditorSubredditJson
t6_	Award

 */