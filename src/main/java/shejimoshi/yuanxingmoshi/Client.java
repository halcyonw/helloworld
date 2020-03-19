package shejimoshi.yuanxingmoshi;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {

        WeeklyLog log_previous,log_new=null;
        log_previous=new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);

        try {
            log_new=log_previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("克隆失败");
        }
      //  log_new=log_previous.clone();
        System.out.println("周报是否相同"+(log_previous==log_new));
      //  System.out.println("附件是否相同" + (log_previous.getAttachment() == log_new.getAttachment()));
   /*     WeeklyLog log_previous = new WeeklyLog();
        log_previous.setName("张无忌");
        log_previous.setContent("这周工作很忙， 天天加班");
        log_previous.setData("第12周");

        System.out.println("***周报****");
        System.out.println("周次" + log_previous.getData());
        System.out.println("姓名" + log_previous.getName());
        System.out.println("内容" + log_previous.getContent());

        WeeklyLog long_new;
        long_new=log_previous.clone();
       long_new.setData("13周");
        System.out.println("***周报***");
        System.out.println("周次"+long_new.getData());
        System.out.println("姓名" + long_new.getName());
       System.out.println("内容"+long_new.getContent());

        System.out.println(log_previous == long_new);
        System.out.println(log_previous.getData() == long_new.getData());
        System.out.println(log_previous.getName() == long_new.getName());
        System.out.println(log_previous.getContent() == long_new.getContent());
*/
       /* PrototypeManager pm = PrototypeManager.getPrototupeManager();
        OfficialDocument doc1,doc2,doc3,doc4,doc5;

        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1==doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3==doc4);

        doc5 = pm.getOfficialDocument("ppr");
        doc5.display();*/
    }
}
