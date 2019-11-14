package redditjackal.requests.inbox.interfaces;

public interface Mailable {
    void sendPrivateMessage(String subject, String text);
    void sendPrivateMessage(String subject, String text, String fr_sr);
}
