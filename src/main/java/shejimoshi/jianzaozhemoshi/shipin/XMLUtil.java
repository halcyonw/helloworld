package shejimoshi.jianzaozhemoshi.shipin;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    //该方法用于从xml配置文件中获取具体类类名，并返回一个实例对象
    public static Object getBean() {
        //创建DOM文档对象
        try {
  DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();

 DocumentBuilder builder = dFactory.newDocumentBuilder();
Document doc;

           doc = builder.parse(new File("src/main/java/shejimoshi/jianzaozhemoshi/shipin/config.xml"));
            //获取包含类名的文本节点
            NodeList nodeList = doc.getElementsByTagName("className");
            Node firstChild = nodeList.item(0).getFirstChild();
            String nodeValue = firstChild.getNodeValue();
            //通过类名生成实例对象并返回
            Class<?> aClass = Class.forName("shejimoshi.jianzaozhemoshi.shipin."+nodeValue);
            Object o = aClass.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
