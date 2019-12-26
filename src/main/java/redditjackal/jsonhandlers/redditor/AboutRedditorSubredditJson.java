
package redditjackal.jsonhandlers.redditor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AboutRedditorSubredditJson {

    @SerializedName("banner_img")
    private String bannerImg;
    @SerializedName("banner_size")
    private Object bannerSize;
    @SerializedName("community_icon")
    private String communityIcon;
    @SerializedName("default_set")
    private Boolean defaultSet;
    @Expose
    private String description;
    @SerializedName("disable_contributor_requests")
    private Boolean disableContributorRequests;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("display_name_prefixed")
    private String displayNamePrefixed;
    @SerializedName("free_form_reports")
    private Boolean freeFormReports;
    @SerializedName("header_img")
    private Object headerImg;
    @SerializedName("header_size")
    private Object headerSize;
    @SerializedName("icon_color")
    private String iconColor;
    @SerializedName("icon_img")
    private String iconImg;
    @SerializedName("icon_size")
    private List<Long> iconSize;
    @SerializedName("is_default_banner")
    private Boolean isDefaultBanner;
    @SerializedName("is_default_icon")
    private Boolean isDefaultIcon;
    @SerializedName("key_color")
    private String keyColor;
    @SerializedName("link_flair_enabled")
    private Boolean linkFlairEnabled;
    @SerializedName("link_flair_position")
    private String linkFlairPosition;
    @Expose
    private String name;
    @SerializedName("over_18")
    private Boolean over18;
    @SerializedName("primary_color")
    private String primaryColor;
    @SerializedName("public_description")
    private String publicDescription;
    @SerializedName("restrict_commenting")
    private Boolean restrictCommenting;
    @SerializedName("restrict_posting")
    private Boolean restrictPosting;
    @SerializedName("show_media")
    private Boolean showMedia;
    @SerializedName("submit_link_label")
    private String submitLinkLabel;
    @SerializedName("submit_text_label")
    private String submitTextLabel;
    @SerializedName("subreddit_type")
    private String subredditType;
    @Expose
    private Long subscribers;
    @Expose
    private String title;
    @Expose
    private String url;
    @SerializedName("user_is_banned")
    private Boolean userIsBanned;
    @SerializedName("user_is_contributor")
    private Boolean userIsContributor;
    @SerializedName("user_is_moderator")
    private Boolean userIsModerator;
    @SerializedName("user_is_muted")
    private Boolean userIsMuted;
    @SerializedName("user_is_subscriber")
    private Boolean userIsSubscriber;

    public String getBannerImg() {
        return bannerImg;
    }

    public Object getBannerSize() {
        return bannerSize;
    }

    public String getCommunityIcon() {
        return communityIcon;
    }

    public Boolean getDefaultSet() {
        return defaultSet;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getDisableContributorRequests() {
        return disableContributorRequests;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    public Boolean getFreeFormReports() {
        return freeFormReports;
    }

    public Object getHeaderImg() {
        return headerImg;
    }

    public Object getHeaderSize() {
        return headerSize;
    }

    public String getIconColor() {
        return iconColor;
    }

    public String getIconImg() {
        return iconImg;
    }

    public List<Long> getIconSize() {
        return iconSize;
    }

    public Boolean getIsDefaultBanner() {
        return isDefaultBanner;
    }

    public Boolean getIsDefaultIcon() {
        return isDefaultIcon;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    public String getName() {
        return name;
    }

    public Boolean getOver18() {
        return over18;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public Boolean getRestrictCommenting() {
        return restrictCommenting;
    }

    public Boolean getRestrictPosting() {
        return restrictPosting;
    }

    public Boolean getShowMedia() {
        return showMedia;
    }

    public String getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public Long getSubscribers() {
        return subscribers;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getUserIsBanned() {
        return userIsBanned;
    }

    public Boolean getUserIsContributor() {
        return userIsContributor;
    }

    public Boolean getUserIsModerator() {
        return userIsModerator;
    }

    public Boolean getUserIsMuted() {
        return userIsMuted;
    }

    public Boolean getUserIsSubscriber() {
        return userIsSubscriber;
    }

    public static class Builder {

        private String bannerImg;
        private Object bannerSize;
        private String communityIcon;
        private Boolean defaultSet;
        private String description;
        private Boolean disableContributorRequests;
        private String displayName;
        private String displayNamePrefixed;
        private Boolean freeFormReports;
        private Object headerImg;
        private Object headerSize;
        private String iconColor;
        private String iconImg;
        private List<Long> iconSize;
        private Boolean isDefaultBanner;
        private Boolean isDefaultIcon;
        private String keyColor;
        private Boolean linkFlairEnabled;
        private String linkFlairPosition;
        private String name;
        private Boolean over18;
        private String primaryColor;
        private String publicDescription;
        private Boolean restrictCommenting;
        private Boolean restrictPosting;
        private Boolean showMedia;
        private String submitLinkLabel;
        private String submitTextLabel;
        private String subredditType;
        private Long subscribers;
        private String title;
        private String url;
        private Boolean userIsBanned;
        private Boolean userIsContributor;
        private Boolean userIsModerator;
        private Boolean userIsMuted;
        private Boolean userIsSubscriber;

        public AboutRedditorSubredditJson.Builder withBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withBannerSize(Object bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withCommunityIcon(String communityIcon) {
            this.communityIcon = communityIcon;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withDefaultSet(Boolean defaultSet) {
            this.defaultSet = defaultSet;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withDisableContributorRequests(Boolean disableContributorRequests) {
            this.disableContributorRequests = disableContributorRequests;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withDisplayNamePrefixed(String displayNamePrefixed) {
            this.displayNamePrefixed = displayNamePrefixed;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withFreeFormReports(Boolean freeFormReports) {
            this.freeFormReports = freeFormReports;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withHeaderImg(Object headerImg) {
            this.headerImg = headerImg;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withHeaderSize(Object headerSize) {
            this.headerSize = headerSize;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withIconColor(String iconColor) {
            this.iconColor = iconColor;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withIconImg(String iconImg) {
            this.iconImg = iconImg;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withIconSize(List<Long> iconSize) {
            this.iconSize = iconSize;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withIsDefaultBanner(Boolean isDefaultBanner) {
            this.isDefaultBanner = isDefaultBanner;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withIsDefaultIcon(Boolean isDefaultIcon) {
            this.isDefaultIcon = isDefaultIcon;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withKeyColor(String keyColor) {
            this.keyColor = keyColor;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withLinkFlairEnabled(Boolean linkFlairEnabled) {
            this.linkFlairEnabled = linkFlairEnabled;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withLinkFlairPosition(String linkFlairPosition) {
            this.linkFlairPosition = linkFlairPosition;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withOver18(Boolean over18) {
            this.over18 = over18;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withPublicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withRestrictCommenting(Boolean restrictCommenting) {
            this.restrictCommenting = restrictCommenting;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withRestrictPosting(Boolean restrictPosting) {
            this.restrictPosting = restrictPosting;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withShowMedia(Boolean showMedia) {
            this.showMedia = showMedia;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withSubmitLinkLabel(String submitLinkLabel) {
            this.submitLinkLabel = submitLinkLabel;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withSubmitTextLabel(String submitTextLabel) {
            this.submitTextLabel = submitTextLabel;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withSubredditType(String subredditType) {
            this.subredditType = subredditType;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withSubscribers(Long subscribers) {
            this.subscribers = subscribers;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUserIsBanned(Boolean userIsBanned) {
            this.userIsBanned = userIsBanned;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUserIsContributor(Boolean userIsContributor) {
            this.userIsContributor = userIsContributor;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUserIsModerator(Boolean userIsModerator) {
            this.userIsModerator = userIsModerator;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUserIsMuted(Boolean userIsMuted) {
            this.userIsMuted = userIsMuted;
            return this;
        }

        public AboutRedditorSubredditJson.Builder withUserIsSubscriber(Boolean userIsSubscriber) {
            this.userIsSubscriber = userIsSubscriber;
            return this;
        }

        public AboutRedditorSubredditJson build() {
            AboutRedditorSubredditJson aboutRedditorSubredditJson = new AboutRedditorSubredditJson();
            aboutRedditorSubredditJson.bannerImg = bannerImg;
            aboutRedditorSubredditJson.bannerSize = bannerSize;
            aboutRedditorSubredditJson.communityIcon = communityIcon;
            aboutRedditorSubredditJson.defaultSet = defaultSet;
            aboutRedditorSubredditJson.description = description;
            aboutRedditorSubredditJson.disableContributorRequests = disableContributorRequests;
            aboutRedditorSubredditJson.displayName = displayName;
            aboutRedditorSubredditJson.displayNamePrefixed = displayNamePrefixed;
            aboutRedditorSubredditJson.freeFormReports = freeFormReports;
            aboutRedditorSubredditJson.headerImg = headerImg;
            aboutRedditorSubredditJson.headerSize = headerSize;
            aboutRedditorSubredditJson.iconColor = iconColor;
            aboutRedditorSubredditJson.iconImg = iconImg;
            aboutRedditorSubredditJson.iconSize = iconSize;
            aboutRedditorSubredditJson.isDefaultBanner = isDefaultBanner;
            aboutRedditorSubredditJson.isDefaultIcon = isDefaultIcon;
            aboutRedditorSubredditJson.keyColor = keyColor;
            aboutRedditorSubredditJson.linkFlairEnabled = linkFlairEnabled;
            aboutRedditorSubredditJson.linkFlairPosition = linkFlairPosition;
            aboutRedditorSubredditJson.name = name;
            aboutRedditorSubredditJson.over18 = over18;
            aboutRedditorSubredditJson.primaryColor = primaryColor;
            aboutRedditorSubredditJson.publicDescription = publicDescription;
            aboutRedditorSubredditJson.restrictCommenting = restrictCommenting;
            aboutRedditorSubredditJson.restrictPosting = restrictPosting;
            aboutRedditorSubredditJson.showMedia = showMedia;
            aboutRedditorSubredditJson.submitLinkLabel = submitLinkLabel;
            aboutRedditorSubredditJson.submitTextLabel = submitTextLabel;
            aboutRedditorSubredditJson.subredditType = subredditType;
            aboutRedditorSubredditJson.subscribers = subscribers;
            aboutRedditorSubredditJson.title = title;
            aboutRedditorSubredditJson.url = url;
            aboutRedditorSubredditJson.userIsBanned = userIsBanned;
            aboutRedditorSubredditJson.userIsContributor = userIsContributor;
            aboutRedditorSubredditJson.userIsModerator = userIsModerator;
            aboutRedditorSubredditJson.userIsMuted = userIsMuted;
            aboutRedditorSubredditJson.userIsSubscriber = userIsSubscriber;
            return aboutRedditorSubredditJson;
        }

    }

}
