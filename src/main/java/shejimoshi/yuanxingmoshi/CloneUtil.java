package shejimoshi.yuanxingmoshi;

import java.io.*;
import java.util.Collection;

public class CloneUtil  {
    private CloneUtil() {

    }
    //采用序列化完成对象的深克隆
    public static <T extends Serializable> T cloneObject(T obj) {
        T cloneObj=null;
        //序列化
            ByteArrayOutputStream bao=null;
            ObjectOutputStream oos=null;
        try {
            bao = new ByteArrayOutputStream();
          oos = new ObjectOutputStream(bao);
            oos.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bao.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //反序列化
        ByteArrayInputStream bin=null;
        ObjectInputStream ois=null;
        try {
            bin = new ByteArrayInputStream(bao.toByteArray());
            ois = new ObjectInputStream(bin);
            cloneObj = (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                bin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cloneObj;
    }

    //利用序列化完成集合的深克隆
    public static <T> Collection<T> cloneCollection(T collection) {

        ByteArrayOutputStream bop=null;
        ObjectOutputStream ops=null;
        try {
            bop = new ByteArrayOutputStream();
            ops=new ObjectOutputStream(bop);
            ops.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bop.close();
                ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            bis = new ByteArrayInputStream(bop.toByteArray());
            ois = new ObjectInputStream(bis);
          Collection<T> c = (Collection<T>)ois.readObject();
          return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
