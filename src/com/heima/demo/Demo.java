package com.heima.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        read();
    }
   public static void read() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("xfy2.txt"));
        byte b = dis.readByte();
        short i = dis.readShort();
        float v = dis.readFloat();
        boolean b1 = dis.readBoolean();
        char c = dis.readChar();
        System.out.println(b);
        System.out.println(i);
        System.out.println(v);
        System.out.println(b1);
        System.out.println(c);
    }
}
