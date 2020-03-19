package shejimoshi.jianzaozhemoshi.game;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XMLutil {
    public static Object getBean() {
        //创建文档对象
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/main/java/shejimoshi/jianzaozhemoshi/game/config.xml"));
            NodeList className = doc.getElementsByTagName("className");
            String nodeValue = className.item(0).getFirstChild().getNodeValue();
            System.out.println(className);
        //  System.out.println( className.item(1).getFirstChild().getNodeValue());
        //    System.out.println( className.item(1).getFirstChild().getNodeValue());
            Class<?> aClass = Class.forName("shejimoshi.jianzaozhemoshi.game." + nodeValue);
            Object o = aClass.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
