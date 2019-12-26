# How to use RedditJackal
## Getting comments
###### Of a user
```java
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Redditor user = reddit.getRedditor("username");
List<Comment> newComments = user.commentHistory().updateNew().getComments();
List<Comment> hotComments = user.commentHistory().updateHot().getComments();

for (Comment comment: newComments)  {
    System.out.println(comment.getBody());
}
```
###### From a post
```//TODO```

## Getting posts
###### Of a user
```java
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Redditor user = reddit.getRedditor("username");
List<Post> newPosts = user.postHistory().updateNew(10).getPosts();
List<Post> hotPosts = user.postHistory().updateHot(10).getPosts();
```
###### From subreddit
```java
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Subreddit learnjava = reddit.getSubreddit("learnjava");
System.out.println(learnjava.getDescription());

learnjava.postHistory().updateNew(3);
//by default retrieves new posts
List<Post> posts  = learnjava.postHistory().getPosts();

for (Post post: posts)  {
    System.out.println(post.getTitle());
    System.out.println(post.getBody());
}
```

## Create a post in a subreddit
```java
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Subreddit news = reddit.getSubreddit("news");
news.post("News title", "self", "what happened");
```

## Replying to posts or comments
```java
Subreddit math = reddit.getSubreddit("math");
//TODO
List<Comment> comments = math.commentHistory().updateNew(100).getComments();
for (Comment comment: comments)  {
    if (comment.getBody().contains("pi"))  {
        System.out.println(comment.getBody());
        comment.reply("Pi is 3.14159");
    }
}
//this is already implemented
List<Post> posts  = math.postHistory().updateNew(100).getPosts();
for (Post post: posts)  {
    if (post.getTitle().contains("Java"))  {
        System.out.println(post.getTitle());
        post.reply("I know Java, need help?");
    }
}
```

## Sending PMs to other users
```java
BotOwner admin = reddit.getMe();
admin.sendPrivateMessage("test message", "test body", "username");

Redditor otherUser = reddit.getRedditor("username");
otherUser.sendPrivateMessage("title", "body");
```

## Viewing your inbox
```java
BotOwner botOwner = reddit.getMe();
List<InboxMessage> inbox = botOwner.getInboxMessages(5);   //max 100

for (InboxMessage message: inbox)  {
    System.out.println(message.getBody());
}
```

## Viewing unread messages in your inbox
```java
BotOwner admin = reddit.getMe();
List<InboxMessage> unread = admin.getUnreadInboxMessages();

for (InboxMessage message: unread)  {
    System.out.println(message.getBody());
}
```

## Mark an unread message as read
```java
BotOwner admin = reddit.getMe();
List<InboxMessage> unread = admin.getUnreadInboxMessages();
System.out.println("unread size: " + unread.size());  //N
for (InboxMessage message: unread)  {
    admin.readPrivateMessage(message.getName());
}

unread = admin.getUnreadInboxMessages();
System.out.println("unread size: " + unread.size());  //0
```

## Get information about a user
```java
Redditor redditor = reddit.getRedditor("username");
System.out.println(redditor.getIsEmployee());
System.out.println(redditor.getHasVerifiedEmail());
System.out.println(redditor.getLinkKarma());
System.out.println(redditor.getCommentKarma());
```

## How to get credentials needed to create `Reddit` object
1. Go to https://ssl.reddit.com/prefs/apps/
2. Click Create App
3. Select script, fill the name and description. Use https://reddit.com for URL fields
4. Use your username + password + appId + appSecret to create `Reddit`

