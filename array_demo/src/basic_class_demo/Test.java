package basic_class_demo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /**
         * Day4
         */

        /**
         * 1. 基本类型包装类
         *  将基本类型封装成对象好处：
         *      能在对象中定义更多方法操作该数据，
         *      和字符串转换
         */

        /**
         * int 范围
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /**
         * 2. integer
         */

//        过时
//        Integer i1 = new Integer(2);
//        System.out.println(i1);
//
//        Integer i2 = new Integer("-11");
//        System.out.println(i2);
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);


        /**
         * 3. int和string相互转换
         * String.valueOf
         * Integer.parseInt
         */
        int number = 100;
        // 方法1
        String s1 = "" + number;
        // 方法2
        String s2 = String.valueOf(number);
        System.out.println(s2);

        String str = "100";
        // 方法1
        Integer i = Integer.valueOf(str);
        int _i = i.intValue();
        System.out.println(_i);
        // 方法2
        int _i2 = Integer.parseInt(str);
        System.out.println(_i2);

        stringArraySort();
        auto();
    }

    /**
     * 4. 字符串数据排序
     */
    public static void stringArraySort(){
        String str = "23 23 64 11 56";
        String[] arr = str.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr1.length; i++) {
            sb.append(arr1[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    /**
     * 5. 自动装箱和拆箱
     * 装箱：基本类型转换为包装类型
     * 拆箱：包装类型转换为基本类型
     */
    public static void auto(){
        Integer i1 = Integer.valueOf(10);  // 装箱
        Integer i2 = 10;  // 自动简化装箱，底层还是valueOf

        // i2 = i2.intValue() + 200;  //  拆箱
        i2 += 200;  // 隐含自动拆箱和自动装箱

        Integer i3 = null;
        /**
         * 做包装类操作先判断是否为null, 只要是对象，使用前也要判断不为null
         */
        if(i3 != null) {
            i3 += 300;
        }
        System.out.println(i2);
    }
}
