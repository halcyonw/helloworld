package com.heima.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 *
 * 分析：
 *      A:创建学生类
 *      B:创建集合对象
 *          TreeSet<Student>
 *      C:键盘录入学生信息存储到集合
 *      D:遍历集合，把数据写到文本文件
 */
public class StudentDemo {
    public static void main(String args[]) throws IOException {
        TreeSet<student> students = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                //s1-s2升序，s2-s1降序
                int num = s2.getSum() - s1.getSum();
                System.out.println(num);
                int num1 = num == 0 ?s2.getChinese()-s1.getChinese():num;
                System.out.println(num1);
                int num2 = num1 ==0 ?s2.getMath()-s1.getMath():num1;
                System.out.println(num2);

                int num3 = num2 ==0 ?s2.getEnglish()-s1.getEnglish():num2;
                System.out.println(num3);

                int num4 = num3 == 0?s1.getName().compareTo(s2.getName()):num3;//按字母顺序
                System.out.println(num4);

                return num4;
            }
        });
        for (int i = 0; i <2 ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("录入学生成绩：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
            student student = new student(name,chinese,math,english);
            students.add(student);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("grade.txt"));
        bw.write("学生信息如下：");
        bw.newLine();
        bw.flush();
        bw.write("姓名,语文成绩,数学成绩,英语成绩");
        bw.newLine();
        bw.flush();
        for (student student : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(student.getChinese()).append(student.getMath()).append(student.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
