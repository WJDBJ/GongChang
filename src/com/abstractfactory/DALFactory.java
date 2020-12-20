package com.abstractfactory;

public abstract class DALFactory {
   abstract IUser createUserDAL();
   abstract IDept createDeptDAL();
}
