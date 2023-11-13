package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserLeaf extends User implements CompositeTree, UserObserver {
    private String userID;
    private List<UserLeaf> following = new ArrayList<>();
    private ObservableList<UserLeaf> followingList = FXCollections.observableList(following);
    private List<String> myTweets = new ArrayList<>();
    private List<String> newsFeed = new ArrayList<>(Arrays.asList());
    private ObservableList<UserLeaf> newsFeedList = FXCollections.observableList(newsFeed);
    private Long createdUser;
        
    public UserLeaf(String newID) {
        this.userID = newID;
        this.createdUser = System.currentTimeMillis();
    }

    @Override
    public String getID() {
        return userID;
    }

    public List<String> getTweets() {
        return myTweets;
    }

    public ObservableList<UserLeaf> getNewsFeed() {
        return newsFeedList;
    }                                                                                                                                        

    @Override
    public String toString() {
        return userID;
    }

    @Override
    public void accept(UserGroupVisitor visitor) {
        visitor.visitUser(this);
    }

    @Override
    public void update(User subject, String message) {
        
    }
}
