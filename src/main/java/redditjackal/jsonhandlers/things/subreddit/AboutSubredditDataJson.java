
package redditjackal.jsonhandlers.things.subreddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AboutSubredditDataJson {

    @SerializedName("accounts_active")
    private Long accountsActive;
    @SerializedName("accounts_active_is_fuzzed")
    private Boolean accountsActiveIsFuzzed;
    @SerializedName("active_user_count")
    private Long activeUserCount;
    @SerializedName("advertiser_category")
    private String advertiserCategory;
    @SerializedName("all_original_content")
    private Boolean allOriginalContent;
    @SerializedName("allow_discovery")
    private Boolean allowDiscovery;
    @SerializedName("allow_images")
    private Boolean allowImages;
    @SerializedName("allow_videogifs")
    private Boolean allowVideogifs;
    @SerializedName("allow_videos")
    private Boolean allowVideos;
    @SerializedName("banner_background_color")
    private String bannerBackgroundColor;
    @SerializedName("banner_background_image")
    private String bannerBackgroundImage;
    @SerializedName("banner_img")
    private String bannerImg;
    @SerializedName("banner_size")
    private List<Long> bannerSize;
    @SerializedName("can_assign_link_flair")
    private Boolean canAssignLinkFlair;
    @SerializedName("can_assign_user_flair")
    private Boolean canAssignUserFlair;
    @SerializedName("collapse_deleted_comments")
    private Boolean collapseDeletedComments;
    @SerializedName("comment_score_hide_mins")
    private Long commentScoreHideMins;
    @SerializedName("community_icon")
    private String communityIcon;
    @Expose
    private Long created;
    @SerializedName("created_utc")
    private Long createdUtc;
    @Expose
    private String description;
    @SerializedName("description_html")
    private String descriptionHtml;
    @SerializedName("disable_contributor_requests")
    private Boolean disableContributorRequests;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("display_name_prefixed")
    private String displayNamePrefixed;
    @SerializedName("emojis_custom_size")
    private Object emojisCustomSize;
    @SerializedName("emojis_enabled")
    private Boolean emojisEnabled;
    @SerializedName("free_form_reports")
    private Boolean freeFormReports;
    @SerializedName("has_menu_widget")
    private Boolean hasMenuWidget;
    @SerializedName("header_img")
    private String headerImg;
    @SerializedName("header_size")
    private List<Long> headerSize;
    @SerializedName("header_title")
    private String headerTitle;
    @SerializedName("hide_ads")
    private Boolean hideAds;
    @SerializedName("icon_img")
    private String iconImg;
    @SerializedName("icon_size")
    private List<Long> iconSize;
    @Expose
    private String id;
    @SerializedName("is_crosspostable_subreddit")
    private Boolean isCrosspostableSubreddit;
    @SerializedName("is_enrolled_in_new_modmail")
    private Object isEnrolledInNewModmail;
    @SerializedName("key_color")
    private String keyColor;
    @Expose
    private String lang;
    @SerializedName("link_flair_enabled")
    private Boolean linkFlairEnabled;
    @SerializedName("link_flair_position")
    private String linkFlairPosition;
    @SerializedName("mobile_banner_image")
    private String mobileBannerImage;
    @Expose
    private String name;
    @SerializedName("notification_level")
    private Object notificationLevel;
    @SerializedName("original_content_tag_enabled")
    private Boolean originalContentTagEnabled;
    @Expose
    private Boolean over18;
    @SerializedName("primary_color")
    private String primaryColor;
    @SerializedName("public_description")
    private String publicDescription;
    @SerializedName("public_description_html")
    private String publicDescriptionHtml;
    @SerializedName("public_traffic")
    private Boolean publicTraffic;
    @Expose
    private Boolean quarantine;
    @SerializedName("restrict_commenting")
    private Boolean restrictCommenting;
    @SerializedName("restrict_posting")
    private Boolean restrictPosting;
    @SerializedName("show_media")
    private Boolean showMedia;
    @SerializedName("show_media_preview")
    private Boolean showMediaPreview;
    @SerializedName("spoilers_enabled")
    private Boolean spoilersEnabled;
    @SerializedName("submission_type")
    private String submissionType;
    @SerializedName("submit_link_label")
    private Object submitLinkLabel;
    @SerializedName("submit_text")
    private String submitText;
    @SerializedName("submit_text_html")
    private String submitTextHtml;
    @SerializedName("submit_text_label")
    private Object submitTextLabel;
    @SerializedName("subreddit_type")
    private String subredditType;
    @Expose
    private Long subscribers;
    @SerializedName("suggested_comment_sort")
    private Object suggestedCommentSort;
    @Expose
    private String title;
    @Expose
    private String url;
    @SerializedName("user_can_flair_in_sr")
    private Object userCanFlairInSr;
    @SerializedName("user_flair_background_color")
    private Object userFlairBackgroundColor;
    @SerializedName("user_flair_css_class")
    private Object userFlairCssClass;
    @SerializedName("user_flair_enabled_in_sr")
    private Boolean userFlairEnabledInSr;
    @SerializedName("user_flair_position")
    private String userFlairPosition;
    @SerializedName("user_flair_richtext")
    private List<Object> userFlairRichtext;
    @SerializedName("user_flair_template_id")
    private Object userFlairTemplateId;
    @SerializedName("user_flair_text")
    private Object userFlairText;
    @SerializedName("user_flair_text_color")
    private Object userFlairTextColor;
    @SerializedName("user_flair_type")
    private String userFlairType;
    @SerializedName("user_has_favorited")
    private Boolean userHasFavorited;
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
    @SerializedName("user_sr_flair_enabled")
    private Boolean userSrFlairEnabled;
    @SerializedName("user_sr_theme_enabled")
    private Boolean userSrThemeEnabled;
    @SerializedName("whitelist_status")
    private String whitelistStatus;
    @SerializedName("wiki_enabled")
    private Boolean wikiEnabled;
    @Expose
    private Long wls;

    public Long getAccountsActive() {
        return accountsActive;
    }

    public Boolean getAccountsActiveIsFuzzed() {
        return accountsActiveIsFuzzed;
    }

    public Long getActiveUserCount() {
        return activeUserCount;
    }

    public String getAdvertiserCategory() {
        return advertiserCategory;
    }

    public Boolean getAllOriginalContent() {
        return allOriginalContent;
    }

    public Boolean getAllowDiscovery() {
        return allowDiscovery;
    }

    public Boolean getAllowImages() {
        return allowImages;
    }

    public Boolean getAllowVideogifs() {
        return allowVideogifs;
    }

    public Boolean getAllowVideos() {
        return allowVideos;
    }

    public String getBannerBackgroundColor() {
        return bannerBackgroundColor;
    }

    public String getBannerBackgroundImage() {
        return bannerBackgroundImage;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public List<Long> getBannerSize() {
        return bannerSize;
    }

    public Boolean getCanAssignLinkFlair() {
        return canAssignLinkFlair;
    }

    public Boolean getCanAssignUserFlair() {
        return canAssignUserFlair;
    }

    public Boolean getCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    public Long getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    public String getCommunityIcon() {
        return communityIcon;
    }

    public Long getCreated() {
        return created;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
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

    public Object getEmojisCustomSize() {
        return emojisCustomSize;
    }

    public Boolean getEmojisEnabled() {
        return emojisEnabled;
    }

    public Boolean getFreeFormReports() {
        return freeFormReports;
    }

    public Boolean getHasMenuWidget() {
        return hasMenuWidget;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public List<Long> getHeaderSize() {
        return headerSize;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public Boolean getHideAds() {
        return hideAds;
    }

    public String getIconImg() {
        return iconImg;
    }

    public List<Long> getIconSize() {
        return iconSize;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsCrosspostableSubreddit() {
        return isCrosspostableSubreddit;
    }

    public Object getIsEnrolledInNewModmail() {
        return isEnrolledInNewModmail;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public String getLang() {
        return lang;
    }

    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    public String getMobileBannerImage() {
        return mobileBannerImage;
    }

    public String getName() {
        return name;
    }

    public Object getNotificationLevel() {
        return notificationLevel;
    }

    public Boolean getOriginalContentTagEnabled() {
        return originalContentTagEnabled;
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

    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    public Boolean getPublicTraffic() {
        return publicTraffic;
    }

    public Boolean getQuarantine() {
        return quarantine;
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

    public Boolean getShowMediaPreview() {
        return showMediaPreview;
    }

    public Boolean getSpoilersEnabled() {
        return spoilersEnabled;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public Object getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public String getSubmitText() {
        return submitText;
    }

    public String getSubmitTextHtml() {
        return submitTextHtml;
    }

    public Object getSubmitTextLabel() {
        return submitTextLabel;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public Long getSubscribers() {
        return subscribers;
    }

    public Object getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Object getUserCanFlairInSr() {
        return userCanFlairInSr;
    }

    public Object getUserFlairBackgroundColor() {
        return userFlairBackgroundColor;
    }

    public Object getUserFlairCssClass() {
        return userFlairCssClass;
    }

    public Boolean getUserFlairEnabledInSr() {
        return userFlairEnabledInSr;
    }

    public String getUserFlairPosition() {
        return userFlairPosition;
    }

    public List<Object> getUserFlairRichtext() {
        return userFlairRichtext;
    }

    public Object getUserFlairTemplateId() {
        return userFlairTemplateId;
    }

    public Object getUserFlairText() {
        return userFlairText;
    }

    public Object getUserFlairTextColor() {
        return userFlairTextColor;
    }

    public String getUserFlairType() {
        return userFlairType;
    }

    public Boolean getUserHasFavorited() {
        return userHasFavorited;
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

    public Boolean getUserSrFlairEnabled() {
        return userSrFlairEnabled;
    }

    public Boolean getUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    public Long getWls() {
        return wls;
    }

    public static class Builder {

        private Long accountsActive;
        private Boolean accountsActiveIsFuzzed;
        private Long activeUserCount;
        private String advertiserCategory;
        private Boolean allOriginalContent;
        private Boolean allowDiscovery;
        private Boolean allowImages;
        private Boolean allowVideogifs;
        private Boolean allowVideos;
        private String bannerBackgroundColor;
        private String bannerBackgroundImage;
        private String bannerImg;
        private List<Long> bannerSize;
        private Boolean canAssignLinkFlair;
        private Boolean canAssignUserFlair;
        private Boolean collapseDeletedComments;
        private Long commentScoreHideMins;
        private String communityIcon;
        private Long created;
        private Long createdUtc;
        private String description;
        private String descriptionHtml;
        private Boolean disableContributorRequests;
        private String displayName;
        private String displayNamePrefixed;
        private Object emojisCustomSize;
        private Boolean emojisEnabled;
        private Boolean freeFormReports;
        private Boolean hasMenuWidget;
        private String headerImg;
        private List<Long> headerSize;
        private String headerTitle;
        private Boolean hideAds;
        private String iconImg;
        private List<Long> iconSize;
        private String id;
        private Boolean isCrosspostableSubreddit;
        private Object isEnrolledInNewModmail;
        private String keyColor;
        private String lang;
        private Boolean linkFlairEnabled;
        private String linkFlairPosition;
        private String mobileBannerImage;
        private String name;
        private Object notificationLevel;
        private Boolean originalContentTagEnabled;
        private Boolean over18;
        private String primaryColor;
        private String publicDescription;
        private String publicDescriptionHtml;
        private Boolean publicTraffic;
        private Boolean quarantine;
        private Boolean restrictCommenting;
        private Boolean restrictPosting;
        private Boolean showMedia;
        private Boolean showMediaPreview;
        private Boolean spoilersEnabled;
        private String submissionType;
        private Object submitLinkLabel;
        private String submitText;
        private String submitTextHtml;
        private Object submitTextLabel;
        private String subredditType;
        private Long subscribers;
        private Object suggestedCommentSort;
        private String title;
        private String url;
        private Object userCanFlairInSr;
        private Object userFlairBackgroundColor;
        private Object userFlairCssClass;
        private Boolean userFlairEnabledInSr;
        private String userFlairPosition;
        private List<Object> userFlairRichtext;
        private Object userFlairTemplateId;
        private Object userFlairText;
        private Object userFlairTextColor;
        private String userFlairType;
        private Boolean userHasFavorited;
        private Boolean userIsBanned;
        private Boolean userIsContributor;
        private Boolean userIsModerator;
        private Boolean userIsMuted;
        private Boolean userIsSubscriber;
        private Boolean userSrFlairEnabled;
        private Boolean userSrThemeEnabled;
        private String whitelistStatus;
        private Boolean wikiEnabled;
        private Long wls;

        public AboutSubredditDataJson.Builder withAccountsActive(Long accountsActive) {
            this.accountsActive = accountsActive;
            return this;
        }

        public AboutSubredditDataJson.Builder withAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
            this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
            return this;
        }

        public AboutSubredditDataJson.Builder withActiveUserCount(Long activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }

        public AboutSubredditDataJson.Builder withAdvertiserCategory(String advertiserCategory) {
            this.advertiserCategory = advertiserCategory;
            return this;
        }

        public AboutSubredditDataJson.Builder withAllOriginalContent(Boolean allOriginalContent) {
            this.allOriginalContent = allOriginalContent;
            return this;
        }

        public AboutSubredditDataJson.Builder withAllowDiscovery(Boolean allowDiscovery) {
            this.allowDiscovery = allowDiscovery;
            return this;
        }

        public AboutSubredditDataJson.Builder withAllowImages(Boolean allowImages) {
            this.allowImages = allowImages;
            return this;
        }

        public AboutSubredditDataJson.Builder withAllowVideogifs(Boolean allowVideogifs) {
            this.allowVideogifs = allowVideogifs;
            return this;
        }

        public AboutSubredditDataJson.Builder withAllowVideos(Boolean allowVideos) {
            this.allowVideos = allowVideos;
            return this;
        }

        public AboutSubredditDataJson.Builder withBannerBackgroundColor(String bannerBackgroundColor) {
            this.bannerBackgroundColor = bannerBackgroundColor;
            return this;
        }

        public AboutSubredditDataJson.Builder withBannerBackgroundImage(String bannerBackgroundImage) {
            this.bannerBackgroundImage = bannerBackgroundImage;
            return this;
        }

        public AboutSubredditDataJson.Builder withBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
            return this;
        }

        public AboutSubredditDataJson.Builder withBannerSize(List<Long> bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        public AboutSubredditDataJson.Builder withCanAssignLinkFlair(Boolean canAssignLinkFlair) {
            this.canAssignLinkFlair = canAssignLinkFlair;
            return this;
        }

        public AboutSubredditDataJson.Builder withCanAssignUserFlair(Boolean canAssignUserFlair) {
            this.canAssignUserFlair = canAssignUserFlair;
            return this;
        }

        public AboutSubredditDataJson.Builder withCollapseDeletedComments(Boolean collapseDeletedComments) {
            this.collapseDeletedComments = collapseDeletedComments;
            return this;
        }

        public AboutSubredditDataJson.Builder withCommentScoreHideMins(Long commentScoreHideMins) {
            this.commentScoreHideMins = commentScoreHideMins;
            return this;
        }

        public AboutSubredditDataJson.Builder withCommunityIcon(String communityIcon) {
            this.communityIcon = communityIcon;
            return this;
        }

        public AboutSubredditDataJson.Builder withCreated(Long created) {
            this.created = created;
            return this;
        }

        public AboutSubredditDataJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public AboutSubredditDataJson.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public AboutSubredditDataJson.Builder withDescriptionHtml(String descriptionHtml) {
            this.descriptionHtml = descriptionHtml;
            return this;
        }

        public AboutSubredditDataJson.Builder withDisableContributorRequests(Boolean disableContributorRequests) {
            this.disableContributorRequests = disableContributorRequests;
            return this;
        }

        public AboutSubredditDataJson.Builder withDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public AboutSubredditDataJson.Builder withDisplayNamePrefixed(String displayNamePrefixed) {
            this.displayNamePrefixed = displayNamePrefixed;
            return this;
        }

        public AboutSubredditDataJson.Builder withEmojisCustomSize(Object emojisCustomSize) {
            this.emojisCustomSize = emojisCustomSize;
            return this;
        }

        public AboutSubredditDataJson.Builder withEmojisEnabled(Boolean emojisEnabled) {
            this.emojisEnabled = emojisEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withFreeFormReports(Boolean freeFormReports) {
            this.freeFormReports = freeFormReports;
            return this;
        }

        public AboutSubredditDataJson.Builder withHasMenuWidget(Boolean hasMenuWidget) {
            this.hasMenuWidget = hasMenuWidget;
            return this;
        }

        public AboutSubredditDataJson.Builder withHeaderImg(String headerImg) {
            this.headerImg = headerImg;
            return this;
        }

        public AboutSubredditDataJson.Builder withHeaderSize(List<Long> headerSize) {
            this.headerSize = headerSize;
            return this;
        }

        public AboutSubredditDataJson.Builder withHeaderTitle(String headerTitle) {
            this.headerTitle = headerTitle;
            return this;
        }

        public AboutSubredditDataJson.Builder withHideAds(Boolean hideAds) {
            this.hideAds = hideAds;
            return this;
        }

        public AboutSubredditDataJson.Builder withIconImg(String iconImg) {
            this.iconImg = iconImg;
            return this;
        }

        public AboutSubredditDataJson.Builder withIconSize(List<Long> iconSize) {
            this.iconSize = iconSize;
            return this;
        }

        public AboutSubredditDataJson.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public AboutSubredditDataJson.Builder withIsCrosspostableSubreddit(Boolean isCrosspostableSubreddit) {
            this.isCrosspostableSubreddit = isCrosspostableSubreddit;
            return this;
        }

        public AboutSubredditDataJson.Builder withIsEnrolledInNewModmail(Object isEnrolledInNewModmail) {
            this.isEnrolledInNewModmail = isEnrolledInNewModmail;
            return this;
        }

        public AboutSubredditDataJson.Builder withKeyColor(String keyColor) {
            this.keyColor = keyColor;
            return this;
        }

        public AboutSubredditDataJson.Builder withLang(String lang) {
            this.lang = lang;
            return this;
        }

        public AboutSubredditDataJson.Builder withLinkFlairEnabled(Boolean linkFlairEnabled) {
            this.linkFlairEnabled = linkFlairEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withLinkFlairPosition(String linkFlairPosition) {
            this.linkFlairPosition = linkFlairPosition;
            return this;
        }

        public AboutSubredditDataJson.Builder withMobileBannerImage(String mobileBannerImage) {
            this.mobileBannerImage = mobileBannerImage;
            return this;
        }

        public AboutSubredditDataJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public AboutSubredditDataJson.Builder withNotificationLevel(Object notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }

        public AboutSubredditDataJson.Builder withOriginalContentTagEnabled(Boolean originalContentTagEnabled) {
            this.originalContentTagEnabled = originalContentTagEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withOver18(Boolean over18) {
            this.over18 = over18;
            return this;
        }

        public AboutSubredditDataJson.Builder withPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public AboutSubredditDataJson.Builder withPublicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
            return this;
        }

        public AboutSubredditDataJson.Builder withPublicDescriptionHtml(String publicDescriptionHtml) {
            this.publicDescriptionHtml = publicDescriptionHtml;
            return this;
        }

        public AboutSubredditDataJson.Builder withPublicTraffic(Boolean publicTraffic) {
            this.publicTraffic = publicTraffic;
            return this;
        }

        public AboutSubredditDataJson.Builder withQuarantine(Boolean quarantine) {
            this.quarantine = quarantine;
            return this;
        }

        public AboutSubredditDataJson.Builder withRestrictCommenting(Boolean restrictCommenting) {
            this.restrictCommenting = restrictCommenting;
            return this;
        }

        public AboutSubredditDataJson.Builder withRestrictPosting(Boolean restrictPosting) {
            this.restrictPosting = restrictPosting;
            return this;
        }

        public AboutSubredditDataJson.Builder withShowMedia(Boolean showMedia) {
            this.showMedia = showMedia;
            return this;
        }

        public AboutSubredditDataJson.Builder withShowMediaPreview(Boolean showMediaPreview) {
            this.showMediaPreview = showMediaPreview;
            return this;
        }

        public AboutSubredditDataJson.Builder withSpoilersEnabled(Boolean spoilersEnabled) {
            this.spoilersEnabled = spoilersEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubmissionType(String submissionType) {
            this.submissionType = submissionType;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubmitLinkLabel(Object submitLinkLabel) {
            this.submitLinkLabel = submitLinkLabel;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubmitText(String submitText) {
            this.submitText = submitText;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubmitTextHtml(String submitTextHtml) {
            this.submitTextHtml = submitTextHtml;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubmitTextLabel(Object submitTextLabel) {
            this.submitTextLabel = submitTextLabel;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubredditType(String subredditType) {
            this.subredditType = subredditType;
            return this;
        }

        public AboutSubredditDataJson.Builder withSubscribers(Long subscribers) {
            this.subscribers = subscribers;
            return this;
        }

        public AboutSubredditDataJson.Builder withSuggestedCommentSort(Object suggestedCommentSort) {
            this.suggestedCommentSort = suggestedCommentSort;
            return this;
        }

        public AboutSubredditDataJson.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public AboutSubredditDataJson.Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserCanFlairInSr(Object userCanFlairInSr) {
            this.userCanFlairInSr = userCanFlairInSr;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairBackgroundColor(Object userFlairBackgroundColor) {
            this.userFlairBackgroundColor = userFlairBackgroundColor;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairCssClass(Object userFlairCssClass) {
            this.userFlairCssClass = userFlairCssClass;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
            this.userFlairEnabledInSr = userFlairEnabledInSr;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairPosition(String userFlairPosition) {
            this.userFlairPosition = userFlairPosition;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairRichtext(List<Object> userFlairRichtext) {
            this.userFlairRichtext = userFlairRichtext;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairTemplateId(Object userFlairTemplateId) {
            this.userFlairTemplateId = userFlairTemplateId;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairText(Object userFlairText) {
            this.userFlairText = userFlairText;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairTextColor(Object userFlairTextColor) {
            this.userFlairTextColor = userFlairTextColor;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserFlairType(String userFlairType) {
            this.userFlairType = userFlairType;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserHasFavorited(Boolean userHasFavorited) {
            this.userHasFavorited = userHasFavorited;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserIsBanned(Boolean userIsBanned) {
            this.userIsBanned = userIsBanned;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserIsContributor(Boolean userIsContributor) {
            this.userIsContributor = userIsContributor;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserIsModerator(Boolean userIsModerator) {
            this.userIsModerator = userIsModerator;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserIsMuted(Boolean userIsMuted) {
            this.userIsMuted = userIsMuted;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserIsSubscriber(Boolean userIsSubscriber) {
            this.userIsSubscriber = userIsSubscriber;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserSrFlairEnabled(Boolean userSrFlairEnabled) {
            this.userSrFlairEnabled = userSrFlairEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withUserSrThemeEnabled(Boolean userSrThemeEnabled) {
            this.userSrThemeEnabled = userSrThemeEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withWhitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
            return this;
        }

        public AboutSubredditDataJson.Builder withWikiEnabled(Boolean wikiEnabled) {
            this.wikiEnabled = wikiEnabled;
            return this;
        }

        public AboutSubredditDataJson.Builder withWls(Long wls) {
            this.wls = wls;
            return this;
        }

        public AboutSubredditDataJson build() {
            AboutSubredditDataJson data = new AboutSubredditDataJson();
            data.accountsActive = accountsActive;
            data.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
            data.activeUserCount = activeUserCount;
            data.advertiserCategory = advertiserCategory;
            data.allOriginalContent = allOriginalContent;
            data.allowDiscovery = allowDiscovery;
            data.allowImages = allowImages;
            data.allowVideogifs = allowVideogifs;
            data.allowVideos = allowVideos;
            data.bannerBackgroundColor = bannerBackgroundColor;
            data.bannerBackgroundImage = bannerBackgroundImage;
            data.bannerImg = bannerImg;
            data.bannerSize = bannerSize;
            data.canAssignLinkFlair = canAssignLinkFlair;
            data.canAssignUserFlair = canAssignUserFlair;
            data.collapseDeletedComments = collapseDeletedComments;
            data.commentScoreHideMins = commentScoreHideMins;
            data.communityIcon = communityIcon;
            data.created = created;
            data.createdUtc = createdUtc;
            data.description = description;
            data.descriptionHtml = descriptionHtml;
            data.disableContributorRequests = disableContributorRequests;
            data.displayName = displayName;
            data.displayNamePrefixed = displayNamePrefixed;
            data.emojisCustomSize = emojisCustomSize;
            data.emojisEnabled = emojisEnabled;
            data.freeFormReports = freeFormReports;
            data.hasMenuWidget = hasMenuWidget;
            data.headerImg = headerImg;
            data.headerSize = headerSize;
            data.headerTitle = headerTitle;
            data.hideAds = hideAds;
            data.iconImg = iconImg;
            data.iconSize = iconSize;
            data.id = id;
            data.isCrosspostableSubreddit = isCrosspostableSubreddit;
            data.isEnrolledInNewModmail = isEnrolledInNewModmail;
            data.keyColor = keyColor;
            data.lang = lang;
            data.linkFlairEnabled = linkFlairEnabled;
            data.linkFlairPosition = linkFlairPosition;
            data.mobileBannerImage = mobileBannerImage;
            data.name = name;
            data.notificationLevel = notificationLevel;
            data.originalContentTagEnabled = originalContentTagEnabled;
            data.over18 = over18;
            data.primaryColor = primaryColor;
            data.publicDescription = publicDescription;
            data.publicDescriptionHtml = publicDescriptionHtml;
            data.publicTraffic = publicTraffic;
            data.quarantine = quarantine;
            data.restrictCommenting = restrictCommenting;
            data.restrictPosting = restrictPosting;
            data.showMedia = showMedia;
            data.showMediaPreview = showMediaPreview;
            data.spoilersEnabled = spoilersEnabled;
            data.submissionType = submissionType;
            data.submitLinkLabel = submitLinkLabel;
            data.submitText = submitText;
            data.submitTextHtml = submitTextHtml;
            data.submitTextLabel = submitTextLabel;
            data.subredditType = subredditType;
            data.subscribers = subscribers;
            data.suggestedCommentSort = suggestedCommentSort;
            data.title = title;
            data.url = url;
            data.userCanFlairInSr = userCanFlairInSr;
            data.userFlairBackgroundColor = userFlairBackgroundColor;
            data.userFlairCssClass = userFlairCssClass;
            data.userFlairEnabledInSr = userFlairEnabledInSr;
            data.userFlairPosition = userFlairPosition;
            data.userFlairRichtext = userFlairRichtext;
            data.userFlairTemplateId = userFlairTemplateId;
            data.userFlairText = userFlairText;
            data.userFlairTextColor = userFlairTextColor;
            data.userFlairType = userFlairType;
            data.userHasFavorited = userHasFavorited;
            data.userIsBanned = userIsBanned;
            data.userIsContributor = userIsContributor;
            data.userIsModerator = userIsModerator;
            data.userIsMuted = userIsMuted;
            data.userIsSubscriber = userIsSubscriber;
            data.userSrFlairEnabled = userSrFlairEnabled;
            data.userSrThemeEnabled = userSrThemeEnabled;
            data.whitelistStatus = whitelistStatus;
            data.wikiEnabled = wikiEnabled;
            data.wls = wls;
            return data;
        }

    }

}
