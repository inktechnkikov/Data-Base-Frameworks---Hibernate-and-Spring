package App.Impl;

import App.DaoAPI.Dao;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaDao<E,K> implements Dao<E,K> {

    private EntityManager manager;
    public JpaDao(EntityManager manager){
        this.manager = manager;
    }
    @Override
    public E findById(Class<E> entityClass, K primaryKey) {
       return manager.find(entityClass,primaryKey);
    }

    @Override
    public void remove(E entity) {
        manager.remove(entity);
    }

    @Override
    public List<E> findAll(Class<E> entityClass) {
        return manager.createQuery("FROM " + entityClass.getSimpleName()).getResultList();
    }

    @Override
    public void save(E entity) {
        manager.persist(entity);
    }
}
