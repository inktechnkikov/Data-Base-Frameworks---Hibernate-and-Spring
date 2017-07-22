package App.ServiceAPI;

import model.BasicIngredient;

import java.util.List;

public interface IngredientService {
    BasicIngredient findById(Long id);
    void remove(BasicIngredient obj);
    List<BasicIngredient> findAll();
    void save(BasicIngredient obj);
}
