# How to use RedditJackal
## Getting comments
###### Of a user
```
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Redditor user = reddit.getRedditor("username");
List<Comment> comments = user.commentHistory().update(10).getComments();

for (Comment comment: comments)  {
    System.out.println(comment.getBody());
}
```
###### From a post
```to be done```

## Getting posts
###### Of a user
```
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Redditor user = reddit.getRedditor("username");
List<Post> posts = user.postHistory().update(10).getPosts();
```
###### From subreddit
```
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Subreddit subreddit = reddit.getSubreddit("learnjava");
System.out.println(subreddit.getDescription());

subreddit.postHistory().update(3);
List<Post> posts  = subreddit.postHistory().getPosts();

for (Post post: posts)  {
    System.out.println(post.getTitle());
    System.out.println(post.getBody());
}
```

## Create a post in a subreddit
```
Reddit reddit = new Reddit(username, password,
                    appId, appSecret);
Subreddit subreddit = reddit.getSubreddit("news");
subreddit.post("News title", "self", "what happened");
```

## Replying to posts or comments
```
Subreddit subreddit = reddit.getSubreddit("math");
List<Comment> comments = subreddit.commentHistory().update(100).getComments();
for (Comment comment: comments)  {
    if (comment.getBody().contains("pi"))  {
        System.out.println(comment.getBody());
        comment.reply("Pi is 3.14159");
    }
}

List<Post> posts  = subreddit.postHistory().update(100).getPosts();
for (Post post: posts)  {
    if (post.getTitle().contains("Java"))  {
        System.out.println(post.getTitle());
        post.reply("I know Java, need help?");
    }
}
```

## Sending PMs to other users
```
BotOwner admin = reddit.getMe();
admin.sendPrivateMessage("test message", "test body", "username");
```

## Viewing your inbox
```
BotOwner botOwner = reddit.getMe();
List<InboxMessage> inbox = botOwner.getInboxMessages(5);   //max 100

for (InboxMessage message: inbox)  {
    System.out.println(message.getBody());
}
```

## Viewing unread messages in your inbox
```
BotOwner admin = reddit.getMe();
List<InboxMessage> unread = admin.getUnreadInboxMessages();

for (InboxMessage message: unread)  {
    System.out.println(message.getBody());
}
```

## Mark an unread message as read
```
BotOwner admin = reddit.getMe();
List<InboxMessage> unread = admin.getUnreadInboxMessages();
System.out.println("unread size: " + unread.size());  //N
for (InboxMessage message: unread)  {
    admin.readPrivateMessage(message.getName());
}

unread = admin.getUnreadInboxMessages();
System.out.println("unread size: " + unread.size());  //0
```

## How to get credentials needed to create `Reddit` object
1. Go to https://ssl.reddit.com/prefs/apps/
2. Click Create App
3. Select script, fill the name and description. Use https://reddit.com for URL fields
4. Use your username + password + appId + appSecret to create `Reddit`

