
package redditjackal.jsonhandlers.things.subreddit;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SubredditRulesJson {

    @Expose
    private List<SubredditRuleJson> rules;
    @SerializedName("site_rules")
    private List<String> siteRules;
    @SerializedName("site_rules_flow")
    private List<SiteRulesFlowJson> siteRulesFlow;

    public List<SubredditRuleJson> getRules() {
        return rules;
    }

    public List<String> getSiteRules() {
        return siteRules;
    }

    public List<SiteRulesFlowJson> getSiteRulesFlow() {
        return siteRulesFlow;
    }

    public static class Builder {

        private List<SubredditRuleJson> rules;
        private List<String> siteRules;
        private List<SiteRulesFlowJson> siteRulesFlow;

        public SubredditRulesJson.Builder withRules(List<SubredditRuleJson> rules) {
            this.rules = rules;
            return this;
        }

        public SubredditRulesJson.Builder withSiteRules(List<String> siteRules) {
            this.siteRules = siteRules;
            return this;
        }

        public SubredditRulesJson.Builder withSiteRulesFlow(List<SiteRulesFlowJson> siteRulesFlow) {
            this.siteRulesFlow = siteRulesFlow;
            return this;
        }

        public SubredditRulesJson build() {
            SubredditRulesJson subredditRulesJson = new SubredditRulesJson();
            subredditRulesJson.rules = rules;
            subredditRulesJson.siteRules = siteRules;
            subredditRulesJson.siteRulesFlow = siteRulesFlow;
            return subredditRulesJson;
        }

    }

}
