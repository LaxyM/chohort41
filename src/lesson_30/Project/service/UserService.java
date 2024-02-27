package lesson_30.Project.service;

import lesson_29.MyList;
import lesson_30.Project.model.User;
import lesson_30.Project.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MyList<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User createUser(String email, String password) {
        boolean isExist = userRepository.isUserEmailExist(email);
        if (isExist) {
            return null;
        }
        // Мне нужно провалидировать мой email и пароль
        User user = userRepository.createUser(email, password);
        return user;
    }
}