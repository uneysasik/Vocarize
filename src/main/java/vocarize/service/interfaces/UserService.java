package vocarize.service.interfaces;

import org.springframework.stereotype.Service;
import vocarize.data.User;

import java.util.List;

@Service
public interface UserService {

    List<User> findAllUsers();
    User findUserById(Long id);
    String createUser(User user);
    String deleteUser(Long id);


}
