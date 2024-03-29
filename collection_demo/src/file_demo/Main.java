package file_demo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            file_fn();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        file_del();
    }
    public static void file(){
        File f1 = new File("~/Documents/project/kefu/gm");
        System.out.println(f1);
        File f2 = new File("~/Documents/project/kefu/gm","test.txt");
        System.out.println(f2);
    }
    public static void file_create() throws IOException {
        // 创建文件
        File f1 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/file_demo/java1.txt");
        f1.createNewFile();
        // 创建目录
        File f2 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/file_demo/javaEE");
        f2.mkdir();
        // 创建多级目录
        File f3 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/file_demo/javaWEB/java");
        f3.mkdirs();
    }

    public static void file_fn() throws IOException {
//        File f1 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/file_demo/java1.txt");
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f1.getPath());
//        System.out.println(f1.getName());

        File f2 = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/file_demo/java1.txt");
//        f2.createNewFile();
        System.out.println(f2.getAbsolutePath());

//        String[] list = f2.list();
//        for (String item:list){
//            System.out.println(item);
//        }


//        File[] list2 = f2.listFiles();
//        for (File item:list2){
//            System.out.println(item);
//        }

    }
    public static void file_del() {
        File f2 = new File("collection_demo/src/file_demo/java1.txt");
        System.out.println(f2.delete());
        File f3 = new File("collection_demo/src/file_demo/javaEE");
        System.out.println(f3.delete());
    }
}
