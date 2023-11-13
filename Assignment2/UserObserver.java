package Assignment2;

/**
 * Interface for the observer pattern where users are observers
 */
public interface UserObserver {
    public void update(User subject, String message);
}
