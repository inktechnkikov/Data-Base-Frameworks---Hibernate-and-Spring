package App.ServiceImpl;

import App.Repositories.IngredientsDao;
import App.ServiceAPI.IngredientService;
import model.BasicIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IngredientServiceImpl implements IngredientService{
    private final IngredientsDao ingredientsDao;

    @Autowired
    public IngredientServiceImpl(IngredientsDao ingredientsDao) {
        this.ingredientsDao = ingredientsDao;
    }

    @Override
    public BasicIngredient findBy(Long id) {
        return ingredientsDao.findOne(id);
    }

    @Override
    public void remove(BasicIngredient object) {
        ingredientsDao.delete(object);
    }

    @Override
    public List<BasicIngredient> findAll() {
       return ingredientsDao.findAll();
    }

    @Override
    public void save(BasicIngredient object) {
        ingredientsDao.save(object);
    }

}
