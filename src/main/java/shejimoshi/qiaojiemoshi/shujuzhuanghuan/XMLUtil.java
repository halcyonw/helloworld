package shejimoshi.qiaojiemoshi.shujuzhuanghuan;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

public class XMLUtil {
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document parse = builder.parse(new File("src/main/java/shejimoshi/qiaojiemoshi/shujuzhuanghuan/config.xml"));
            NodeList className = parse.getElementsByTagName("classname");
            Node node =null;
            if (args.equalsIgnoreCase("database")) {
                 node =className.item(0).getFirstChild();
            } else if (args.equalsIgnoreCase("geshi")) {
                node =className.item(1).getFirstChild();
            }
            String s = node.getNodeValue();
            System.out.println(s);
            Class<?> aClass = Class.forName("shejimoshi.qiaojiemoshi.shujuzhuanghuan." + s);
            Object o = aClass.getDeclaredConstructor().newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
