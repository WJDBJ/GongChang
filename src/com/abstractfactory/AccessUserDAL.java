package com.abstractfactory;

/**
 * @author XJ
 */
public class AccessUserDAL implements IUser {
    @Override
    public boolean Login(String username, String pwd) {
        return true;
    }
}
