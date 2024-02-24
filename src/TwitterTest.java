

public class TwitterTest {
    public static void main(String[] args) {
        // Create Twitter service
        TwitterService twitterService = new TwitterService();

        // Create followers
        Follower follower1 = new FollowerInfo("Follower 1");
        Follower follower2 = new FollowerInfo("Follower 2");
        Follower follower3 = new FollowerInfo("Follower 3");

        // Add followers to the Twitter service
        twitterService.addFollower(follower1);
        twitterService.addFollower(follower2);
        twitterService.addFollower(follower3);

        // Post tweets
        twitterService.postTweet("Hello, Twitter!");
        twitterService.postTweet("This is my first tweet.");
        twitterService.postTweet("Follow me for more updates!");
    }
}
