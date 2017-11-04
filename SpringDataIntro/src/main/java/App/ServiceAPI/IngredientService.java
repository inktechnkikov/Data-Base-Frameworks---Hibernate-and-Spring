package App.ServiceAPI;

import model.BasicIngredient;

import java.util.List;

public interface IngredientService{
    BasicIngredient findBy(Long id);
    void remove(BasicIngredient object);
    List<BasicIngredient> findAll();
    void save(BasicIngredient object);
}
