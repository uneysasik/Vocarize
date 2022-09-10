package vocarize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vocarize.data.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
