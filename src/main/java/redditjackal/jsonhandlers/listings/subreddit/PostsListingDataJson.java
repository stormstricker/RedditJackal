
package redditjackal.jsonhandlers.listings.subreddit;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PostsListingDataJson {

    @Expose
    private String after;
    @SerializedName("all_awardings")
    private List<Object> allAwardings;
    @SerializedName("allow_live_comments")
    private Boolean allowLiveComments;
    @SerializedName("approved_at_utc")
    private Object approvedAtUtc;
    @SerializedName("approved_by")
    private Object approvedBy;
    @Expose
    private Boolean archived;
    @Expose
    private String author;
    @SerializedName("author_flair_background_color")
    private Object authorFlairBackgroundColor;
    @SerializedName("author_flair_css_class")
    private Object authorFlairCssClass;
    @SerializedName("author_flair_richtext")
    private List<Object> authorFlairRichtext;
    @SerializedName("author_flair_template_id")
    private Object authorFlairTemplateId;
    @SerializedName("author_flair_text")
    private Object authorFlairText;
    @SerializedName("author_flair_text_color")
    private Object authorFlairTextColor;
    @SerializedName("author_flair_type")
    private String authorFlairType;
    @SerializedName("author_fullname")
    private String authorFullname;
    @SerializedName("author_patreon_flair")
    private Boolean authorPatreonFlair;
    @Expose
    private List<Object> awarders;
    @SerializedName("banned_at_utc")
    private Object bannedAtUtc;
    @SerializedName("banned_by")
    private Object bannedBy;
    @Expose
    private Object before;
    @SerializedName("can_gild")
    private Boolean canGild;
    @SerializedName("can_mod_post")
    private Boolean canModPost;
    @Expose
    private Object category;
    @Expose
    private List<PostsListingChildJson> children;
    @Expose
    private Boolean clicked;
    @SerializedName("content_categories")
    private Object contentCategories;
    @SerializedName("contest_mode")
    private Boolean contestMode;
    @Expose
    private Long created;
    @SerializedName("created_utc")
    private Long createdUtc;
    @SerializedName("discussion_type")
    private Object discussionType;
    @Expose
    private Long dist;
    @Expose
    private Object distinguished;
    @Expose
    private String domain;
    @Expose
    private Long downs;
    @Expose
    private Object edited;
    @Expose
    private Long gilded;
    @Expose
    private PostsListingGildingsJson gildings;
    @Expose
    private Boolean hidden;
    @SerializedName("hide_score")
    private Boolean hideScore;
    @Expose
    private String id;
    @SerializedName("is_crosspostable")
    private Boolean isCrosspostable;
    @SerializedName("is_meta")
    private Boolean isMeta;
    @SerializedName("is_original_content")
    private Boolean isOriginalContent;
    @SerializedName("is_reddit_media_domain")
    private Boolean isRedditMediaDomain;
    @SerializedName("is_robot_indexable")
    private Boolean isRobotIndexable;
    @SerializedName("is_self")
    private Boolean isSelf;
    @SerializedName("is_video")
    private Boolean isVideo;
    @Expose
    private Object likes;
    @SerializedName("link_flair_background_color")
    private String linkFlairBackgroundColor;
    @SerializedName("link_flair_css_class")
    private Object linkFlairCssClass;
    @SerializedName("link_flair_richtext")
    private List<Object> linkFlairRichtext;
    @SerializedName("link_flair_text")
    private Object linkFlairText;
    @SerializedName("link_flair_text_color")
    private String linkFlairTextColor;
    @SerializedName("link_flair_type")
    private String linkFlairType;
    @Expose
    private Boolean locked;
    @Expose
    private Object media;
    @SerializedName("media_embed")
    private PostsListingMediaEmbedJson mediaEmbed;
    @SerializedName("media_only")
    private Boolean mediaOnly;
    @SerializedName("mod_note")
    private Object modNote;
    @SerializedName("mod_reason_by")
    private Object modReasonBy;
    @SerializedName("mod_reason_title")
    private Object modReasonTitle;
    @SerializedName("mod_reports")
    private List<Object> modReports;
    @Expose
    private Object modhash;
    @Expose
    private String name;
    @SerializedName("no_follow")
    private Boolean noFollow;
    @SerializedName("num_comments")
    private Long numComments;
    @SerializedName("num_crossposts")
    private Long numCrossposts;
    @SerializedName("num_reports")
    private Object numReports;
    @SerializedName("over_18")
    private Boolean over18;
    @SerializedName("parent_whitelist_status")
    private String parentWhitelistStatus;
    @Expose
    private String permalink;
    @Expose
    private Boolean pinned;
    @Expose
    private Long pwls;
    @Expose
    private Boolean quarantine;
    @SerializedName("removal_reason")
    private Object removalReason;
    @SerializedName("removed_by")
    private Object removedBy;
    @SerializedName("report_reasons")
    private Object reportReasons;
    @Expose
    private Boolean saved;
    @Expose
    private Long score;
    @SerializedName("secure_media")
    private Object secureMedia;
    @SerializedName("secure_media_embed")
    private SecureMediaEmbed secureMediaEmbed;
    @Expose
    private String selftext;
    @SerializedName("selftext_html")
    private Object selftextHtml;
    @SerializedName("send_replies")
    private Boolean sendReplies;
    @Expose
    private Boolean spoiler;
    @SerializedName("steward_reports")
    private List<Object> stewardReports;
    @Expose
    private Boolean stickied;
    @Expose
    private String subreddit;
    @SerializedName("subreddit_id")
    private String subredditId;
    @SerializedName("subreddit_name_prefixed")
    private String subredditNamePrefixed;
    @SerializedName("subreddit_subscribers")
    private Long subredditSubscribers;
    @SerializedName("subreddit_type")
    private String subredditType;
    @SerializedName("suggested_sort")
    private Object suggestedSort;
    @Expose
    private String thumbnail;
    @Expose
    private String title;
    @SerializedName("total_awards_received")
    private Long totalAwardsReceived;
    @Expose
    private Long ups;
    @Expose
    private String url;
    @SerializedName("user_reports")
    private List<Object> userReports;
    @SerializedName("view_count")
    private Object viewCount;
    @Expose
    private Boolean visited;
    @SerializedName("whitelist_status")
    private String whitelistStatus;
    @Expose
    private Long wls;

    public String getAfter() {
        return after;
    }

    public List<Object> getAllAwardings() {
        return allAwardings;
    }

    public Boolean getAllowLiveComments() {
        return allowLiveComments;
    }

    public Object getApprovedAtUtc() {
        return approvedAtUtc;
    }

    public Object getApprovedBy() {
        return approvedBy;
    }

    public Boolean getArchived() {
        return archived;
    }

    public String getAuthor() {
        return author;
    }

    public Object getAuthorFlairBackgroundColor() {
        return authorFlairBackgroundColor;
    }

    public Object getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public List<Object> getAuthorFlairRichtext() {
        return authorFlairRichtext;
    }

    public Object getAuthorFlairTemplateId() {
        return authorFlairTemplateId;
    }

    public Object getAuthorFlairText() {
        return authorFlairText;
    }

    public Object getAuthorFlairTextColor() {
        return authorFlairTextColor;
    }

    public String getAuthorFlairType() {
        return authorFlairType;
    }

    public String getAuthorFullname() {
        return authorFullname;
    }

    public Boolean getAuthorPatreonFlair() {
        return authorPatreonFlair;
    }

    public List<Object> getAwarders() {
        return awarders;
    }

    public Object getBannedAtUtc() {
        return bannedAtUtc;
    }

    public Object getBannedBy() {
        return bannedBy;
    }

    public Object getBefore() {
        return before;
    }

    public Boolean getCanGild() {
        return canGild;
    }

    public Boolean getCanModPost() {
        return canModPost;
    }

    public Object getCategory() {
        return category;
    }

    public List<PostsListingChildJson> getChildren() {
        return children;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public Object getContentCategories() {
        return contentCategories;
    }

    public Boolean getContestMode() {
        return contestMode;
    }

    public Long getCreated() {
        return created;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public Object getDiscussionType() {
        return discussionType;
    }

    public Long getDist() {
        return dist;
    }

    public Object getDistinguished() {
        return distinguished;
    }

    public String getDomain() {
        return domain;
    }

    public Long getDowns() {
        return downs;
    }

    public Object getEdited() {
        return edited;
    }

    public Long getGilded() {
        return gilded;
    }

    public PostsListingGildingsJson getGildings() {
        return gildings;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public Boolean getHideScore() {
        return hideScore;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsCrosspostable() {
        return isCrosspostable;
    }

    public Boolean getIsMeta() {
        return isMeta;
    }

    public Boolean getIsOriginalContent() {
        return isOriginalContent;
    }

    public Boolean getIsRedditMediaDomain() {
        return isRedditMediaDomain;
    }

    public Boolean getIsRobotIndexable() {
        return isRobotIndexable;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public Object getLikes() {
        return likes;
    }

    public String getLinkFlairBackgroundColor() {
        return linkFlairBackgroundColor;
    }

    public Object getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public List<Object> getLinkFlairRichtext() {
        return linkFlairRichtext;
    }

    public Object getLinkFlairText() {
        return linkFlairText;
    }

    public String getLinkFlairTextColor() {
        return linkFlairTextColor;
    }

    public String getLinkFlairType() {
        return linkFlairType;
    }

    public Boolean getLocked() {
        return locked;
    }

    public Object getMedia() {
        return media;
    }

    public PostsListingMediaEmbedJson getMediaEmbed() {
        return mediaEmbed;
    }

    public Boolean getMediaOnly() {
        return mediaOnly;
    }

    public Object getModNote() {
        return modNote;
    }

    public Object getModReasonBy() {
        return modReasonBy;
    }

    public Object getModReasonTitle() {
        return modReasonTitle;
    }

    public List<Object> getModReports() {
        return modReports;
    }

    public Object getModhash() {
        return modhash;
    }

    public String getName() {
        return name;
    }

    public Boolean getNoFollow() {
        return noFollow;
    }

    public Long getNumComments() {
        return numComments;
    }

    public Long getNumCrossposts() {
        return numCrossposts;
    }

    public Object getNumReports() {
        return numReports;
    }

    public Boolean getOver18() {
        return over18;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public String getPermalink() {
        return permalink;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public Long getPwls() {
        return pwls;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public Object getRemovalReason() {
        return removalReason;
    }

    public Object getRemovedBy() {
        return removedBy;
    }

    public Object getReportReasons() {
        return reportReasons;
    }

    public Boolean getSaved() {
        return saved;
    }

    public Long getScore() {
        return score;
    }

    public Object getSecureMedia() {
        return secureMedia;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public String getSelftext() {
        return selftext;
    }

    public Object getSelftextHtml() {
        return selftextHtml;
    }

    public Boolean getSendReplies() {
        return sendReplies;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public List<Object> getStewardReports() {
        return stewardReports;
    }

    public Boolean getStickied() {
        return stickied;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public Long getSubredditSubscribers() {
        return subredditSubscribers;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public Object getSuggestedSort() {
        return suggestedSort;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public Long getTotalAwardsReceived() {
        return totalAwardsReceived;
    }

    public Long getUps() {
        return ups;
    }

    public String getUrl() {
        return url;
    }

    public List<Object> getUserReports() {
        return userReports;
    }

    public Object getViewCount() {
        return viewCount;
    }

    public Boolean getVisited() {
        return visited;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public Long getWls() {
        return wls;
    }

    public static class Builder {

        private String after;
        private List<Object> allAwardings;
        private Boolean allowLiveComments;
        private Object approvedAtUtc;
        private Object approvedBy;
        private Boolean archived;
        private String author;
        private Object authorFlairBackgroundColor;
        private Object authorFlairCssClass;
        private List<Object> authorFlairRichtext;
        private Object authorFlairTemplateId;
        private Object authorFlairText;
        private Object authorFlairTextColor;
        private String authorFlairType;
        private String authorFullname;
        private Boolean authorPatreonFlair;
        private List<Object> awarders;
        private Object bannedAtUtc;
        private Object bannedBy;
        private Object before;
        private Boolean canGild;
        private Boolean canModPost;
        private Object category;
        private List<PostsListingChildJson> children;
        private Boolean clicked;
        private Object contentCategories;
        private Boolean contestMode;
        private Long created;
        private Long createdUtc;
        private Object discussionType;
        private Long dist;
        private Object distinguished;
        private String domain;
        private Long downs;
        private Object edited;
        private Long gilded;
        private PostsListingGildingsJson gildings;
        private Boolean hidden;
        private Boolean hideScore;
        private String id;
        private Boolean isCrosspostable;
        private Boolean isMeta;
        private Boolean isOriginalContent;
        private Boolean isRedditMediaDomain;
        private Boolean isRobotIndexable;
        private Boolean isSelf;
        private Boolean isVideo;
        private Object likes;
        private String linkFlairBackgroundColor;
        private Object linkFlairCssClass;
        private List<Object> linkFlairRichtext;
        private Object linkFlairText;
        private String linkFlairTextColor;
        private String linkFlairType;
        private Boolean locked;
        private Object media;
        private PostsListingMediaEmbedJson mediaEmbed;
        private Boolean mediaOnly;
        private Object modNote;
        private Object modReasonBy;
        private Object modReasonTitle;
        private List<Object> modReports;
        private Object modhash;
        private String name;
        private Boolean noFollow;
        private Long numComments;
        private Long numCrossposts;
        private Object numReports;
        private Boolean over18;
        private String parentWhitelistStatus;
        private String permalink;
        private Boolean pinned;
        private Long pwls;
        private Boolean quarantine;
        private Object removalReason;
        private Object removedBy;
        private Object reportReasons;
        private Boolean saved;
        private Long score;
        private Object secureMedia;
        private SecureMediaEmbed secureMediaEmbed;
        private String selftext;
        private Object selftextHtml;
        private Boolean sendReplies;
        private Boolean spoiler;
        private List<Object> stewardReports;
        private Boolean stickied;
        private String subreddit;
        private String subredditId;
        private String subredditNamePrefixed;
        private Long subredditSubscribers;
        private String subredditType;
        private Object suggestedSort;
        private String thumbnail;
        private String title;
        private Long totalAwardsReceived;
        private Long ups;
        private String url;
        private List<Object> userReports;
        private Object viewCount;
        private Boolean visited;
        private String whitelistStatus;
        private Long wls;

        public PostsListingDataJson.Builder withAfter(String after) {
            this.after = after;
            return this;
        }

        public PostsListingDataJson.Builder withAllAwardings(List<Object> allAwardings) {
            this.allAwardings = allAwardings;
            return this;
        }

        public PostsListingDataJson.Builder withAllowLiveComments(Boolean allowLiveComments) {
            this.allowLiveComments = allowLiveComments;
            return this;
        }

        public PostsListingDataJson.Builder withApprovedAtUtc(Object approvedAtUtc) {
            this.approvedAtUtc = approvedAtUtc;
            return this;
        }

        public PostsListingDataJson.Builder withApprovedBy(Object approvedBy) {
            this.approvedBy = approvedBy;
            return this;
        }

        public PostsListingDataJson.Builder withArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        public PostsListingDataJson.Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairBackgroundColor(Object authorFlairBackgroundColor) {
            this.authorFlairBackgroundColor = authorFlairBackgroundColor;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairCssClass(Object authorFlairCssClass) {
            this.authorFlairCssClass = authorFlairCssClass;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairRichtext(List<Object> authorFlairRichtext) {
            this.authorFlairRichtext = authorFlairRichtext;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairTemplateId(Object authorFlairTemplateId) {
            this.authorFlairTemplateId = authorFlairTemplateId;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairText(Object authorFlairText) {
            this.authorFlairText = authorFlairText;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairTextColor(Object authorFlairTextColor) {
            this.authorFlairTextColor = authorFlairTextColor;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFlairType(String authorFlairType) {
            this.authorFlairType = authorFlairType;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorFullname(String authorFullname) {
            this.authorFullname = authorFullname;
            return this;
        }

        public PostsListingDataJson.Builder withAuthorPatreonFlair(Boolean authorPatreonFlair) {
            this.authorPatreonFlair = authorPatreonFlair;
            return this;
        }

        public PostsListingDataJson.Builder withAwarders(List<Object> awarders) {
            this.awarders = awarders;
            return this;
        }

        public PostsListingDataJson.Builder withBannedAtUtc(Object bannedAtUtc) {
            this.bannedAtUtc = bannedAtUtc;
            return this;
        }

        public PostsListingDataJson.Builder withBannedBy(Object bannedBy) {
            this.bannedBy = bannedBy;
            return this;
        }

        public PostsListingDataJson.Builder withBefore(Object before) {
            this.before = before;
            return this;
        }

        public PostsListingDataJson.Builder withCanGild(Boolean canGild) {
            this.canGild = canGild;
            return this;
        }

        public PostsListingDataJson.Builder withCanModPost(Boolean canModPost) {
            this.canModPost = canModPost;
            return this;
        }

        public PostsListingDataJson.Builder withCategory(Object category) {
            this.category = category;
            return this;
        }

        public PostsListingDataJson.Builder withChildren(List<PostsListingChildJson> children) {
            this.children = children;
            return this;
        }

        public PostsListingDataJson.Builder withClicked(Boolean clicked) {
            this.clicked = clicked;
            return this;
        }

        public PostsListingDataJson.Builder withContentCategories(Object contentCategories) {
            this.contentCategories = contentCategories;
            return this;
        }

        public PostsListingDataJson.Builder withContestMode(Boolean contestMode) {
            this.contestMode = contestMode;
            return this;
        }

        public PostsListingDataJson.Builder withCreated(Long created) {
            this.created = created;
            return this;
        }

        public PostsListingDataJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public PostsListingDataJson.Builder withDiscussionType(Object discussionType) {
            this.discussionType = discussionType;
            return this;
        }

        public PostsListingDataJson.Builder withDist(Long dist) {
            this.dist = dist;
            return this;
        }

        public PostsListingDataJson.Builder withDistinguished(Object distinguished) {
            this.distinguished = distinguished;
            return this;
        }

        public PostsListingDataJson.Builder withDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public PostsListingDataJson.Builder withDowns(Long downs) {
            this.downs = downs;
            return this;
        }

        public PostsListingDataJson.Builder withEdited(Double edited) {
            this.edited = edited;
            return this;
        }

        public PostsListingDataJson.Builder withGilded(Long gilded) {
            this.gilded = gilded;
            return this;
        }

        public PostsListingDataJson.Builder withGildings(PostsListingGildingsJson gildings) {
            this.gildings = gildings;
            return this;
        }

        public PostsListingDataJson.Builder withHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public PostsListingDataJson.Builder withHideScore(Boolean hideScore) {
            this.hideScore = hideScore;
            return this;
        }

        public PostsListingDataJson.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public PostsListingDataJson.Builder withIsCrosspostable(Boolean isCrosspostable) {
            this.isCrosspostable = isCrosspostable;
            return this;
        }

        public PostsListingDataJson.Builder withIsMeta(Boolean isMeta) {
            this.isMeta = isMeta;
            return this;
        }

        public PostsListingDataJson.Builder withIsOriginalContent(Boolean isOriginalContent) {
            this.isOriginalContent = isOriginalContent;
            return this;
        }

        public PostsListingDataJson.Builder withIsRedditMediaDomain(Boolean isRedditMediaDomain) {
            this.isRedditMediaDomain = isRedditMediaDomain;
            return this;
        }

        public PostsListingDataJson.Builder withIsRobotIndexable(Boolean isRobotIndexable) {
            this.isRobotIndexable = isRobotIndexable;
            return this;
        }

        public PostsListingDataJson.Builder withIsSelf(Boolean isSelf) {
            this.isSelf = isSelf;
            return this;
        }

        public PostsListingDataJson.Builder withIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }

        public PostsListingDataJson.Builder withLikes(Object likes) {
            this.likes = likes;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
            this.linkFlairBackgroundColor = linkFlairBackgroundColor;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairCssClass(Object linkFlairCssClass) {
            this.linkFlairCssClass = linkFlairCssClass;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairRichtext(List<Object> linkFlairRichtext) {
            this.linkFlairRichtext = linkFlairRichtext;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairText(Object linkFlairText) {
            this.linkFlairText = linkFlairText;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairTextColor(String linkFlairTextColor) {
            this.linkFlairTextColor = linkFlairTextColor;
            return this;
        }

        public PostsListingDataJson.Builder withLinkFlairType(String linkFlairType) {
            this.linkFlairType = linkFlairType;
            return this;
        }

        public PostsListingDataJson.Builder withLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        public PostsListingDataJson.Builder withMedia(Object media) {
            this.media = media;
            return this;
        }

        public PostsListingDataJson.Builder withMediaEmbed(PostsListingMediaEmbedJson mediaEmbed) {
            this.mediaEmbed = mediaEmbed;
            return this;
        }

        public PostsListingDataJson.Builder withMediaOnly(Boolean mediaOnly) {
            this.mediaOnly = mediaOnly;
            return this;
        }

        public PostsListingDataJson.Builder withModNote(Object modNote) {
            this.modNote = modNote;
            return this;
        }

        public PostsListingDataJson.Builder withModReasonBy(Object modReasonBy) {
            this.modReasonBy = modReasonBy;
            return this;
        }

        public PostsListingDataJson.Builder withModReasonTitle(Object modReasonTitle) {
            this.modReasonTitle = modReasonTitle;
            return this;
        }

        public PostsListingDataJson.Builder withModReports(List<Object> modReports) {
            this.modReports = modReports;
            return this;
        }

        public PostsListingDataJson.Builder withModhash(Object modhash) {
            this.modhash = modhash;
            return this;
        }

        public PostsListingDataJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public PostsListingDataJson.Builder withNoFollow(Boolean noFollow) {
            this.noFollow = noFollow;
            return this;
        }

        public PostsListingDataJson.Builder withNumComments(Long numComments) {
            this.numComments = numComments;
            return this;
        }

        public PostsListingDataJson.Builder withNumCrossposts(Long numCrossposts) {
            this.numCrossposts = numCrossposts;
            return this;
        }

        public PostsListingDataJson.Builder withNumReports(Object numReports) {
            this.numReports = numReports;
            return this;
        }

        public PostsListingDataJson.Builder withOver18(Boolean over18) {
            this.over18 = over18;
            return this;
        }

        public PostsListingDataJson.Builder withParentWhitelistStatus(String parentWhitelistStatus) {
            this.parentWhitelistStatus = parentWhitelistStatus;
            return this;
        }

        public PostsListingDataJson.Builder withPermalink(String permalink) {
            this.permalink = permalink;
            return this;
        }

        public PostsListingDataJson.Builder withPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        public PostsListingDataJson.Builder withPwls(Long pwls) {
            this.pwls = pwls;
            return this;
        }

        public PostsListingDataJson.Builder withQuarantine(Boolean quarantine) {
            this.quarantine = quarantine;
            return this;
        }

        public PostsListingDataJson.Builder withRemovalReason(Object removalReason) {
            this.removalReason = removalReason;
            return this;
        }

        public PostsListingDataJson.Builder withRemovedBy(Object removedBy) {
            this.removedBy = removedBy;
            return this;
        }

        public PostsListingDataJson.Builder withReportReasons(Object reportReasons) {
            this.reportReasons = reportReasons;
            return this;
        }

        public PostsListingDataJson.Builder withSaved(Boolean saved) {
            this.saved = saved;
            return this;
        }

        public PostsListingDataJson.Builder withScore(Long score) {
            this.score = score;
            return this;
        }

        public PostsListingDataJson.Builder withSecureMedia(Object secureMedia) {
            this.secureMedia = secureMedia;
            return this;
        }

        public PostsListingDataJson.Builder withSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
            this.secureMediaEmbed = secureMediaEmbed;
            return this;
        }

        public PostsListingDataJson.Builder withSelftext(String selftext) {
            this.selftext = selftext;
            return this;
        }

        public PostsListingDataJson.Builder withSelftextHtml(Object selftextHtml) {
            this.selftextHtml = selftextHtml;
            return this;
        }

        public PostsListingDataJson.Builder withSendReplies(Boolean sendReplies) {
            this.sendReplies = sendReplies;
            return this;
        }

        public PostsListingDataJson.Builder withSpoiler(Boolean spoiler) {
            this.spoiler = spoiler;
            return this;
        }

        public PostsListingDataJson.Builder withStewardReports(List<Object> stewardReports) {
            this.stewardReports = stewardReports;
            return this;
        }

        public PostsListingDataJson.Builder withStickied(Boolean stickied) {
            this.stickied = stickied;
            return this;
        }

        public PostsListingDataJson.Builder withSubreddit(String subreddit) {
            this.subreddit = subreddit;
            return this;
        }

        public PostsListingDataJson.Builder withSubredditId(String subredditId) {
            this.subredditId = subredditId;
            return this;
        }

        public PostsListingDataJson.Builder withSubredditNamePrefixed(String subredditNamePrefixed) {
            this.subredditNamePrefixed = subredditNamePrefixed;
            return this;
        }

        public PostsListingDataJson.Builder withSubredditSubscribers(Long subredditSubscribers) {
            this.subredditSubscribers = subredditSubscribers;
            return this;
        }

        public PostsListingDataJson.Builder withSubredditType(String subredditType) {
            this.subredditType = subredditType;
            return this;
        }

        public PostsListingDataJson.Builder withSuggestedSort(Object suggestedSort) {
            this.suggestedSort = suggestedSort;
            return this;
        }

        public PostsListingDataJson.Builder withThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public PostsListingDataJson.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public PostsListingDataJson.Builder withTotalAwardsReceived(Long totalAwardsReceived) {
            this.totalAwardsReceived = totalAwardsReceived;
            return this;
        }

        public PostsListingDataJson.Builder withUps(Long ups) {
            this.ups = ups;
            return this;
        }

        public PostsListingDataJson.Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public PostsListingDataJson.Builder withUserReports(List<Object> userReports) {
            this.userReports = userReports;
            return this;
        }

        public PostsListingDataJson.Builder withViewCount(Object viewCount) {
            this.viewCount = viewCount;
            return this;
        }

        public PostsListingDataJson.Builder withVisited(Boolean visited) {
            this.visited = visited;
            return this;
        }

        public PostsListingDataJson.Builder withWhitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        public PostsListingDataJson.Builder withWls(Long wls) {
            this.wls = wls;
            return this;
        }

        public PostsListingDataJson build() {
            PostsListingDataJson data = new PostsListingDataJson();
            data.after = after;
            data.allAwardings = allAwardings;
            data.allowLiveComments = allowLiveComments;
            data.approvedAtUtc = approvedAtUtc;
            data.approvedBy = approvedBy;
            data.archived = archived;
            data.author = author;
            data.authorFlairBackgroundColor = authorFlairBackgroundColor;
            data.authorFlairCssClass = authorFlairCssClass;
            data.authorFlairRichtext = authorFlairRichtext;
            data.authorFlairTemplateId = authorFlairTemplateId;
            data.authorFlairText = authorFlairText;
            data.authorFlairTextColor = authorFlairTextColor;
            data.authorFlairType = authorFlairType;
            data.authorFullname = authorFullname;
            data.authorPatreonFlair = authorPatreonFlair;
            data.awarders = awarders;
            data.bannedAtUtc = bannedAtUtc;
            data.bannedBy = bannedBy;
            data.before = before;
            data.canGild = canGild;
            data.canModPost = canModPost;
            data.category = category;
            data.children = children;
            data.clicked = clicked;
            data.contentCategories = contentCategories;
            data.contestMode = contestMode;
            data.created = created;
            data.createdUtc = createdUtc;
            data.discussionType = discussionType;
            data.dist = dist;
            data.distinguished = distinguished;
            data.domain = domain;
            data.downs = downs;
            data.edited = edited;
            data.gilded = gilded;
            data.gildings = gildings;
            data.hidden = hidden;
            data.hideScore = hideScore;
            data.id = id;
            data.isCrosspostable = isCrosspostable;
            data.isMeta = isMeta;
            data.isOriginalContent = isOriginalContent;
            data.isRedditMediaDomain = isRedditMediaDomain;
            data.isRobotIndexable = isRobotIndexable;
            data.isSelf = isSelf;
            data.isVideo = isVideo;
            data.likes = likes;
            data.linkFlairBackgroundColor = linkFlairBackgroundColor;
            data.linkFlairCssClass = linkFlairCssClass;
            data.linkFlairRichtext = linkFlairRichtext;
            data.linkFlairText = linkFlairText;
            data.linkFlairTextColor = linkFlairTextColor;
            data.linkFlairType = linkFlairType;
            data.locked = locked;
            data.media = media;
            data.mediaEmbed = mediaEmbed;
            data.mediaOnly = mediaOnly;
            data.modNote = modNote;
            data.modReasonBy = modReasonBy;
            data.modReasonTitle = modReasonTitle;
            data.modReports = modReports;
            data.modhash = modhash;
            data.name = name;
            data.noFollow = noFollow;
            data.numComments = numComments;
            data.numCrossposts = numCrossposts;
            data.numReports = numReports;
            data.over18 = over18;
            data.parentWhitelistStatus = parentWhitelistStatus;
            data.permalink = permalink;
            data.pinned = pinned;
            data.pwls = pwls;
            data.quarantine = quarantine;
            data.removalReason = removalReason;
            data.removedBy = removedBy;
            data.reportReasons = reportReasons;
            data.saved = saved;
            data.score = score;
            data.secureMedia = secureMedia;
            data.secureMediaEmbed = secureMediaEmbed;
            data.selftext = selftext;
            data.selftextHtml = selftextHtml;
            data.sendReplies = sendReplies;
            data.spoiler = spoiler;
            data.stewardReports = stewardReports;
            data.stickied = stickied;
            data.subreddit = subreddit;
            data.subredditId = subredditId;
            data.subredditNamePrefixed = subredditNamePrefixed;
            data.subredditSubscribers = subredditSubscribers;
            data.subredditType = subredditType;
            data.suggestedSort = suggestedSort;
            data.thumbnail = thumbnail;
            data.title = title;
            data.totalAwardsReceived = totalAwardsReceived;
            data.ups = ups;
            data.url = url;
            data.userReports = userReports;
            data.viewCount = viewCount;
            data.visited = visited;
            data.whitelistStatus = whitelistStatus;
            data.wls = wls;
            return data;
        }

    }

}
