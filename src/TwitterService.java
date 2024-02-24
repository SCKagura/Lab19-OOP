import java.util.ArrayList;
import java.util.List;

class TwitterService {
    private List<Follower> followers;

    public TwitterService() {
        this.followers = new ArrayList<>();
    }

    public void addFollower(Follower follower) {
        followers.add(follower);
    }

    public void postTweet(String tweet) {
        System.out.println("Posted tweet: " + tweet);
        // Notify followers
        notifyFollowers(tweet);
    }

    private void notifyFollowers(String tweet) {
        for (Follower follower : followers) {
            follower.reactToTweet(tweet);
        }
    }
}