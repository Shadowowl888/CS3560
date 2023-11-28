package DesignPatternNotes.SingletonPattern;

public class Driver {
    public static void main(String[] args) {
        // AuthManager instance1 = new AuthManager();
        // AuthManager instance2 = new AuthManager();

        AuthManager.getInstance().signup("Doctor", "123");
        AuthManager.getInstance().signup("Professor", "abc");

        AuthManager.getInstance().login("Doctor", "123");
        AuthManager.getInstance().login("Professor", "abc");
    }
}