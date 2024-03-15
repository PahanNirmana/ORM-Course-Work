package lk.ijse.bo;

import lk.ijse.bo.custom.impl.BookBOImpl;
import lk.ijse.bo.custom.impl.BranchBOImpl;
import lk.ijse.bo.custom.impl.LoginBOImpl;
import lk.ijse.bo.custom.impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }

    public enum BOTypes{
        LOGIN, USER, BRANCH, BOOK
    }

    //Object creation logic for BO objects
    public SuperBO getBO(BOTypes types){
        switch (types){
            case LOGIN:
                return new LoginBOImpl();
            case USER:
                return new UserBOImpl();
            case BRANCH:
                return new BranchBOImpl();
            case BOOK:
                return new BookBOImpl();
            default:
                return null;
        }
    }
}
