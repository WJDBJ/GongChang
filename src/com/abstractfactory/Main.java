package com.abstractfactory;

import com.factory.FactoryInterface;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DALFactory facotory = UserDALFactory.ChooseDB();
        IUser userdal = facotory.createUserDAL();
        IDept deptdal = facotory.createDeptDAL();
        System.out.println(userdal.Login("xj","13979661093"));
        System.out.println(deptdal.Insert("S001","一个很棒的部门"));
    }
}
