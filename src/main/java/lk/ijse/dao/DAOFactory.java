package lk.ijse.dao;

import lk.ijse.dao.custom.impl.BookDAOImpl;
import lk.ijse.dao.custom.impl.BranchDAOImpl;
import lk.ijse.dao.custom.impl.LoginDAOImpl;
import lk.ijse.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        USER, LOGIN, BRANCH, BOOK
    }

    public SuperDAO getDAO(DAOTypes types){
        switch (types) {
            case USER:
                return new UserDAOImpl();
            case LOGIN:
                return new LoginDAOImpl();
            case BRANCH:
                return new BranchDAOImpl();
            case BOOK:
                return new BookDAOImpl();
            default:
                return null;
        }
    }
}
