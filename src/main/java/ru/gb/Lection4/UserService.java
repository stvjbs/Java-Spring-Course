package ru.gb.Lection4;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByID(Long id) {
        return userRepository.findUserById(id);
    }
    public User addUser(User user){
        return userRepository.saveUser(user);
    }

}
