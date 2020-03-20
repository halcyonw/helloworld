package com.heima.demo;

import java.io.*;

public class BufferDemo {
  public static void main(String[] args) {
      long begin = System.currentTimeMillis();
      try {
          BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\jdk-9_doc-api-spec-google（中文版）.CHM"));
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cope.CHM"));
        int len=0;
          byte[] bytes = new byte[1024];

          while ((len = bis.read(bytes))!= -1) {
              System.out.println(len);
              bos.write(bytes,0,len);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
      long end=System.currentTimeMillis();
      long time=end-begin;
      System.out.println(time);

  }
}
