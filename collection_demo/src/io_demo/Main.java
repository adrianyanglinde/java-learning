package io_demo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            file_create();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        file_fn();
    }
    public static void file(){
        File f1 = new File("~/Documents/project/kefu/gm");
        System.out.println(f1);
        File f2 = new File("~/Documents/project/kefu/gm","test.txt");
        System.out.println(f2);
    }
    public static void file_create() throws IOException {
        // 创建文件
        File f1 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/java1.txt");
        f1.createNewFile();
        // 创建目录
        File f2 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/javaEE");
        f2.mkdir();
        // 创建多级目录
        File f3 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/javaWEB/java");
        f3.mkdirs();
    }

    public static void file_fn() {
//        File f1 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/io_demo/java1.txt");
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getPath());
//        System.out.println(f1.getName());

        File f2 = new File("/Users/yanglinde/Documents/project/java-learning");
        String[] list = f2.list();
        for (String item:list){
            System.out.println(item);
        }
//        File[] list2 = f2.listFiles();
//        for (File item:list2){
//            System.out.println(item);
//        }

    }
}
