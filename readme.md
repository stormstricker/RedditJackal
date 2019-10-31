# How to use RedditJackal
## Getting comments
###### Of a user
```
Reddit reddit = Reddit.getReddit(username, password,
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
Reddit reddit = Reddit.getReddit(username, password,
                    appId, appSecret);
Redditor user = reddit.getRedditor("username");
List<Post> posts = user.postHistory().update(10).getPosts();
```
###### From subreddit
```
Reddit reddit = Reddit.getReddit(username, password,
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
Reddit reddit = Reddit.getReddit(username, password,
                    appId, appSecret);
Subreddit subreddit = reddit.getSubreddit("news");
subreddit.post("News title", "self", "what happened");
```