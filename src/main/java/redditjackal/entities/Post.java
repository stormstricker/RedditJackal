package redditjackal.entities;

import redditjackal.jsonhandlers.listings.subreddit.*;

import java.util.List;

public class Post extends Thing {
    private PostsListingDataJson dataJson;
   /* private ArrayList<Comment> comments; //would probably need a tree structure

    public void setComments(ArrayList<Comment> comments)  {
        this.comments = comments;
    }
    public ArrayList<Comment> getComments()  {return comments;}*/

   //to make backwards-compatible
    public String getBody()  {
        if (getSelftext()!=null)  {
            return getSelftext();
        }

        return "";
    }

    public String getLink()  {return "https://www.reddit.com" + getPermalink();}

    public Post(Redditor author, PostsListingDataJson dataJson) {
        super(author);
        this.dataJson = dataJson;
    }

    public Post(Subreddit subreddit, PostsListingDataJson dataJson)  {
        super(subreddit);
        this.dataJson = dataJson;
    }

    //AUTOGEN
    public String getAfter() {
        return dataJson.getAfter();
    }

    public List<Object> getAllAwardings() {
        return dataJson.getAllAwardings();
    }

    public Boolean getAllowLiveComments() {
        return dataJson.getAllowLiveComments();
    }

    public Object getApprovedAtUtc() {
        return dataJson.getApprovedAtUtc();
    }

    public Object getApprovedBy() {
        return dataJson.getApprovedBy();
    }

    public Boolean getArchived() {
        return dataJson.getArchived();
    }

    //fixed override
    public String getAuthorName() {
        return dataJson.getAuthor();
    }

    public Object getAuthorFlairBackgroundColor() {
        return dataJson.getAuthorFlairBackgroundColor();
    }

    public Object getAuthorFlairCssClass() {
        return dataJson.getAuthorFlairCssClass();
    }

    public List<Object> getAuthorFlairRichtext() {
        return dataJson.getAuthorFlairRichtext();
    }

    public Object getAuthorFlairTemplateId() {
        return dataJson.getAuthorFlairTemplateId();
    }

    public Object getAuthorFlairText() {
        return dataJson.getAuthorFlairText();
    }

    public Object getAuthorFlairTextColor() {
        return dataJson.getAuthorFlairTextColor();
    }

    public String getAuthorFlairType() {
        return dataJson.getAuthorFlairType();
    }

    public String getAuthorFullname() {
        return dataJson.getAuthorFullname();
    }

    public Boolean getAuthorPatreonFlair() {
        return dataJson.getAuthorPatreonFlair();
    }

    public List<Object> getAwarders() {
        return dataJson.getAwarders();
    }

    public Object getBannedAtUtc() {
        return dataJson.getBannedAtUtc();
    }

    public Object getBannedBy() {
        return dataJson.getBannedBy();
    }

    public Object getBefore() {
        return dataJson.getBefore();
    }

    public Boolean getCanGild() {
        return dataJson.getCanGild();
    }

    public Boolean getCanModPost() {
        return dataJson.getCanModPost();
    }

    public Object getCategory() {
        return dataJson.getCategory();
    }

    public List<PostsListingChildJson> getChildren() {
        return dataJson.getChildren();
    }

    public Boolean getClicked() {
        return dataJson.getClicked();
    }

    public Object getContentCategories() {
        return dataJson.getContentCategories();
    }

    public Boolean getContestMode() {
        return dataJson.getContestMode();
    }

    public Long getCreated() {
        return dataJson.getCreated();
    }

    public Long getCreatedUtc() {
        return dataJson.getCreatedUtc();
    }

    public Object getDiscussionType() {
        return dataJson.getDiscussionType();
    }

    public Long getDist() {
        return dataJson.getDist();
    }

    public Object getDistinguished() {
        return dataJson.getDistinguished();
    }

    public String getDomain() {
        return dataJson.getDomain();
    }

    public Long getDowns() {
        return dataJson.getDowns();
    }

    public Object getEdited() {
        return dataJson.getEdited();
    }

    public Long getGilded() {
        return dataJson.getGilded();
    }

    public PostsListingGildingsJson getGildings() {
        return dataJson.getGildings();
    }

    public Boolean getHidden() {
        return dataJson.getHidden();
    }

    public Boolean getHideScore() {
        return dataJson.getHideScore();
    }

    public String getId() {
        return dataJson.getId();
    }

    public Boolean getIsCrosspostable() {
        return dataJson.getIsCrosspostable();
    }

    public Boolean getIsMeta() {
        return dataJson.getIsMeta();
    }

    public Boolean getIsOriginalContent() {
        return dataJson.getIsOriginalContent();
    }

    public Boolean getIsRedditMediaDomain() {
        return dataJson.getIsRedditMediaDomain();
    }

