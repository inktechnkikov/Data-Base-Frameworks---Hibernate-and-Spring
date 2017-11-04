package App.Repositories;

import model.BasicShampoos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShampoosDao extends JpaRepository<BasicShampoos,Long>{

}
