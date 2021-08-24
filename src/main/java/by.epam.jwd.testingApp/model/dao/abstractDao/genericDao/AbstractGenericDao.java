package by.epam.jwd.testingApp.model.dao.abstractDao.genericDao;

import by.epam.jwd.testingApp.exceptions.DaoException;

public interface AbstractGenericDao<E,K>{
    public  E getEntityById(K id) throws DaoException;
    public  E update(E entity) throws DaoException;
    public  boolean delete(K id) throws DaoException;
    public  boolean create(E entity) throws DaoException;
}