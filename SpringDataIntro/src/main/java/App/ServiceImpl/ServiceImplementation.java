package App.ServiceImpl;

import App.DaoAPI.Dao;
import App.Impl.JpaDao;
import App.ServiceAPI.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ServiceImplementation<E, K> implements Service<E,K> {

    private EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ShampooCompany");
    private EntityManager manager = managerFactory.createEntityManager();
    private Dao<E,K> dao = new JpaDao<E,K>(manager);
    @Override
    public E findById(Class<E> entityClass, K id) {
      return null;
    }

    @Override
    public void remove(E object) {

    }

    @Override
    public List<E> findAll(Class<E> serviceClass) {
        return null;
    }

    @Override
    public void save(E object) {

    }
}
