package Docker.service;

import Docker.entity.User;

import java.util.List;

public interface UserService {

    User createNewUser(User user);

    List<User> getAllUsers();

    void deleteUserById(Long id);
}
