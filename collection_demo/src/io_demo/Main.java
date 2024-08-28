package io_demo;

import java.io.*;
import java.sql.Array;

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
//        output4();
    }


    /**
     * 09_字节流写数据
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
        fos.write("洪丹萍".getBytes());
        // fos.write("abcde".getBytes(),1,3);
        fos.close();
    }

    /**
     * 11_字节流写数据的两个小问题
     * @throws IOException
     */
    public static void output3() throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }

    /**
     * 12_字节流写数据加异常处理
     */
    public static void output4() {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning2/collection_demo/src/io_demo/test.txt",true);
            fos.write("hello".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 13_字节流读数据(一次读一个字节数据)
     */
    public static void input1() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt");
        int by;
        while ((by = fis.read()) != -1){
            // System.out.println(by);
            System.out.println((char) by);
        }
        fis.close();
    }

    /**
     * 14_字节流复制文本文件(一次读一个字节数据)
     */
    public static void input_output1() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt");
        FileOutputStream fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/index/test.txt",true);
        int by;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    /**
     * 15_字节流读数据(一次读一个字节数组数据)
     */
    public static void input2() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test.txt");
        byte[] arr = new byte[1024];
        int len;
        while ((len = fis.read(arr)) != -1){
            System.out.println(new String(arr,0,len));
        }

    }

    /**
     * 16_字节流复制图片
     */
    public static void input_output2() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/img.png");
        FileOutputStream fos = new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/index/img.png",true);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
    }

    /**
     * Day9
     */
    /**
     * 01_字节缓冲流
     */
    public static void buffer_input_output() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test2.txt"));
        bos.write("hello".getBytes());
        bos.write("world".getBytes());
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/test2.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        bos.close();
        bis.close();
    }

    /**
     * 02_字节流复制视频
     */
    public static void copyVideo() throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/video.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/index/video.mp4",true));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "毫秒");
    }


}
