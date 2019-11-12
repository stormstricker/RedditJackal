package redditjackal.requests;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class RedditRequest {
    public static long count=0;

    public enum REQUEST_TYPE {GET, POST, ACCESS_TOKEN};
        private HttpURLConnection connection;

        private URL url;
        private REQUEST_TYPE requestType;

        private AccessToken accessToken;  //if there has already been retrieved an access_token
        private String encodedAppPair = "";  //if it's a REQUEST_TYPE.ACCESS_TOKEN request

        protected String link = "";
        protected String params = "";

        protected void updateLink()  {
            if (!params.equalsIgnoreCase(""))  {
                params = "?" + params.substring(1);
            }

            link+= params;
        }

    {
        count++;
        System.out.println("count: " + count);
    }

    public static void main(String[] args) throws Exception {

    }

    protected RedditRequest()  {}

    public RedditRequest(URL url, String encodedAppPair, REQUEST_TYPE requestType)  throws Exception {
                this.url = url;
                this.encodedAppPair = encodedAppPair;
                this.requestType = requestType;
        }

    public RedditRequest(String link, AccessToken accessToken, REQUEST_TYPE requestType)  throws Exception {
        setLink(link);
        this.accessToken = accessToken;
        this.requestType = requestType;

    }

        public RedditRequest(URL url, AccessToken accessToken, REQUEST_TYPE requestType, String params) throws Exception {
            this.url = url;
            this.accessToken = accessToken;
            this.requestType = requestType;

            this.params = params;
        }

        public RedditResponse send() throws Exception  {
                //System.out.println(accessToken.ACCESS_TOKEN_LONG);
                if (link!=null && !link.equalsIgnoreCase("")) {
                    try {
                        this.url = new URL(link);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                connection = (HttpURLConnection)  url.openConnection();
                setup();

                System.out.println("Connecting to " + connection.getURL());
                connection.connect();
                //System.out.println("start get input stream");

                 InputStream input;

                 try {
                     if ("gzip".equals(connection.getContentEncoding())) {
                         input = new GZIPInputStream(connection.getInputStream());

                     } else {
                         input = connection.getInputStream();
                     }

                     //System.out.println("timeout: " + connection.getConnectTimeout());
                     //System.out.println("end get input stream");

                     //System.out.println("Start scanner");
                     String inputString = new Scanner(input, "UTF-8").useDelimiter("\\Z").next();
                     //System.out.println("End scanner");

                     System.out.println("inputString: " + inputString);
                     input.close();
                     // connection.disconnect();

                     return new RedditResponse(inputString, connection.getResponseCode());
                 }
                catch (IOException e)  {
                     if (connection.getResponseCode()==401)  {
                            accessToken.renew();
                            System.out.println("Had to renew");
                            connection = (HttpURLConnection) url.openConnection();
                            setup();

                            return this.send();
                     }
                     else  {
                         e.printStackTrace();
                     }
                }
                catch (Exception e1)  {
                    e1.printStackTrace();
                }

                return new RedditResponse("", connection.getResponseCode());
        }

        public String send2() throws Exception  {
           try  {
               HttpClient httpclient = HttpClients.createDefault();
                HttpGet request = new HttpGet(link);
               System.out.println("link: " + link);
               request.addHeader("Authorization", "Bearer " + accessToken.ACCESS_TOKEN_LONG );
               request.addHeader("charset", "utf-8");
               request.addHeader("User-Agent", "RedditJackal parser v2.0");

               request.addHeader("Content-Type", "application/x-www-form-urlencoded");

               //request.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken.ACCESS_TOKEN_LONG);
                //request.setHeader(HttpHeaders.ACCEPT_CHARSET, "utf-8");
                //request.setHeader(HttpHeaders.USER_AGENT, "RedditJackal parser v2.0");


                // Request parameters and other properties.
              //  List<NameValuePair> params = new ArrayList<NameValuePair>(2);
               // params.add(new BasicNameValuePair("param-1", "12345"));
               // params.add(new BasicNameValuePair("param-2", "Hello!"));
              //  request.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

                //Execute and get the response.
                HttpResponse response = httpclient.execute(request);
                HttpEntity entity = response.getEntity();

                if (entity != null) {
                    InputStream instream  = entity.getContent();
                    String inputString = new Scanner(instream, "UTF-8").useDelimiter("\\Z").next();

                    return inputString;
                }

                return null;
        }
        catch (Exception e)  {
                System.out.println(e);

                return null;
            }
           }



        private void setup() throws Exception {
            connection.setRequestProperty("Accept-Encoding", "gzip");

            //connection.setConnectTimeout(100);
            //connection.setChunkedStreamingMode(1024);

            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("User-Agent", "RedditJackal parser v2.0");

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        if (requestType==REQUEST_TYPE.GET)  {
            connection.setRequestProperty("Authorization", "Bearer " + accessToken.ACCESS_TOKEN_LONG);
            connection.setRequestMethod("GET");


            connection.setInstanceFollowRedirects(false);
        }

        else if (requestType==REQUEST_TYPE.POST)  {
            connection.setRequestProperty("Authorization", "Bearer " + accessToken.ACCESS_TOKEN_LONG);
            connection.setRequestMethod("POST");
            connection.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty( "charset", "utf-8");

            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);  //?
            connection.setUseCaches( false );
            connection.setDoInput(true);

            byte[] postData = URLEncoder.encode(params, "UTF-8").getBytes( StandardCharsets.UTF_8 );
            int postDataLength = postData.length;
            connection.setRequestProperty("Content-Length", Integer.toString(postDataLength));
            OutputStream os = connection.getOutputStream();
            os.write(postData);
            os.close();
        }

        else if (requestType == REQUEST_TYPE.ACCESS_TOKEN)  {
            connection.setRequestProperty("Authorization", "Basic " + encodedAppPair);
            connection.setRequestMethod("POST");
            connection.setFixedLengthStreamingMode(0);

            connection.setDoOutput(true);
            connection.setDoInput(true);
        }

    //    if (this.bodyData!=null)  {
        //    connection.setRequestProperty("Content-Length", Integer.toString(bodyData.length));
         //   OutputStream os = connection.getOutputStream();
          //  os.write(bodyData);
          //  os.close();
       // }
    }

    public Object execute()  {
        return null;
    }

    //absolutely necessary setters
    protected void setRequestType(REQUEST_TYPE requestType) {
        this.requestType = requestType;
    }

    protected void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    protected void setLink(String link) {
        this.link = link;
    }
}
