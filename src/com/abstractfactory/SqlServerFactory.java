package com.abstractfactory;

/**
 * @author XJ
 */
public class SqlServerFactory extends DALFactory {
    @Override
    IUser createUserDAL() {
        return new SqlServerUserDAL();
    }

    @Override
    IDept createDeptDAL() {
        return new SqlServerDeptDAL();
    }
}
