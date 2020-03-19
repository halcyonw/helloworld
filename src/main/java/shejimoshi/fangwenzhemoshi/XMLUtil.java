package shejimoshi.fangwenzhemoshi;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/java/shejimoshi/fangwenzhemoshi/config.xml"));
            NodeList className = doc.getElementsByTagName("className");
            Node node = className.item(0).getFirstChild();
            String cName = node.getNodeValue();
            System.out.println(cName);
            Class<?> aClass = Class.forName("shejimoshi.fangwenzhemoshi."+cName);
            Object o = aClass.getDeclaredConstructor().newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
