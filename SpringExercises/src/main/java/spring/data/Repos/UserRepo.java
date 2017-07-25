package spring.data.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.data.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
}
