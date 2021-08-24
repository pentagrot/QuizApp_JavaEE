package by.epam.jwd.testingApp.model.dao.jdbcDao;

import by.epam.jwd.testingApp.entities.Comment;
import by.epam.jwd.testingApp.exceptions.ConnectionPoolException;
import by.epam.jwd.testingApp.exceptions.DaoException;
import by.epam.jwd.testingApp.model.connectionPool.ConnectionPool;
import by.epam.jwd.testingApp.model.dao.jdbcDao.connctionPoolClient.ConnectionPoolClient;
import by.epam.jwd.testingApp.model.dao.abstractDao.entitiesDao.AbstractCommentDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class CommentDaoJDBC  extends ConnectionPoolClient implements AbstractCommentDao  {
    ConnectionPool pool;

    public CommentDaoJDBC() throws DaoException {}

    private List<Comment> parsFromResultSet(ResultSet set){
        return  null;
    }


    @Override
    public List<Comment> getByTestId(Integer testId) throws DaoException {
        return null;
    }

    @Override
    public Comment getEntityById(Integer id) throws DaoException {
        return null;
    }

    @Override
    public Comment update(Comment entity) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws DaoException {
        return false;
    }

    @Override
    public boolean create(Comment entity) throws DaoException {
        return false;
    }
}