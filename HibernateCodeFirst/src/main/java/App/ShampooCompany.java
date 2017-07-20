package App;

import model.AmonuimChloride;
import model.BasicGradient;
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
        BasicGradient mint = new Mint();
        BasicGradient mint1 = new Mint();
        BasicGradient strawberry = new Strawberry();
        BasicGradient amoniumChloride = new AmonuimChloride();
        manager.persist(mint);
        manager.persist(mint1);
        manager.persist(strawberry);
        manager.persist(amoniumChloride);
        manager.getTransaction().commit();
    }
}
