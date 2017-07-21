package App;

import model.AmonuimChloride;
import model.BasicIngredient;
import model.Mint;
import model.Strawberry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        manager.getTransaction().commit();
    }
}