    public Boolean getIsRobotIndexable() {
        return dataJson.getIsRobotIndexable();
    }

    public Boolean getIsSelf() {
        return dataJson.getIsSelf();
    }

    public Boolean getIsVideo() {
        return dataJson.getIsVideo();
    }

    public Object getLikes() {
        return dataJson.getLikes();
    }

    public String getLinkFlairBackgroundColor() {
        return dataJson.getLinkFlairBackgroundColor();
    }

    public Object getLinkFlairCssClass() {
        return dataJson.getLinkFlairCssClass();
    }

    public List<Object> getLinkFlairRichtext() {
        return dataJson.getLinkFlairRichtext();
    }

    public Object getLinkFlairText() {
        return dataJson.getLinkFlairText();
    }

    public String getLinkFlairTextColor() {
        return dataJson.getLinkFlairTextColor();
    }

    public String getLinkFlairType() {
        return dataJson.getLinkFlairType();
    }

    public Boolean getLocked() {
        return dataJson.getLocked();
    }

    public Object getMedia() {
        return dataJson.getMedia();
    }

    public PostsListingMediaEmbedJson getMediaEmbed() {
        return dataJson.getMediaEmbed();
    }

    public Boolean getMediaOnly() {
        return dataJson.getMediaOnly();
    }

    public Object getModNote() {
        return dataJson.getModNote();
    }

    public Object getModReasonBy() {
        return dataJson.getModReasonBy();
    }

    public Object getModReasonTitle() {
        return dataJson.getModReasonTitle();
    }

    public List<Object> getModReports() {
        return dataJson.getModReports();
    }

    public Object getModhash() {
        return dataJson.getModhash();
    }

    public String getName() {
        return dataJson.getName();
    }

    public Boolean getNoFollow() {
        return dataJson.getNoFollow();
    }

    public Long getNumComments() {
        return dataJson.getNumComments();
    }

    public Long getNumCrossposts() {
        return dataJson.getNumCrossposts();
    }

    public Object getNumReports() {
        return dataJson.getNumReports();
    }

    public Boolean getOver18() {
        return dataJson.getOver18();
    }

    public String getParentWhitelistStatus() {
        return dataJson.getParentWhitelistStatus();
    }

    public String getPermalink() {
        return dataJson.getPermalink();
    }

    public Boolean getPinned() {
        return dataJson.getPinned();
    }

    public Long getPwls() {
        return dataJson.getPwls();
    }

    public Boolean getQuarantine() {
        return dataJson.getQuarantine();
    }

    public Object getRemovalReason() {
        return dataJson.getRemovalReason();
    }

    public Object getRemovedBy() {
        return dataJson.getRemovedBy();
    }

    public Object getReportReasons() {
        return dataJson.getReportReasons();
    }

    public Boolean getSaved() {
        return dataJson.getSaved();
    }

    public Long getScore() {
        return dataJson.getScore();
    }

    public Object getSecureMedia() {
        return dataJson.getSecureMedia();
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return dataJson.getSecureMediaEmbed();
    }

    public String getSelftext() {
        return dataJson.getSelftext();
    }

    public Object getSelftextHtml() {
        return dataJson.getSelftextHtml();
    }

    public Boolean getSendReplies() {
        return dataJson.getSendReplies();
    }

    public Boolean getSpoiler() {
        return dataJson.getSpoiler();
    }

    public List<Object> getStewardReports() {
        return dataJson.getStewardReports();
    }

    public Boolean getStickied() {
        return dataJson.getStickied();
    }

    //fixed override
    public String getSubredditName() {
        return dataJson.getSubreddit();
    }

    public String getSubredditId() {
        return dataJson.getSubredditId();
    }

    public String getSubredditNamePrefixed() {
        return dataJson.getSubredditNamePrefixed();
    }

    public Long getSubredditSubscribers() {
        return dataJson.getSubredditSubscribers();
    }

    public String getSubredditType() {
        return dataJson.getSubredditType();
    }

    public Object getSuggestedSort() {
        return dataJson.getSuggestedSort();
    }

    public String getThumbnail() {
        return dataJson.getThumbnail();
    }

    public String getTitle() {
        return dataJson.getTitle();
    }

    public Long getTotalAwardsReceived() {
        return dataJson.getTotalAwardsReceived();
    }

    public Long getUps() {
        return dataJson.getUps();
    }

    public String getUrl() {
        return dataJson.getUrl();
    }

    public List<Object> getUserReports() {
        return dataJson.getUserReports();
    }

    public Object getViewCount() {
        return dataJson.getViewCount();
    }

    public Boolean getVisited() {
        return dataJson.getVisited();
    }

    public String getWhitelistStatus() {
        return dataJson.getWhitelistStatus();
    }

    public Long getWls() {
        return dataJson.getWls();
    }
}