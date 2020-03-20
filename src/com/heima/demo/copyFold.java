package com.heima.demo;

import java.io.*;

public class copyFold {
    /**
     * 封装
     * 新建文件夹
     * 获得源文件夹下文件列表
     * 复制文件到新文件夹
     */

        public static void main(String args[]) throws IOException {
            File file1 = new File("C:\\Users\\Administrator\\Documents\\WeChat Files\\wxid_wgrznxpg4vl922\\FileStorage\\File\\2020-03");
            File file2 = new File("G:\\1.docx");
            //判断文件夹是否存在
            if (!file2.exists()){
                file2.mkdir();
            }

            //获取源文件夹下文件列表

            File[] files = file1.listFiles();
            for (File file : files) {
                File newfile = new File(file2,file.getName());
                System.out.println(file.getName());
                copyFun(file,newfile);
            }
        }

        private static void copyFun(File file1,File file2) throws IOException {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
            }
            bis.close();
            bos.close();
        }


}
