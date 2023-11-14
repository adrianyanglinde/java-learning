package io_char_demo;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            test();
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
    public static void char_code() throws IOException {
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
    public static void input_output() throws IOException {
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        osw.write("洪丹萍");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test.txt"));
        System.out.println(isr.read());
        System.out.println(isr.read());
        System.out.println(isr.read());
        System.out.println(isr.read());
        //        int ch;
//        while ((ch = isr.read()) != -1){
//            System.out.print((char) ch);
//        }
    }

    public static void test() throws IOException {
        byte[] a = {-76};
        System.out.println(Arrays.toString(a));
        String aStr = new String(a);
        System.out.println(aStr);
        byte[] b = aStr.getBytes();
        System.out.println(Arrays.toString(b));
    }

}
