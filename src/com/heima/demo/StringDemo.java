package com.heima.demo;

import java.io.*;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws IOException {
/*        已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
         * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
         **/
        File s = new File("s.txt");
        BufferedReader br = new BufferedReader(new FileReader(s));
        String s1 = br.readLine();
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String s2 = new String(chars);
        System.out.println(s2);
        BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
        bw.write(s2);
        bw.flush();
    }
}
