package App.Repositories;

import model.BasicIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsDao extends JpaRepository<BasicIngredient,Long>{
}
