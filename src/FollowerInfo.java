public class FollowerInfo  implements  Follower{
    private String name;

    public FollowerInfo(String name) {
        this.name = name;
    }

    @Override
    public void reactToTweet(String tweet) {
        System.out.println(name + " reacts to tweet: " + tweet);
    }
}

