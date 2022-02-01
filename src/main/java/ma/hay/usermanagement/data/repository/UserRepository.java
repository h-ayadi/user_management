package ma.hay.usermanagement.data.repository;

import ma.hay.usermanagement.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
