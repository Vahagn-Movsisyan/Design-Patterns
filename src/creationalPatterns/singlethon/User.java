package creationalPatterns.singlethon;

public class User {

    private int id;
    private String name;
    private String password;

    private static User instance = null;

    private User() {}

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }
}
