package io_spec_demo;

import java.io.*;

public class Mian {
    public static void main(String[] args) {
        try {
            print_copy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 05_标准输入流
     */
    public static void stand_in() throws IOException {
        InputStream is = System.in;
        int by;
        while ((by=is.read())!=-1) {
            System.out.print((char)by);
        }
    }
    /**
     * 06_标准输出流
     */
    public static void stand_out() throws IOException {
        PrintStream ps = System.out;
//        ps.println("hongdanping");
//        ps.println(10);
        System.out.println("hongdanping");
        System.out.println(10);
    }
    /**
     * 07_字节打印流
     */
    public static void print_byte() throws IOException {
        PrintStream ps = new PrintStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_spec_demo/test.txt");
        // ps.write(97);  // a
        ps.print(97); // 97
        ps.close();
    }
    /**
     * 08_字符打印流
     */
    public static void print_char() throws IOException {
        PrintWriter pw = new PrintWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_spec_demo/test.txt");
        // pw.write(97); // a
        pw.print(97); // 97
        pw.close();

//        PrintWriter pw = new PrintWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_spec_demo/test.txt"),true);
//        pw.println(97);

    }
    /**
     * 09_复制Java文件打印流改进版
     */
    public static void print_copy() throws IOException {
        FileReader fileReader = new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_spec_demo/test.txt");
        PrintWriter printWriter = new PrintWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_spec_demo/test_copy.txt");
        int ch;
        while ((ch = fileReader.read()) != -1){
            printWriter.write(ch);
        }
        fileReader.close();
        printWriter.close();
    }
}
