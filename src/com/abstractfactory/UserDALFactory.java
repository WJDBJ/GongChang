package com.abstractfactory;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

abstract class UserDALFactory {
    static DALFactory   ChooseDB() throws IOException, SAXException, ParserConfigurationException {
        DALFactory facotory = null;
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        String path = System.getProperty("user.dir") + "\\src\\com\\index.xml";
        //builder.parse()方法将给定文件的内容解析为一个 XML 文档，
        //并且返回一个新的 DOM Document 对象。
        System.out.println("path=" + path);
        Document document = builder.parse(new File(path));
        //获取文档的根元素，赋值给 rootElement 变量
        Element rootElement = document.getDocumentElement();
        //获取 rootElement 的所有 add 子节点（不包括属性节点），返回一个 NodeList 对象
        NodeList rootChildNodes = rootElement.getElementsByTagName("add");
        for (int i = 0; i < rootChildNodes.getLength(); i++) {
            //找出第 i 个 add 元素
            Node childNode = rootChildNodes.item(i);
            //找出所有的属性结点
            NamedNodeMap atts = childNode.getAttributes();
            //在所有的属性结点中找出 key 属性对象
            Node node = atts.getNamedItem("key");
            //System.out.println(node.getNodeValue());
            //key 属性的值为 ChooseProduct 的节点，则找出它 value 对应的值
            if (node.getNodeValue().equals("ChooseProduct")) {
                String value = atts.getNamedItem("value").getNodeValue();
                System.out.println("value=" + value);
                //根据 XML 中的值实例化相应的工厂类去获得相应的实体类。
                if (value.equals("SqlServer")) {
                    facotory = new SqlServerFactory();
                } else if (value.equals("Access")) {
                    facotory = new AccessFactory();
                }
            }
        }
        return facotory;
    }

    /**
     * 检查元素名
     * @param childNode
     * @param elementName
     * @return
     */
    private static boolean checkElementByName(Node childNode,String
            elementName){
        //判断 childNode 是不是一个元素节点，并且它的 nodeName 值为 book
        if(childNode.getNodeType() == Node.ELEMENT_NODE
                && childNode.getNodeName().equals(elementName)){
            return true;
        }
        return false;
    }
}