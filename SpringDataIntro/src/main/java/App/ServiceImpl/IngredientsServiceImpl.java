package App.ServiceImpl;

import App.DaoAPI.IngredientsDao;
import App.ServiceAPI.IngredientService;
import model.BasicIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IngredientsServiceImpl implements IngredientService {

    @Autowired
    private IngredientsDao ingredientsDao;
    @Override
    public BasicIngredient findById(Long id) {
        return ingredientsDao.findOne(id);
    }

    @Override
    public void remove(BasicIngredient obj) {
        ingredientsDao.delete(obj);
    }

    @Override
    public List<BasicIngredient> findAll() {
        return ingredientsDao.findAll();
    }

    @Override
    public void save(BasicIngredient obj) {
        ingredientsDao.save(obj);
    }
}
