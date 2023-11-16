package io_char_demo;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            stream_buffer_epec_copy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 03_为什么出现字符流
     */
    public static void fn() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        int by;
        while ((by = bis.read()) != -1){
            System.out.println(by);
        }
        bis.close();
        String str = "洪丹萍";
        System.out.println(Arrays.toString(str.getBytes()));
    }

    /**
     * 05_字符串中的编码/解码问题
     * @throws IOException
     */
    public static void string_decode_encode() throws IOException {
        String str = "洪丹萍";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // 编码
//        System.out.println(Arrays.toString(str.getBytes())); //[-26, -76, -86, -28, -72, -71, -24, -112, -115]
//        System.out.println(Arrays.toString(str.getBytes("UTF-8")));//[-26, -76, -86, -28, -72, -71, -24, -112, -115]
//        System.out.println(Arrays.toString(str.getBytes("GBK"))); //[-70, -23, -75, -92, -58, -68]

        // 解码
        // System.out.println(new String(bytes));
        // System.out.println(new String(bytes, 'GBK'));  // 编码解码不一致 乱码
    }

    /**
     * 06_字符流中的编码/解码问题
     * @throws IOException
     */
    public static void stream_decode_encode() throws IOException {
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        osw.write("洪丹萍");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        System.out.println(isr.read()); // 27946
        System.out.println(isr.read()); // 20025
        System.out.println(isr.read()); // 33805
        System.out.println(isr.read()); // -1
        //        int ch;
//        while ((ch = isr.read()) != -1){
//            System.out.print((char) ch);
//        }
    }

    public static void test() throws IOException {
        byte[] a = {-76};
        System.out.println(Arrays.toString(a)); // [-76]
        String aStr = new String(a);
        System.out.println(aStr);  // �
        byte[] b = aStr.getBytes();
        System.out.println(Arrays.toString(b)); // [-17, -65, -67]
    }

    public static void test2() throws IOException {
        byte[] bytes = {-26, -76, -86};  // “洪”字节编码
        System.out.println(new String(bytes));  //洪
        int ch = 27946;  // “洪”在UTF-8字符集的编码
        System.out.println((char) ch);  //洪
    }

    /**
     * 07_字符流写数据的5种方式
     * @throws IOException
     */
    public static void stream_output() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
        osw.write(27946); //洪
        osw.write(65); //A

        char[] chars = {'洪','丹','萍'};
        osw.write(chars);
        osw.write("洪丹萍");
        osw.close();
    }
    /**
     * 08_字符流读数据的2种方式
     * @throws IOException
     */
    public static void stream_input() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
//        int ch;
//        while ((ch = isr.read()) != -1){
//            System.out.print((char) ch);
//        }
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }

    }
    /**
     * 09_字符流复制Java文件
     * @throws IOException
     */
    public static void stream_copy() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2-copy.txt"));
        int ch;
        while ((ch = isr.read()) != -1){
            osw.write(ch);
        }
        isr.close();
        osw.close();
    }

    /**
     * 10_字符流复制Java文件改进版
     * @throws IOException
     */
    public static void stream_copy2() throws IOException {
        FileReader fr = new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt");
        FileWriter fw = new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2-copy.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }
        fr.close();
        fw.close();
    }

    /**
     * 11_字符缓冲流
     * @throws IOException
     */
    public static void stream_buffer_input_ouput() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
        bw.write("洪丹萍love杨林德");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
    /**
     * 11_字符缓冲流
     * @throws IOException
     */
    public static void stream_buffer_copy() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2-copy.txt"));
        int ch;
        while ((ch = br.read())!=-1){
            bw.write(ch);
        }
        bw.close();
        br.close();
    }
    /**
     * 13_字符缓冲流特有功能
     * @throws IOException
     */
    public static void stream_buffer_epec() throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test3.txt"));
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
////            bw.write("\r\n");
//            bw.newLine();
//        }
        //bw.close();
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test3.txt"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
    /**
     * 14_字符缓冲流特有功能复制Java文件
     * @throws IOException
     */
    public static void stream_buffer_epec_copy() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test3-copy.txt"));
        String str;
        while ((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }


}
