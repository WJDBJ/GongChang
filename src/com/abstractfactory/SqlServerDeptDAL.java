package com.abstractfactory;

/**
 * @author XJ
 */
public class SqlServerDeptDAL implements IDept {
    @Override
    public boolean Insert(String deptid, String deptdesc) {
        return true;
    }
}
