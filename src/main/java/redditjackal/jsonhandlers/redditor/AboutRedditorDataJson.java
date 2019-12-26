
package redditjackal.jsonhandlers.redditor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AboutRedditorDataJson {
    @SerializedName("comment_karma")
    private Long commentKarma;
    @Expose
    private Long created;
    @SerializedName("created_utc")
    private Long createdUtc;
    @SerializedName("has_subscribed")
    private Boolean hasSubscribed;
    @SerializedName("has_verified_email")
    private Boolean hasVerifiedEmail;
    @SerializedName("hide_from_robots")
    private Boolean hideFromRobots;
    @SerializedName("icon_img")
    private String iconImg;
    @Expose
    private String id;
    @SerializedName("is_employee")
    private Boolean isEmployee;
    @SerializedName("is_friend")
    private Boolean isFriend;
    @SerializedName("is_gold")
    private Boolean isGold;
    @SerializedName("is_mod")
    private Boolean isMod;
    @SerializedName("link_karma")
    private Long linkKarma;
    @Expose
    private String name;
    @SerializedName("pref_show_snoovatar")
    private Boolean prefShowSnoovatar;
    @SerializedName("subreddit")
    private AboutRedditorSubredditJson aboutRedditorSubredditJson;
    @Expose
    private Boolean verified;

    public Long getCommentKarma() {
        return commentKarma;
    }

    public Long getCreated() {
        return created;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public Boolean getHasSubscribed() {
        return hasSubscribed;
    }

    public Boolean getHasVerifiedEmail() {
        return hasVerifiedEmail;
    }

    public Boolean getHideFromRobots() {
        return hideFromRobots;
    }

    public String getIconImg() {
        return iconImg;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }

    public Boolean getIsFriend() {
        return isFriend;
    }

    public Boolean getIsGold() {
        return isGold;
    }

    public Boolean getIsMod() {
        return isMod;
    }

    public Long getLinkKarma() {
        return linkKarma;
    }

    public String getName() {
        return name;
    }

    public Boolean getPrefShowSnoovatar() {
        return prefShowSnoovatar;
    }

    public AboutRedditorSubredditJson getAboutRedditorSubredditJson() {
        return aboutRedditorSubredditJson;
    }

    public Boolean getVerified() {
        return verified;
    }

    public static class Builder {

        private Long commentKarma;
        private Long created;
        private Long createdUtc;
        private Boolean hasSubscribed;
        private Boolean hasVerifiedEmail;
        private Boolean hideFromRobots;
        private String iconImg;
        private String id;
        private Boolean isEmployee;
        private Boolean isFriend;
        private Boolean isGold;
        private Boolean isMod;
        private Long linkKarma;
        private String name;
        private Boolean prefShowSnoovatar;
        private AboutRedditorSubredditJson aboutRedditorSubredditJson;
        private Boolean verified;

        public AboutRedditorDataJson.Builder withCommentKarma(Long commentKarma) {
            this.commentKarma = commentKarma;
            return this;
        }

        public AboutRedditorDataJson.Builder withCreated(Long created) {
            this.created = created;
            return this;
        }

        public AboutRedditorDataJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public AboutRedditorDataJson.Builder withHasSubscribed(Boolean hasSubscribed) {
            this.hasSubscribed = hasSubscribed;
            return this;
        }

        public AboutRedditorDataJson.Builder withHasVerifiedEmail(Boolean hasVerifiedEmail) {
            this.hasVerifiedEmail = hasVerifiedEmail;
            return this;
        }

        public AboutRedditorDataJson.Builder withHideFromRobots(Boolean hideFromRobots) {
            this.hideFromRobots = hideFromRobots;
            return this;
        }

        public AboutRedditorDataJson.Builder withIconImg(String iconImg) {
            this.iconImg = iconImg;
            return this;
        }

        public AboutRedditorDataJson.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public AboutRedditorDataJson.Builder withIsEmployee(Boolean isEmployee) {
            this.isEmployee = isEmployee;
            return this;
        }

        public AboutRedditorDataJson.Builder withIsFriend(Boolean isFriend) {
            this.isFriend = isFriend;
            return this;
        }

        public AboutRedditorDataJson.Builder withIsGold(Boolean isGold) {
            this.isGold = isGold;
            return this;
        }

        public AboutRedditorDataJson.Builder withIsMod(Boolean isMod) {
            this.isMod = isMod;
            return this;
        }

        public AboutRedditorDataJson.Builder withLinkKarma(Long linkKarma) {
            this.linkKarma = linkKarma;
            return this;
        }

        public AboutRedditorDataJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public AboutRedditorDataJson.Builder withPrefShowSnoovatar(Boolean prefShowSnoovatar) {
            this.prefShowSnoovatar = prefShowSnoovatar;
            return this;
        }

        public AboutRedditorDataJson.Builder withSubreddit(AboutRedditorSubredditJson aboutRedditorSubredditJson) {
            this.aboutRedditorSubredditJson = aboutRedditorSubredditJson;
            return this;
        }

        public AboutRedditorDataJson.Builder withVerified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        public AboutRedditorDataJson build() {
            AboutRedditorDataJson aboutRedditorDataJson = new AboutRedditorDataJson();
            aboutRedditorDataJson.commentKarma = commentKarma;
            aboutRedditorDataJson.created = created;
            aboutRedditorDataJson.createdUtc = createdUtc;
            aboutRedditorDataJson.hasSubscribed = hasSubscribed;
            aboutRedditorDataJson.hasVerifiedEmail = hasVerifiedEmail;
            aboutRedditorDataJson.hideFromRobots = hideFromRobots;
            aboutRedditorDataJson.iconImg = iconImg;
            aboutRedditorDataJson.id = id;
            aboutRedditorDataJson.isEmployee = isEmployee;
            aboutRedditorDataJson.isFriend = isFriend;
            aboutRedditorDataJson.isGold = isGold;
            aboutRedditorDataJson.isMod = isMod;
            aboutRedditorDataJson.linkKarma = linkKarma;
            aboutRedditorDataJson.name = name;
            aboutRedditorDataJson.prefShowSnoovatar = prefShowSnoovatar;
            aboutRedditorDataJson.aboutRedditorSubredditJson = aboutRedditorSubredditJson;
            aboutRedditorDataJson.verified = verified;
            return aboutRedditorDataJson;
        }

    }

}
