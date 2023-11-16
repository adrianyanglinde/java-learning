package throwable_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Day4
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 13. 异常
         *
         * Throwable 祖宗类
         *  - Error：严重问题，不需要处理
         *  - Exception：异常类，程序本身可以处理
         *      - RuntimeException：编译期不检查，出现问题，需要我们回来改代码
         *      - 非RuntimeException：编译期就必须处理的，否则不能通过编译
         */


        /**
         * 14. JVM (java虚拟机)默认处理方案
         */
        // 异常类：ArrayIndexOutOfBoundsException
// 行号：23
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//        at throwable_demo.Test.main(Test.java:23)
        System.out.println("开始");
        method4();
        try{
            method5();
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("结束");

//        try {
//            method6(-5);
//        } catch (ScoreException e) {
//            e.printStackTrace();
//        }s
    }

    /**
     * 15. 异常处理
     *  - try catch
     *  - throws
     */
    public static void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);  // new ArrayIndexOutOfBoundsException 交给虚拟机
        }catch (ArrayIndexOutOfBoundsException e){  // 虚拟机匹配到
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

    /**
     * 16. 编译时异常和运行时异常
     * java异常分为编译时异常和运行时异常，也叫做受检异常和非受检异常
     * 所有RuntimeException类及其子类称为运行时异常，其他异常则为编译时异常
     */

    /**
     * 编译时异常：必须显示处理，否则无法通过编译
     * 运行时异常：无需显示处理，出现问题再回来改代码，当然也可以和编译时异常一样处理（意义不大，到时候还是要回来改代码）
     */
    // 运行时异常
    public static void method2(){
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }

    // 编译时异常
    public static void method3(){
//        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
//        String str = "2045-04-08";
//        Date d = sdf.parse(str);
//        System.out.println(d);
    }


    /**
     * 18. 异常处理之throws
     * 并不是所有情况都有权限用try catch处理异常，这时候java提供了throws处理方案
     * throws抛出异常（会中断）；由方法调用者来处理；仅表示出现异常的可能性，不一定会发送
     */
    public static void method4() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
    public static void method5() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        String str = "2045-04-08";
        Date d = sdf.parse(str);
        System.out.println(d);
    }


    /**
     * 19. 自定义异常
     * throw抛出异常；由方法体内语句来处理；一定抛出某种异常
     */
    // ScoreException继承Exception 可以用throws抛出来；
    // 这是编译时异常，不做处理无法通过编译
    // 如果继承自runtimeException，则不一定要用throws抛出
    public static void method6(int score) throws ScoreException {
        if(score < 0 || score > 100){
            // 方法体内部抛出异常
            // 自定义的异常-要手动抛出
            throw new ScoreException("成绩不对");
        }else{
            System.out.println("分数正常");
        }
    }
}
