
package redditjackal.jsonhandlers.things.subreddit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SubredditRuleJson {

    @SerializedName("created_utc")
    private Long createdUtc;
    @Expose
    private String description;
    @SerializedName("description_html")
    private String descriptionHtml;
    @Expose
    private String kind;
    @Expose
    private Long priority;
    @SerializedName("short_name")
    private String shortName;
    @SerializedName("violation_reason")
    private String violationReason;

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public String getKind() {
        return kind;
    }

    public Long getPriority() {
        return priority;
    }

    public String getShortName() {
        return shortName;
    }

    public String getViolationReason() {
        return violationReason;
    }

    public static class Builder {

        private Long createdUtc;
        private String description;
        private String descriptionHtml;
        private String kind;
        private Long priority;
        private String shortName;
        private String violationReason;

        public SubredditRuleJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public SubredditRuleJson.Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public SubredditRuleJson.Builder withDescriptionHtml(String descriptionHtml) {
            this.descriptionHtml = descriptionHtml;
            return this;
        }

        public SubredditRuleJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public SubredditRuleJson.Builder withPriority(Long priority) {
            this.priority = priority;
            return this;
        }

        public SubredditRuleJson.Builder withShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }

        public SubredditRuleJson.Builder withViolationReason(String violationReason) {
            this.violationReason = violationReason;
            return this;
        }

        public SubredditRuleJson build() {
            SubredditRuleJson rule = new SubredditRuleJson();
            rule.createdUtc = createdUtc;
            rule.description = description;
            rule.descriptionHtml = descriptionHtml;
            rule.kind = kind;
            rule.priority = priority;
            rule.shortName = shortName;
            rule.violationReason = violationReason;
            return rule;
        }

    }

}
