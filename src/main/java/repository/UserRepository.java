package repository;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
//    @Query("Select u FROM User u WHERE u.email=?1")
    Optional<User>findUserByEmail(String email);
}
