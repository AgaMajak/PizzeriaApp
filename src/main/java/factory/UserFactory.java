package factory;

import model.User;

public class UserFactory {

    public static User createUser(String name) {
        return new User(name);
    }

}
