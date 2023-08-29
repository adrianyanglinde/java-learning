package array_demo;

import java.util.Arrays;

/**
 * day3
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 1. 冒泡排序
         * - n个数据比较n-1圈次
         * - 每一次比较都少比较一个最大的成员
         */
        int[] arr = {8,5,6,7,1,6,7,9};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // bubble(arr);
        System.out.println(Arrays.toString(arr));

        // 工具类：
        // 看源码，防止外部用系统给的无参构造方法实例化 将构造方法用private 这样就只能用静态 妙！
//        new Arrays()

    }
    private static int[] bubble(int[] arr){
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        return arr;
    }

}
