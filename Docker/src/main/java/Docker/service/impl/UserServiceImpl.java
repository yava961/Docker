package Docker.service.impl;

import Docker.entity.User;
import Docker.repository.UserRepo;
import Docker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    private final UserRepo userRepo;

    @Override
    public User createNewUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> Users = new ArrayList<>();
        userRepo.findAll().forEach(Users::add);
        return Users;
    }

    @Override
    public void deleteUserById(Long id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
        } else {
            throw new RuntimeException("Shop with id : " + id + " not exist");
        }
    }
}
