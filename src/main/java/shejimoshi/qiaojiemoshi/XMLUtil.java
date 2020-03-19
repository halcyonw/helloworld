package shejimoshi.qiaojiemoshi;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/main/java/shejimoshi/qiaojiemoshi/config.xml"));
            NodeList nodeList = doc.getElementsByTagName("className");
            Node node=null;
            if(args.equalsIgnoreCase("image")) {
                node = nodeList.item(0).getFirstChild();
            }else if (args.equalsIgnoreCase("os")){
                node=nodeList.item(1).getFirstChild();
            }

            String nodeValue = node.getNodeValue();
            System.out.println(nodeValue);
            Class<?> c = Class.forName("shejimoshi.qiaojiemoshi."+nodeValue);
            Object o = c.getDeclaredConstructor().newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
