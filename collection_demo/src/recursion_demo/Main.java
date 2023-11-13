package recursion_demo;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;

/**
 * Day8
 */
public class Main {
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

//        recur(0,20);
//        System.out.println(list.get(19));
        System.out.println(fn(20));
        System.out.println(factorial(5));
        File file = new File("/Users/yanglinde/Documents/project/java-learning/collection_demo/src/recursion_demo");
        traverseDir(file);
    }

    public static void recur(int index,int len){
        if(list.size() > len){
            return;
        }
        if(index < 2){
            list.add(1);
        }else{
            int newA = list.get(index - 1);
            int newB = list.get(index - 2);
            list.add(newA + newB);
        }
        recur(index + 1,len);
    }

//    第n个： f(n) = f(n-1) + f(n - 2) 第n个怎么由上一个来的
    // 1.出口 2.规则
    public static int fn(int index){
        if(index == 1 || index == 2){
            return 1;
        }
        int a = fn(index - 1);
        int b = fn(index - 2);
        return a + b;
    }

    /**
     * 06 阶乘
     * @param num
     * @return
     */
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    /**
     * 07 遍历目录
     */
    public static void traverseDir(File _file){
        File[] files = _file.listFiles();
        if(files == null){
            return;
        }
        for(File file : files){
            if(file.isFile()){
                System.out.println(file.getAbsolutePath());
            }
            if(file.isDirectory()){
                traverseDir(file);
            }
        }
    }

}
