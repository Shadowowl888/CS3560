package Assignment2;

public class AdminPanel {
    private static AdminPanel instance;

    private AdminPanel() {}

    public static AdminPanel getInstance() {
        if (instance == null) {
            instance = new AdminPanel();
        }
        return instance;
    }
}
