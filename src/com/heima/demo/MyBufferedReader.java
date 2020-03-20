package com.heima.demo;

import java.io.IOException;
import java.io.Reader;

/*
 * 用Reader模拟BufferedReader的readLine()功能
 *
 * readLine():一次读取一行，根据换行符判断是否结束，只返回内容，不返回换行符
 */
public class MyBufferedReader {
    private Reader reader;

    public MyBufferedReader(Reader reader){
        this.reader=reader;
    }
    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch=reader.read())!=-1) {
            if (ch=='\r'){
                continue;
            }
            if (ch=='\n'){
                return  sb.toString();
            }else {
                sb.append((char)ch);
            }
        }

        if (sb.length()>0){
            return sb.toString();
        }
        return null;
    }

    public  void  close() throws IOException {
        this.reader.close();
    }
}

