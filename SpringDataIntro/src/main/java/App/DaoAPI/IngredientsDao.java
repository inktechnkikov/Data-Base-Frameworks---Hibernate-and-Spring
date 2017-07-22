package App.DaoAPI;

import model.BasicIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsDao extends JpaRepository<BasicIngredient, Long>{
}
