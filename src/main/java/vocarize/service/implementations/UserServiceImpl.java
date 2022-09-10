package vocarize.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vocarize.data.User;
import vocarize.repository.UserRepository;
import vocarize.service.interfaces.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        if (userRepository.findById(id).isPresent()) {
            User user = userRepository.findById(id).get();

            return user;
        }
        return new User();
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        if (userRepository.existsById(user.getId())) return "user is created successfully";
        return "user couldn't  be created";
    }

    @Override
    public String deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalStateException(id + " does not exist ");
        } else {
           userRepository.deleteById(id);
            return "Address whose id is " + id + " is successfully deleted";
        }
    }
}
