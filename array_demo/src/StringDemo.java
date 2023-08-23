import java.util.Scanner;

/**
 * day8
 */

/**
 * 117.字符串
 * java中所有""字符串都是String类的对象
 * 1.字符串不可变，他们的值创建后不可被更改
 * 2.不可变，但是可被共享
 * 3.字符串效果上是字符数组（char[]）,但底层原理是字节数组（byte[]）
 */
public class StringDemo {
    public static void main(String[] args){

        reverseDemo();
    }

    /**
     * 118.构造方法
     */
    public static void def(){

        // 创建空白字符串对象
        String s1 = new String();
        System.out.println("s1:" + s1);

        // 根据字符数组内容创建字符串对象
        char[] c1 = {'a','b','c'};
        String s2 = new String(c1);
        System.out.println("s2:" + s2);

        // 根据字节数组内容创建字符串对象，底层是字节，效果显示是字符
        byte[] b1 = {97,98,99};
        String s3 = new String(b1);
        System.out.println("s3:" + s3);

        // 直接赋值创建字符串对象
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }

    public static void def2(){

        /**
         * 119.String对象特点
         * 1.通过new关键字创建的字符串，每次new都新建一个String对象，开一个内存空间
         * 2.通过""创建的字符串，只要字符串序列相同（顺序和大小写）
         * 无论在程序代码中出现几次，JVM都只会建立一个String对象，并在字符串池中维护
         * 因此本质上是同一个对象
         * 注：参考内存图
         */
        char[] c1 = {'a','b','c','d'};
        //TODO:new String在堆内存中存储的是c1的地址？如果c1变了呢？
        String s1 = new String(c1);
        String s2 = new String(c1);
        System.out.println(s1 == s2);
        String s3 = "abcd";
        String s4 = "abcd";
        System.out.println(s3 == s4);


        /**
         * 120.字符串比较
         */
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
    }

    /**
     * 121.用户登录
     */
    public static void oauth(){
        Scanner sc = new Scanner(System.in);
        String username = "adrian";
        String password = "123";
        String _u;
        String _p;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            _u = sc.next();
            System.out.println("请输入密码:");
            _p = sc.next();
            if(username.equals(_u) && password.equals(_p)){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("有错误！还有"+(2 - i)+"次机会");
            }
        }
    }

    /**
     * 122.遍历字符串
     */
    public static void loop(){
        String str = "adrian is a boy";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    /**
     * 123.统计字符次数
     */
    public static void stat(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x_num = 0;
        int d_num = 0;
        int s_num = 0;
        char c;
        System.out.println("长度："+str.length());
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                x_num += 1;
                continue;
            }
            if(c >= 'A' && c <= 'D'){
                d_num += 1;
                continue;
            }
            if(c >= '0' && c <= '9'){
                s_num += 1;
            }
        }
        System.out.println("小写："+x_num);
        System.out.println("大写："+d_num);
        System.out.println("数字："+s_num);
    }

    /**
     * 124.字符串拼接
     */
    public static String concat(int[] arr){
        String str = "";
        String fh;
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            fh = (i == arr.length - 1 ? "" : ",");
            str += arr[i] + fh;
        }
        str += "]";
        return str;
    }

    public static void concatDemo(){
        int[] arr = {1,3,5};
        String re = concat(arr);
        System.out.println(re);
    }

    /**
     * 125.字符串反转
     */
    public static String reverse(String _str){
        String str = "";
        for (int i = _str.length() - 1; i >= 0; i--) {
            str += _str.charAt(i);
        }
        return  str;
    }
    public static void reverseDemo(){
        System.out.println(reverse("abcdef"));
    }
}
