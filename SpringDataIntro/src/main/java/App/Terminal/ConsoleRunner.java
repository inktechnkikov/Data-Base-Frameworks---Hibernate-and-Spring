package App.Terminal;

import App.ServiceAPI.ShampoosService;
import model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class ConsoleRunner implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        BasicIngredient ingredient = new Mint();
        BasicIngredient ingredient1 = new Mint();
        BasicIngredient ingredient2 = new Strawberry();
        BasicIngredient ingredient3 = new AmonuimChloride();
        ClassicLabel label = new ClassicLabel("Fresh body");
        BasicShampoos shampoos = new FreshShampoo();
        Set<BasicIngredient> ingredientSet = new HashSet<BasicIngredient>();
        ingredientSet.add(ingredient);
        ingredientSet.add(ingredient3);
        ingredientSet.add(ingredient1);
        ingredientSet.add(ingredient2);
        shampoos.setIngredientSet(ingredientSet);
        shampoos.setLabel(label);
    }
}
