package redditjackal.requests;


import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import java.net.URL;

public class AccessToken {
        public static enum TOKEN_TYPE {SHORT, LONG};

        String username;
        String password;

        String appId;
        String appSecret;
        String encodedAppPair;

        public String ACCESS_TOKEN_LONG;
        public String ACCESS_TOKEN_SHORT;

        public TOKEN_TYPE tokenType;

        public AccessToken(String username, String password, String appId, String appSecret)  {
                this.username = username;
                this.password = password;

                this.appId = appId;
                this.appSecret = appSecret;
                this.encodedAppPair = new String(Base64.encodeBase64((appId + ":" + appSecret).getBytes()));

                this.tokenType = TOKEN_TYPE.LONG;
        }

        public boolean renew()  {
                String grantTypeValue;

                if (tokenType== AccessToken.TOKEN_TYPE.SHORT)  {
                        grantTypeValue="client_credentials";
                }
                else  {
                        grantTypeValue="password&username=" + username + "&password=" + password;
                }

                try  {
                        RedditRequest tokenRequest = new RedditRequest(new URL(Link.ACCESS_TOKEN + "?grant_type=" + grantTypeValue), encodedAppPair,
                                RedditRequest.REQUEST_TYPE.ACCESS_TOKEN);

                        String inputString = tokenRequest.send().getResponse();

                        JSONObject jsonObject = new JSONObject(inputString);
                        System.out.println(inputString);

                        String resultToken = jsonObject.get("access_token").toString();
                        if (tokenType== AccessToken.TOKEN_TYPE.LONG)  {
                                ACCESS_TOKEN_LONG = resultToken;
                        }
                        else  {
                                ACCESS_TOKEN_SHORT = resultToken;
                        }

                        return true;
                }
                catch (Exception e)  {
                        System.out.println(e);

                        return false;
                }
        }

        //getters
        public String getUsername() {
                return username;
        }

        public String getPassword() {
                return password;
        }

        public String getAppId() {
                return appId;
        }

        public String getAppSecret() {
                return appSecret;
        }

        public String getEncodedAppPair() {
                return encodedAppPair;
        }

        public String getACCESS_TOKEN_LONG() {
                return ACCESS_TOKEN_LONG;
        }

        public String getACCESS_TOKEN_SHORT() {
                return ACCESS_TOKEN_SHORT;
        }

        public TOKEN_TYPE getTokenType() {
                return tokenType;
        }

        //setters
        public void setUsername(String username)  {
                this.username = username;
        }

        public void setPassword(String password)  {
                this.password = password;
        }

        public void setAppId(String appId)  {
                this.appId = appId;
        }

        public void setAppSecret(String appSecret)  {
                this.appSecret = appSecret;
        }


}
