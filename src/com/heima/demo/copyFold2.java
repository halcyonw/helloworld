package com.heima.demo;

import java.io.*;

public class copyFold2 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("C:\\Users\\Administrator\\Documents\\WeChat Files\\wxid_wgrznxpg4vl922\\FileStorage\\File\\2020-03");
        File file2 = new File("G:\\22");
        if (!file2.exists()) {
            file2.mkdir();
        }
        copyfolder(file1, file2);
    }

    private static void copyfolder(File srcFile, File destFile) throws Exception {
        if (srcFile.isDirectory()) {
            File newFolder = new File(destFile, srcFile.getName());
            newFolder.mkdir();
            File[] files = srcFile.listFiles();
            for (File file1 : files) {
                copyfolder(file1, newFolder);
            }
        } else {
            File newFile = new File(destFile, srcFile.getName());
            System.out.println("11111111111111");
            System.out.println(srcFile.getName());
            copyfile(srcFile, newFile);
        }
    }
    private static void copyfile(File file1,File file2) throws IOException {
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



