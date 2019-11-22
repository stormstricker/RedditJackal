package redditjackal.entities;

import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsChildJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsDataJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsGildingsJson;

import java.util.List;

public class Comment extends Thing {
        private RedditorCommentsDataJson dataJson;

        public Comment(Redditor author, RedditorCommentsDataJson dataJson) {
                super(author);
                this.dataJson = dataJson;
        }

        public String toString()  {
                return subreddit + ": " + getBody();
        }

        //BC
        public String getLink()  {
                return "https://www.reddit.com" + getPermalink();
        }

        //AUTOGEN
        public String getAfter() {
                return dataJson.getAfter();
        }

        public List<Object> getAllAwardings() {
                return dataJson.getAllAwardings();
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

        public Object getAssociatedAward() {
                return dataJson.getAssociatedAward();
        }

        //fixed override
        public String getAuthorName() {
                return dataJson.getAuthor();
        }

        public String getAuthorFlairBackgroundColor() {
                return dataJson.getAuthorFlairBackgroundColor();
        }

        public String getAuthorFlairCssClass() {
                return dataJson.getAuthorFlairCssClass();
        }

        public List<Object> getAuthorFlairRichtext() {
                return dataJson.getAuthorFlairRichtext();
        }

        public Object getAuthorFlairTemplateId() {
                return dataJson.getAuthorFlairTemplateId();
        }

        public String getAuthorFlairText() {
                return dataJson.getAuthorFlairText();
        }

        public String getAuthorFlairTextColor() {
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

        public String getBody() {
                return dataJson.getBody();
        }

        public String getBodyHtml() {
                return dataJson.getBodyHtml();
        }

        public Boolean getCanGild() {
                return dataJson.getCanGild();
        }

        public Boolean getCanModPost() {
                return dataJson.getCanModPost();
        }

        public List<RedditorCommentsChildJson> getChildren() {
                return dataJson.getChildren();
        }

        public Boolean getCollapsed() {
                return dataJson.getCollapsed();
        }

        public Object getCollapsedBecauseCrowdControl() {
                return dataJson.getCollapsedBecauseCrowdControl();
        }

        public Object getCollapsedReason() {
                return dataJson.getCollapsedReason();
        }

        public Long getControversiality() {
                return dataJson.getControversiality();
        }

        public Long getCreated() {
                return dataJson.getCreated();
        }

        public Long getCreatedUtc() {
                return dataJson.getCreatedUtc();
        }

        public Long getDist() {
                return dataJson.getDist();
        }

        public Object getDistinguished() {
                return dataJson.getDistinguished();
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

        public RedditorCommentsGildingsJson getGildings() {
                return dataJson.getGildings();
        }

        public String getId() {
                return dataJson.getId();
        }

        public Boolean getIsSubmitter() {
                return dataJson.getIsSubmitter();
        }

        public Object getLikes() {
                return dataJson.getLikes();
        }

        public String getLinkAuthor() {
                return dataJson.getLinkAuthor();
        }

        public String getLinkId() {
                return dataJson.getLinkId();
        }

        public String getLinkPermalink() {
                return dataJson.getLinkPermalink();
        }

        public String getLinkTitle() {
                return dataJson.getLinkTitle();
        }

        public String getLinkUrl() {
                return dataJson.getLinkUrl();
        }

        public Boolean getLocked() {
                return dataJson.getLocked();
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

        public Object getNumReports() {
                return dataJson.getNumReports();
        }

        public Boolean getOver18() {
                return dataJson.getOver18();
        }

        public String getParentId() {
                return dataJson.getParentId();
        }

        public String getPermalink() {
                return dataJson.getPermalink();
        }

        public Boolean getQuarantine() {
                return dataJson.getQuarantine();
        }

        public Object getRemovalReason() {
                return dataJson.getRemovalReason();
        }

        public String getReplies() {
                return dataJson.getReplies();
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

        public Boolean getScoreHidden() {
                return dataJson.getScoreHidden();
        }

        public Boolean getSendReplies() {
                return dataJson.getSendReplies();
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

        public String getSubredditType() {
                return dataJson.getSubredditType();
        }

        public Long getTotalAwardsReceived() {
                return dataJson.getTotalAwardsReceived();
        }

        public Long getUps() {
                return dataJson.getUps();
        }

        public List<Object> getUserReports() {
                return dataJson.getUserReports();
        }
}
