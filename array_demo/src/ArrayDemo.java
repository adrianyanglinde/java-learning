import java.util.Scanner;

/**
 * day4
 * 数组
 * 数组就是存储数据长度固定的容器，存储多个数据的数据类型要一致
 */
public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(getMax(a,b));




        /*
         * reverseArray(arr);
         * printArray(arr);
         */

//        pingwei(arr);
        chicken();
    }

    /**
     * 左边开辟栈内存
     *    方法中变量 用完立即销毁 （方法呢？）
     * 右边开辟堆内存
     *    存储new出来的实体，对象   垃圾回收有空时销毁
     */
    private static boolean def() {

        int[] arr = { 19, 28, 37, 46, 50, 20 };
        // 动态初始化
        int[] arr_dynamic = new int[10];

        System.out.println(arr);
        System.out.println(arr_dynamic);
        System.out.println(arr_dynamic[8]);
        return true;
    }


    private static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    private static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }

    private static boolean isEqualArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int findInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void reverseArray(int[] arr) {
        int temp;
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void pingwei(int[] scores) {
        // Scanner sc = new Scanner(System.in);
        // int[] scores = new int[6];
        // for (int i = 0; i < scores.length; i++) {
        // scores[i] = sc.nextInt();
        // }

        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    /**
     * 不死神兔
     */
    private static void rabbit() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            if(i < 2){
                arr[i] = 1;
            }else{
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        System.out.println(arr[19]);
    }

    /**
     * 百钱百鸡
     * 5x + 3y + z/3 = 100;
     * x + y + z = 100;
     * 0 <= x <= 20
     * 0 <= y <= 33
     * 0 <= z <= 100
     */
    private static void chicken() {
        boolean isMoney;
        boolean isCount;
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                for (int z = 0; z <= 100; z++) {
                    isMoney = (5 * x + 3 * y + z / 3) == 100;
                    isCount = x + y + z == 100;
                    if(isMoney && isCount && (z % 3 == 0)){
                        System.out.println("x:" + x);
                        System.out.println("y:" + y);
                        System.out.println("z:" + z);
                        System.out.println("------");
                    };
                }
            }
        }
    }
}
