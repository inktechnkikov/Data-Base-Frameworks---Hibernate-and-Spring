package springexercises.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springexercises.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

}
