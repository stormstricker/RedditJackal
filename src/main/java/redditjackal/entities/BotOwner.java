package redditjackal.entities;

import redditjackal.entities.inbox.InboxMessage;
import redditjackal.jsonhandlers.inbox.InboxChildJson;
import redditjackal.jsonhandlers.inbox.InboxResultJson;
import redditjackal.requests.inbox.get.InboxRequest;
import redditjackal.requests.inbox.get.UnreadInboxRequest;
import redditjackal.requests.inbox.post.ComposeMessageRequest;
import redditjackal.requests.inbox.post.ReadMessageRequest;

import java.util.ArrayList;
import java.util.List;

public class BotOwner extends Redditor  {
     BotOwner(Reddit reddit, String username)  {
        super(reddit, username);
    }

    public void readPrivateMessage(String name)  {
        ReadMessageRequest.Builder messageBuilder =
                ReadMessageRequest.builder(name, reddit.getAccessToken());
        messageBuilder.build().execute();
    }

    public void sendPrivateMessage(String subject, String text, String to)  {
        ComposeMessageRequest.Builder messageRequest =
                ComposeMessageRequest.builder(subject, text, to, reddit.getAccessToken());
        messageRequest.build().execute();
    }

    public void sendPrivateMessage(String subject, String text, String to, String from_sr)  {
        ComposeMessageRequest.Builder messageRequest =
                ComposeMessageRequest.builder(subject, text, to, reddit.getAccessToken()).setFromSr(from_sr);
        messageRequest.build().execute();
    }

    public List<InboxMessage> getInboxMessages(int limit) throws Exception  {
        List<InboxMessage> result = new ArrayList<>();

        InboxRequest.Builder inboxBuilder = InboxRequest.builder(reddit.getAccessToken()).setLimit(limit);
        InboxRequest inboxRequest =  inboxBuilder.build();
        InboxResultJson resultJson = inboxRequest.execute();

        for (InboxChildJson child: resultJson.getInboxDataJson().getInboxChildJsons())  {
            result.add(new InboxMessage((child)));
        }

        return result;
    }

    public List<InboxMessage> getUnreadInboxMessages() throws Exception  {
        List<InboxMessage> result = new ArrayList<>();

        UnreadInboxRequest.Builder inboxBuilder = UnreadInboxRequest.builder(reddit.getAccessToken());
        UnreadInboxRequest inboxRequest =  inboxBuilder.build();
        InboxResultJson resultJson = inboxRequest.execute();

        for (InboxChildJson child: resultJson.getInboxDataJson().getInboxChildJsons())  {
            result.add(new InboxMessage((child)));
        }

        return result;
    }

    public List<InboxMessage> getAllInboxMessages() throws Exception  {
        return getInboxMessages(100);
     }
}
