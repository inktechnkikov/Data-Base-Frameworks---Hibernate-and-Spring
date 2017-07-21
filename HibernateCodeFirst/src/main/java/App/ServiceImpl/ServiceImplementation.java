package App.ServiceImpl;

import App.ServiceAPI.Service;

import java.util.List;

public class ServiceImplementation<E, K> implements Service<E,K> {
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
