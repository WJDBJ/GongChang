package com.abstractfactory;

/**
 * @author XJ
 */
public class AccessFactory extends DALFactory {
    @Override
    IUser createUserDAL() {
        return new AccessUserDAL();
    }

    @Override
    IDept createDeptDAL() {
        return new AccessDeptDAL();
    }
}
