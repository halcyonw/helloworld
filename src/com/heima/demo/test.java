package com.heima.demo;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {


 /*       MyBufferedReader mbr = new MyBufferedReader(new FileReader("s.txt"));

        String line = null;
        while ((line = mbr.readLine()) != null) {
            System.out.println((line));
        }

        mbr.close();*/

   /*     //剪切
        File f3 = new File("s.txt");
        //f3.createNewFile();
        File f4 = new File("xfy1.txt");
        f3.renameTo(f4);
*/
        //剪切加重命名
       File f5 = new File("s.txt");
//        //f1.createNewFile();
       File f6 = new File("xfy2.txt");
       f5.renameTo(f6);
    }
}
