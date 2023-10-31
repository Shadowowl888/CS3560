package SingletonPattern;

public class AuthManager {
    /**
     * Key Things for Singleton Pattern
     * 1. Private constructor
     * 2. Static field to hold the private instance
     * 3. Public getInstance() method to return the instance
     */

    private static AuthManager instance;

    private AuthManager() {
        System.out.println("Creating instance...");
    }

    public static AuthManager getInstance() {
        if (instance == null) {
            instance = new AuthManager();
        }
        return instance;
    }

    public void signup(String user, String pass) {
        System.out.println("Sign Up: " + user);
    }

    public void login(String user, String pass) {
        System.out.println("Login: " + user);
    }
}