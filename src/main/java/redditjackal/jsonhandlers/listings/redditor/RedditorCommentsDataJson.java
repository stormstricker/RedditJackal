
package redditjackal.jsonhandlers.listings.redditor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import redditjackal.jsonhandlers.AbstractCommentDataJson;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RedditorCommentsDataJson extends AbstractCommentDataJson {

    @Expose
    private String after;
    @SerializedName("all_awardings")
    private List<Object> allAwardings;
    @SerializedName("approved_at_utc")
    private Object approvedAtUtc;
    @SerializedName("approved_by")
    private Object approvedBy;
    @Expose
    private Boolean archived;
    @SerializedName("associated_award")
    private Object associatedAward;
    @Expose
    private String author;
    @SerializedName("author_flair_background_color")
    private String authorFlairBackgroundColor;
    @SerializedName("author_flair_css_class")
    private String authorFlairCssClass;
    @SerializedName("author_flair_richtext")
    private List<Object> authorFlairRichtext;
    @SerializedName("author_flair_template_id")
    private Object authorFlairTemplateId;
    @SerializedName("author_flair_text")
    private String authorFlairText;
    @SerializedName("author_flair_text_color")
    private String authorFlairTextColor;
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
    @Expose
    private String body;
    @SerializedName("body_html")
    private String bodyHtml;
    @SerializedName("can_gild")
    private Boolean canGild;
    @SerializedName("can_mod_post")
    private Boolean canModPost;
    @Expose
    private List<RedditorCommentsChildJson> children;
    @Expose
    private Boolean collapsed;
    @SerializedName("collapsed_because_crowd_control")
    private Object collapsedBecauseCrowdControl;
    @SerializedName("collapsed_reason")
    private Object collapsedReason;
    @Expose
    private Long controversiality;
    @Expose
    private Long created;
    @SerializedName("created_utc")
    private Long createdUtc;
    @Expose
    private Long dist;
    @Expose
    private Object distinguished;
    @Expose
    private Long downs;
    @Expose
    private Object edited;
    @Expose
    private Long gilded;
    @Expose
    private RedditorCommentsGildingsJson gildings;
    @Expose
    private String id;
    @SerializedName("is_submitter")
    private Boolean isSubmitter;
    @Expose
    private Object likes;
    @SerializedName("link_author")
    private String linkAuthor;
    @SerializedName("link_id")
    private String linkId;
    @SerializedName("link_permalink")
    private String linkPermalink;
    @SerializedName("link_title")
    private String linkTitle;
    @SerializedName("link_url")
    private String linkUrl;
    @Expose
    private Boolean locked;
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
    @SerializedName("num_reports")
    private Object numReports;
    @SerializedName("over_18")
    private Boolean over18;
    @SerializedName("parent_id")
    private String parentId;
    @Expose
    private String permalink;
    @Expose
    private Boolean quarantine;
    @SerializedName("removal_reason")
    private Object removalReason;
    @Expose
    private String replies;
    @SerializedName("report_reasons")
    private Object reportReasons;
    @Expose
    private Boolean saved;
    @Expose
    private Long score;
    @SerializedName("score_hidden")
    private Boolean scoreHidden;
    @SerializedName("send_replies")
    private Boolean sendReplies;
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
    @SerializedName("subreddit_type")
    private String subredditType;
    @SerializedName("total_awards_received")
    private Long totalAwardsReceived;
    @Expose
    private Long ups;
    @SerializedName("user_reports")
    private List<Object> userReports;

    public String getAfter() {
        return after;
    }

    public List<Object> getAllAwardings() {
        return allAwardings;
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

    public Object getAssociatedAward() {
        return associatedAward;
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorFlairBackgroundColor() {
        return authorFlairBackgroundColor;
    }

    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public List<Object> getAuthorFlairRichtext() {
        return authorFlairRichtext;
    }

    public Object getAuthorFlairTemplateId() {
        return authorFlairTemplateId;
    }

    public String getAuthorFlairText() {
        return authorFlairText;
    }

    public String getAuthorFlairTextColor() {
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

    public String getBody() {
        return body;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public Boolean getCanGild() {
        return canGild;
    }

    public Boolean getCanModPost() {
        return canModPost;
    }

    public List<RedditorCommentsChildJson> getChildren() {
        return children;
    }

    public Boolean getCollapsed() {
        return collapsed;
    }

    public Object getCollapsedBecauseCrowdControl() {
        return collapsedBecauseCrowdControl;
    }

    public Object getCollapsedReason() {
        return collapsedReason;
    }

    public Long getControversiality() {
        return controversiality;
    }

    public Long getCreated() {
        return created;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public Long getDist() {
        return dist;
    }

    public Object getDistinguished() {
        return distinguished;
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

    public RedditorCommentsGildingsJson getGildings() {
        return gildings;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsSubmitter() {
        return isSubmitter;
    }

    public Object getLikes() {
        return likes;
    }

    public String getLinkAuthor() {
        return linkAuthor;
    }

    public String getLinkId() {
        return linkId;
    }

    public String getLinkPermalink() {
        return linkPermalink;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public Boolean getLocked() {
        return locked;
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

    public Object getNumReports() {
        return numReports;
    }

    public Boolean getOver18() {
        return over18;
    }

    public String getParentId() {
        return parentId;
    }

    public String getPermalink() {
        return permalink;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public Object getRemovalReason() {
        return removalReason;
    }

    public String getReplies() {
        return replies;
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

    public Boolean getScoreHidden() {
        return scoreHidden;
    }

    public Boolean getSendReplies() {
        return sendReplies;
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

    public String getSubredditType() {
        return subredditType;
    }

    public Long getTotalAwardsReceived() {
        return totalAwardsReceived;
    }

    public Long getUps() {
        return ups;
    }

    public List<Object> getUserReports() {
        return userReports;
    }

    public static class Builder {

        private String after;
        private List<Object> allAwardings;
        private Object approvedAtUtc;
        private Object approvedBy;
        private Boolean archived;
        private Object associatedAward;
        private String author;
        private String authorFlairBackgroundColor;
        private String authorFlairCssClass;
        private List<Object> authorFlairRichtext;
        private Object authorFlairTemplateId;
        private String authorFlairText;
        private String authorFlairTextColor;
        private String authorFlairType;
        private String authorFullname;
        private Boolean authorPatreonFlair;
        private List<Object> awarders;
        private Object bannedAtUtc;
        private Object bannedBy;
        private Object before;
        private String body;
        private String bodyHtml;
        private Boolean canGild;
        private Boolean canModPost;
        private List<RedditorCommentsChildJson> children;
        private Boolean collapsed;
        private Object collapsedBecauseCrowdControl;
        private Object collapsedReason;
        private Long controversiality;
        private Long created;
        private Long createdUtc;
        private Long dist;
        private Object distinguished;
        private Long downs;
        private Double edited;
        private Long gilded;
        private RedditorCommentsGildingsJson gildings;
        private String id;
        private Boolean isSubmitter;
        private Object likes;
        private String linkAuthor;
        private String linkId;
        private String linkPermalink;
        private String linkTitle;
        private String linkUrl;
        private Boolean locked;
        private Object modNote;
        private Object modReasonBy;
        private Object modReasonTitle;
        private List<Object> modReports;
        private Object modhash;
        private String name;
        private Boolean noFollow;
        private Long numComments;
        private Object numReports;
        private Boolean over18;
        private String parentId;
        private String permalink;
        private Boolean quarantine;
        private Object removalReason;
        private String replies;
        private Object reportReasons;
        private Boolean saved;
        private Long score;
        private Boolean scoreHidden;
        private Boolean sendReplies;
        private List<Object> stewardReports;
        private Boolean stickied;
        private String subreddit;
        private String subredditId;
        private String subredditNamePrefixed;
        private String subredditType;
        private Long totalAwardsReceived;
        private Long ups;
        private List<Object> userReports;

        public RedditorCommentsDataJson.Builder withAfter(String after) {
            this.after = after;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAllAwardings(List<Object> allAwardings) {
            this.allAwardings = allAwardings;
            return this;
        }

        public RedditorCommentsDataJson.Builder withApprovedAtUtc(Object approvedAtUtc) {
            this.approvedAtUtc = approvedAtUtc;
            return this;
        }

        public RedditorCommentsDataJson.Builder withApprovedBy(Object approvedBy) {
            this.approvedBy = approvedBy;
            return this;
        }

        public RedditorCommentsDataJson.Builder withArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAssociatedAward(Object associatedAward) {
            this.associatedAward = associatedAward;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairBackgroundColor(String authorFlairBackgroundColor) {
            this.authorFlairBackgroundColor = authorFlairBackgroundColor;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairCssClass(String authorFlairCssClass) {
            this.authorFlairCssClass = authorFlairCssClass;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairRichtext(List<Object> authorFlairRichtext) {
            this.authorFlairRichtext = authorFlairRichtext;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairTemplateId(Object authorFlairTemplateId) {
            this.authorFlairTemplateId = authorFlairTemplateId;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairText(String authorFlairText) {
            this.authorFlairText = authorFlairText;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairTextColor(String authorFlairTextColor) {
            this.authorFlairTextColor = authorFlairTextColor;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFlairType(String authorFlairType) {
            this.authorFlairType = authorFlairType;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorFullname(String authorFullname) {
            this.authorFullname = authorFullname;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAuthorPatreonFlair(Boolean authorPatreonFlair) {
            this.authorPatreonFlair = authorPatreonFlair;
            return this;
        }

        public RedditorCommentsDataJson.Builder withAwarders(List<Object> awarders) {
            this.awarders = awarders;
            return this;
        }

        public RedditorCommentsDataJson.Builder withBannedAtUtc(Object bannedAtUtc) {
            this.bannedAtUtc = bannedAtUtc;
            return this;
        }

        public RedditorCommentsDataJson.Builder withBannedBy(Object bannedBy) {
            this.bannedBy = bannedBy;
            return this;
        }

        public RedditorCommentsDataJson.Builder withBefore(Object before) {
            this.before = before;
            return this;
        }

        public RedditorCommentsDataJson.Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public RedditorCommentsDataJson.Builder withBodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCanGild(Boolean canGild) {
            this.canGild = canGild;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCanModPost(Boolean canModPost) {
            this.canModPost = canModPost;
            return this;
        }

        public RedditorCommentsDataJson.Builder withChildren(List<RedditorCommentsChildJson> children) {
            this.children = children;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCollapsed(Boolean collapsed) {
            this.collapsed = collapsed;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCollapsedBecauseCrowdControl(Object collapsedBecauseCrowdControl) {
            this.collapsedBecauseCrowdControl = collapsedBecauseCrowdControl;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCollapsedReason(Object collapsedReason) {
            this.collapsedReason = collapsedReason;
            return this;
        }

        public RedditorCommentsDataJson.Builder withControversiality(Long controversiality) {
            this.controversiality = controversiality;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCreated(Long created) {
            this.created = created;
            return this;
        }

        public RedditorCommentsDataJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public RedditorCommentsDataJson.Builder withDist(Long dist) {
            this.dist = dist;
            return this;
        }

        public RedditorCommentsDataJson.Builder withDistinguished(Object distinguished) {
            this.distinguished = distinguished;
            return this;
        }

        public RedditorCommentsDataJson.Builder withDowns(Long downs) {
            this.downs = downs;
            return this;
        }

        public RedditorCommentsDataJson.Builder withEdited(Double edited) {
            this.edited = edited;
            return this;
        }

        public RedditorCommentsDataJson.Builder withGilded(Long gilded) {
            this.gilded = gilded;
            return this;
        }

        public RedditorCommentsDataJson.Builder withGildings(RedditorCommentsGildingsJson gildings) {
            this.gildings = gildings;
            return this;
        }

        public RedditorCommentsDataJson.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public RedditorCommentsDataJson.Builder withIsSubmitter(Boolean isSubmitter) {
            this.isSubmitter = isSubmitter;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLikes(Object likes) {
            this.likes = likes;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLinkAuthor(String linkAuthor) {
            this.linkAuthor = linkAuthor;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLinkPermalink(String linkPermalink) {
            this.linkPermalink = linkPermalink;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLinkTitle(String linkTitle) {
            this.linkTitle = linkTitle;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public RedditorCommentsDataJson.Builder withLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        public RedditorCommentsDataJson.Builder withModNote(Object modNote) {
            this.modNote = modNote;
            return this;
        }

        public RedditorCommentsDataJson.Builder withModReasonBy(Object modReasonBy) {
            this.modReasonBy = modReasonBy;
            return this;
        }

        public RedditorCommentsDataJson.Builder withModReasonTitle(Object modReasonTitle) {
            this.modReasonTitle = modReasonTitle;
            return this;
        }

        public RedditorCommentsDataJson.Builder withModReports(List<Object> modReports) {
            this.modReports = modReports;
            return this;
        }

        public RedditorCommentsDataJson.Builder withModhash(Object modhash) {
            this.modhash = modhash;
            return this;
        }

        public RedditorCommentsDataJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public RedditorCommentsDataJson.Builder withNoFollow(Boolean noFollow) {
            this.noFollow = noFollow;
            return this;
        }

        public RedditorCommentsDataJson.Builder withNumComments(Long numComments) {
            this.numComments = numComments;
            return this;
        }

        public RedditorCommentsDataJson.Builder withNumReports(Object numReports) {
            this.numReports = numReports;
            return this;
        }

        public RedditorCommentsDataJson.Builder withOver18(Boolean over18) {
            this.over18 = over18;
            return this;
        }

        public RedditorCommentsDataJson.Builder withParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public RedditorCommentsDataJson.Builder withPermalink(String permalink) {
            this.permalink = permalink;
            return this;
        }

        public RedditorCommentsDataJson.Builder withQuarantine(Boolean quarantine) {
            this.quarantine = quarantine;
            return this;
        }

        public RedditorCommentsDataJson.Builder withRemovalReason(Object removalReason) {
            this.removalReason = removalReason;
            return this;
        }

        public RedditorCommentsDataJson.Builder withReplies(String replies) {
            this.replies = replies;
            return this;
        }

        public RedditorCommentsDataJson.Builder withReportReasons(Object reportReasons) {
            this.reportReasons = reportReasons;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSaved(Boolean saved) {
            this.saved = saved;
            return this;
        }

        public RedditorCommentsDataJson.Builder withScore(Long score) {
            this.score = score;
            return this;
        }

        public RedditorCommentsDataJson.Builder withScoreHidden(Boolean scoreHidden) {
            this.scoreHidden = scoreHidden;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSendReplies(Boolean sendReplies) {
            this.sendReplies = sendReplies;
            return this;
        }

        public RedditorCommentsDataJson.Builder withStewardReports(List<Object> stewardReports) {
            this.stewardReports = stewardReports;
            return this;
        }

        public RedditorCommentsDataJson.Builder withStickied(Boolean stickied) {
            this.stickied = stickied;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSubreddit(String subreddit) {
            this.subreddit = subreddit;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSubredditId(String subredditId) {
            this.subredditId = subredditId;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSubredditNamePrefixed(String subredditNamePrefixed) {
            this.subredditNamePrefixed = subredditNamePrefixed;
            return this;
        }

        public RedditorCommentsDataJson.Builder withSubredditType(String subredditType) {
            this.subredditType = subredditType;
            return this;
        }

        public RedditorCommentsDataJson.Builder withTotalAwardsReceived(Long totalAwardsReceived) {
            this.totalAwardsReceived = totalAwardsReceived;
            return this;
        }

        public RedditorCommentsDataJson.Builder withUps(Long ups) {
            this.ups = ups;
            return this;
        }

        public RedditorCommentsDataJson.Builder withUserReports(List<Object> userReports) {
            this.userReports = userReports;
            return this;
        }

        public RedditorCommentsDataJson build() {
            RedditorCommentsDataJson data = new RedditorCommentsDataJson();
            data.after = after;
            data.allAwardings = allAwardings;
            data.approvedAtUtc = approvedAtUtc;
            data.approvedBy = approvedBy;
            data.archived = archived;
            data.associatedAward = associatedAward;
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
            data.body = body;
            data.bodyHtml = bodyHtml;
            data.canGild = canGild;
            data.canModPost = canModPost;
            data.children = children;
            data.collapsed = collapsed;
            data.collapsedBecauseCrowdControl = collapsedBecauseCrowdControl;
            data.collapsedReason = collapsedReason;
            data.controversiality = controversiality;
            data.created = created;
            data.createdUtc = createdUtc;
            data.dist = dist;
            data.distinguished = distinguished;
            data.downs = downs;
            data.edited = edited;
            data.gilded = gilded;
            data.gildings = gildings;
            data.id = id;
            data.isSubmitter = isSubmitter;
            data.likes = likes;
            data.linkAuthor = linkAuthor;
            data.linkId = linkId;
            data.linkPermalink = linkPermalink;
            data.linkTitle = linkTitle;
            data.linkUrl = linkUrl;
            data.locked = locked;
            data.modNote = modNote;
            data.modReasonBy = modReasonBy;
            data.modReasonTitle = modReasonTitle;
            data.modReports = modReports;
            data.modhash = modhash;
            data.name = name;
            data.noFollow = noFollow;
            data.numComments = numComments;
            data.numReports = numReports;
            data.over18 = over18;
            data.parentId = parentId;
            data.permalink = permalink;
            data.quarantine = quarantine;
            data.removalReason = removalReason;
            data.replies = replies;
            data.reportReasons = reportReasons;
            data.saved = saved;
            data.score = score;
            data.scoreHidden = scoreHidden;
            data.sendReplies = sendReplies;
            data.stewardReports = stewardReports;
            data.stickied = stickied;
            data.subreddit = subreddit;
            data.subredditId = subredditId;
            data.subredditNamePrefixed = subredditNamePrefixed;
            data.subredditType = subredditType;
            data.totalAwardsReceived = totalAwardsReceived;
            data.ups = ups;
            data.userReports = userReports;
            return data;
        }

    }

}
