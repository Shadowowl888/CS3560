package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<UserObserver> followers = new ArrayList<>();

    public void attach(UserObserver observer) {
        followers.add(observer);
    }

    public void updateFollowers(String message) {
        for (UserObserver observer : this.followers) {
            observer.update(this, message);
        }
    }
}
