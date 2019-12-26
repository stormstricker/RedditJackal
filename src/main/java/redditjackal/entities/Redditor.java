package redditjackal.entities;

import redditjackal.exceptions.RedditorNotFoundException;
import redditjackal.history.redditor.RedditorCommentHistory;
import redditjackal.history.redditor.RedditorPostHistory;
import redditjackal.jsonhandlers.redditor.AboutRedditorDataJson;
import redditjackal.jsonhandlers.redditor.AboutRedditorJson;
import redditjackal.jsonhandlers.redditor.AboutRedditorSubredditJson;
import redditjackal.requests.inbox.interfaces.Mailable;
import redditjackal.requests.redditor.AboutRedditorRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TODO: check if user is deleted

public class Redditor extends Actor implements Mailable {
    AboutRedditorJson aboutJson;

    RedditorCommentHistory commentHistory;
    RedditorPostHistory postHistory;
    //SubredditHistory subredditHistory;

    private String link;

    private String username;
    private long reputation;
    //date

    //from Actor
    @Override
    public RedditorCommentHistory commentHistory()  {return commentHistory;}
    @Override
    public RedditorPostHistory postHistory()  {return postHistory;}

    private HashMap<String, String> flairs;

    private ArrayList<String> interests;
    private ArrayList<String> favSubreddits;

    @Override
    public void sendPrivateMessage(String subject, String text)  {
        reddit.getMe().sendPrivateMessage(subject, text, username);
    }

    @Override
    public void sendPrivateMessage(String subject, String text, String fr_sr)  {
        reddit.getMe().sendPrivateMessage(subject, text, username, fr_sr);
    }



    private AboutRedditorSubredditJson getAboutRedditorSubredditJson() {
        return getAboutRedditorDataJson().getAboutRedditorSubredditJson();
    }

    //autogen from subreddit
    public String getBannerImg() {
        return getAboutRedditorSubredditJson().getBannerImg();
    }

    public Object getBannerSize() {
        return getAboutRedditorSubredditJson().getBannerSize();
    }

    public String getCommunityIcon() {
        return getAboutRedditorSubredditJson().getCommunityIcon();
    }

    public Boolean getDefaultSet() {
        return getAboutRedditorSubredditJson().getDefaultSet();
    }

    public String getDescription() {
        System.out.println();
        return getAboutRedditorSubredditJson().getDescription();
    }

    public Boolean getDisableContributorRequests() {
        return getAboutRedditorSubredditJson().getDisableContributorRequests();
    }

    public String getDisplayName() {
        return getAboutRedditorSubredditJson().getDisplayName();
    }

    public String getDisplayNamePrefixed() {
        return getAboutRedditorSubredditJson().getDisplayNamePrefixed();
    }

    public Boolean getFreeFormReports() {
        return getAboutRedditorSubredditJson().getFreeFormReports();
    }

    public Object getHeaderImg() {
        return getAboutRedditorSubredditJson().getHeaderImg();
    }

    public Object getHeaderSize() {
        return getAboutRedditorSubredditJson().getHeaderSize();
    }

    public String getIconColor() {
        return getAboutRedditorSubredditJson().getIconColor();
    }

    //autogen delegates
    private AboutRedditorDataJson getAboutRedditorDataJson() {
        return getAboutJson().getAboutRedditorDataJson();
    }

    private AboutRedditorJson getAboutJson() {
        if (aboutJson==null)  {
            AboutRedditorRequest.Builder builder = AboutRedditorRequest.builder(username, reddit.getAccessToken());
            AboutRedditorRequest request = builder.build();
            try  {
                this.aboutJson = request.execute();
            }
            catch (RedditorNotFoundException e)  {
                e.printStackTrace();
            }
        }

        return aboutJson;
    }

    public String getKind() {
        return getAboutJson().getKind();
    }

    public Long getCommentKarma() {
        return getAboutRedditorDataJson().getCommentKarma();
    }

    public Long getCreated() {
        return getAboutRedditorDataJson().getCreated();
    }

    public Long getCreatedUtc() {
        return getAboutRedditorDataJson().getCreatedUtc();
    }

    public Boolean getHasSubscribed() {
        return getAboutRedditorDataJson().getHasSubscribed();
    }

    public Boolean getHasVerifiedEmail() {
        return getAboutRedditorDataJson().getHasVerifiedEmail();
    }

    public Boolean getHideFromRobots() {
        return getAboutRedditorDataJson().getHideFromRobots();
    }

    public String getIconImg() {
        return getAboutRedditorDataJson().getIconImg();
    }

    public List<Long> getIconSize() {
        return getAboutRedditorSubredditJson().getIconSize();
    }

    public Boolean getIsDefaultBanner() {
        return getAboutRedditorSubredditJson().getIsDefaultBanner();
    }

    public Boolean getIsDefaultIcon() {
        return getAboutRedditorSubredditJson().getIsDefaultIcon();
    }

