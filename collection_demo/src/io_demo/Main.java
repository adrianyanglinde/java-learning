package io_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Day 8
 */
public class Main {

    public static void main(String[] args) {
        try{
            output2();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 09_字节流写数据
     * @param args
     */
    public static void output() throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt");
//        fos.write(97);
        fos.write(57);
        fos.write(55);
        fos.close();
    }

    /**
     * 10_字节流写输入的三种方式
     * @throws IOException
     */
    public static void output2() throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt");
//        byte[] arr = {97,98,99,100};
//        fos.write(arr);
        fos.write("abcde".getBytes());
        fos.write("abcde".getBytes(),1,3);
        fos.close();
    }

    /**
     * 11_字节流写数据的两个小问题
     * @throws IOException
     */
    public static void output3() throws IOException {
        FileOutputStream fos = new FileOutputStream("java-learning/collection_demo/src/io_demo/test.txt");
    }
}
