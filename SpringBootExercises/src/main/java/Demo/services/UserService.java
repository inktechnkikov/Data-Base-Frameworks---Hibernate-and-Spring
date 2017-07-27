package Demo.services;

import Demo.models.User;

import java.util.List;

public interface UserService {
    void persist(User user);
    void multipleUsersPersist(List<User> userList);
}