    public String getKeyColor() {
        return getAboutRedditorSubredditJson().getKeyColor();
    }

    public Boolean getLinkFlairEnabled() {
        return getAboutRedditorSubredditJson().getLinkFlairEnabled();
    }

    public String getLinkFlairPosition() {
        return getAboutRedditorSubredditJson().getLinkFlairPosition();
    }

    public String getId() {
        return getAboutRedditorDataJson().getId();
    }

    public Boolean getIsEmployee() {
        return getAboutRedditorDataJson().getIsEmployee();
    }

    public Boolean getIsFriend() {
        return getAboutRedditorDataJson().getIsFriend();
    }

    public Boolean getIsGold() {
        return getAboutRedditorDataJson().getIsGold();
    }

    public Boolean getIsMod() {
        return getAboutRedditorDataJson().getIsMod();
    }

    public Long getLinkKarma() {
        return getAboutRedditorDataJson().getLinkKarma();
    }


    //getters
    public ArrayList<String> getInterests()  {
        return interests;
    }
    public ArrayList<String> getFavSubreddits()  {
        return favSubreddits;
    }
    public HashMap<String, String> getFlairs()  {
        return flairs;
    }
    public String getName()  {
        return username;
    }

    public Boolean getOver18() {
        return getAboutRedditorSubredditJson().getOver18();
    }

    public String getPrimaryColor() {
        return getAboutRedditorSubredditJson().getPrimaryColor();
    }

    public String getPublicDescription() {
        return getAboutRedditorSubredditJson().getPublicDescription();
    }

    public Boolean getRestrictCommenting() {
        return getAboutRedditorSubredditJson().getRestrictCommenting();
    }

    public Boolean getRestrictPosting() {
        return getAboutRedditorSubredditJson().getRestrictPosting();
    }

    public Boolean getShowMedia() {
        return getAboutRedditorSubredditJson().getShowMedia();
    }

    public String getSubmitLinkLabel() {
        return getAboutRedditorSubredditJson().getSubmitLinkLabel();
    }

    public String getSubmitTextLabel() {
        return getAboutRedditorSubredditJson().getSubmitTextLabel();
    }

    public String getSubredditType() {
        return getAboutRedditorSubredditJson().getSubredditType();
    }

    public Long getSubscribers() {
        return getAboutRedditorSubredditJson().getSubscribers();
    }

    public String getTitle() {
        return getAboutRedditorSubredditJson().getTitle();
    }

    public String getUrl() {
        return getAboutRedditorSubredditJson().getUrl();
    }

    public Boolean getUserIsBanned() {
        return getAboutRedditorSubredditJson().getUserIsBanned();
    }

    public Boolean getUserIsContributor() {
        return getAboutRedditorSubredditJson().getUserIsContributor();
    }

    public Boolean getUserIsModerator() {
        return getAboutRedditorSubredditJson().getUserIsModerator();
    }

    public Boolean getUserIsMuted() {
        return getAboutRedditorSubredditJson().getUserIsMuted();
    }

    public Boolean getUserIsSubscriber() {
        return getAboutRedditorSubredditJson().getUserIsSubscriber();
    }

    public Boolean getPrefShowSnoovatar() {
        return getAboutRedditorDataJson().getPrefShowSnoovatar();
    }

    public Boolean getVerified() {
        return getAboutRedditorDataJson().getVerified();
    }

    public String getLink()  {
        return link;
    }

    //setters
    public void setInterests(ArrayList<String> interests)  {
        this.interests = interests;
    }
    public void setFavSubreddits(ArrayList<String> favSubreddits)  {
        this.favSubreddits = favSubreddits;
    }
    public void setFlairs(HashMap<String, String> flairs)  {
        this.flairs = flairs;
    }
    public void setLink(String link)  {
        this.link = link;
    }
    public void setUsername(String username)  {
        this.username = username;
    }

    public boolean collectFlairs()  {
        boolean result = false;

        if (commentHistory.size()!=0)  {
            for (Comment comment: commentHistory.getComments())  {
               /* if (!comment.getAuthorFlair().equals("") && !flairs.containsKey(comment.getAuthorFlair()))  {
                    flairs.put(comment.getAuthorFlair(), comment.getSubreddit().getName());

                    result = true;
                }*/
            }
        }

        return result;
    }


    //constructors
     Redditor(Reddit reddit, String username) throws RedditorNotFoundException  {
        this.reddit = reddit;
        this.commentHistory = new RedditorCommentHistory(this);
        this.postHistory = new RedditorPostHistory(this);

       /* try  {
            this.subredditHistory = new SubredditHistory(this, commentHistory, postHistory);
        }
        catch (Exception e)  {
            System.out.println(("something went wrong"));
        }*/

        flairs = new HashMap<>();

        this.username = username;
        link = "http://reddit.com/user/"+username;
    }

    public String toString()  {
        return username;
    }

}