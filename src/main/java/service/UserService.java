package service;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
