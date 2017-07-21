package App;

import model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class ShampooCompany {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ShampooCompany");
        EntityManager manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
        BasicIngredient mint = new Mint();
        BasicIngredient mint1 = new Mint();
        BasicIngredient strawberry = new Strawberry();
        BasicIngredient amonnuimChloride = new AmonuimChloride();
        manager.persist(mint);
        manager.persist(mint1);
        manager.persist(strawberry);
        manager.persist(amonnuimChloride);

        ClassicLabel label = new ClassicLabel("Fresh Water");
        BasicShampoos shampoos = new FreshShampoo();
        ProductionBatch batch = new ProductionBatch();
        Set<BasicIngredient> ingredientSet = new HashSet<>();
        ingredientSet.add(mint);
        ingredientSet.add(amonnuimChloride);
        ingredientSet.add(strawberry);
        shampoos.setLabel(label);
        shampoos.setBatch(batch);
        shampoos.setIngredientSet(ingredientSet);
        manager.persist(shampoos);
        manager.getTransaction().commit();
    }
}
