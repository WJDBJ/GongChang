package com.abstractfactory;

/**
 * @author XJ
 */
public interface IUser {
    /***
     * 登录
     * @param username
     * @param pwd
     * @return
     */
    boolean Login(String username,String pwd);
}
