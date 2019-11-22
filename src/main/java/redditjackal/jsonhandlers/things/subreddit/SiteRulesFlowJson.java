
package redditjackal.jsonhandlers.things.subreddit;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SiteRulesFlowJson {

    @Expose
    private String reasonText;
    @Expose
    private String reasonTextToShow;

    public String getReasonText() {
        return reasonText;
    }

    public String getReasonTextToShow() {
        return reasonTextToShow;
    }

    public static class Builder {

        private String reasonText;
        private String reasonTextToShow;

        public SiteRulesFlowJson.Builder withReasonText(String reasonText) {
            this.reasonText = reasonText;
            return this;
        }

        public SiteRulesFlowJson.Builder withReasonTextToShow(String reasonTextToShow) {
            this.reasonTextToShow = reasonTextToShow;
            return this;
        }

        public SiteRulesFlowJson build() {
            SiteRulesFlowJson siteRulesFlow = new SiteRulesFlowJson();
            siteRulesFlow.reasonText = reasonText;
            siteRulesFlow.reasonTextToShow = reasonTextToShow;
            return siteRulesFlow;
        }

    }

}
