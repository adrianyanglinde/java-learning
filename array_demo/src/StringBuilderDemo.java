/**
 * String不可变，拼接的时候耗时占内存（内存图），所以解决办法是StringBuilder
 *
 * 127.StringBuilder
 * StringBuilder 是一个可变的字符串类，字符序列
 * 我们可以把它看成是一个容器
 * 这里的可变指的是 StringBuilder 对象中的内容是可变的
 */

/**
 * String内容是不可变
 * StringBuilder内容是可变
 */
public class StringBuilderDemo {
    public static void main(String[] args){
        reverseAndAdd();
    }

    /**
     * 128.构造方法
     */
    private static void constr(){
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length:" + sb.length());

        StringBuilder sb2 = new StringBuilder("abcdef");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length:" + sb2.length());
    }

    /**
     * 129.添加和反转
     * append 返回对象本身
     * reverse
     */
    static void reverseAndAdd(){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc").reverse();
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2);

        /**
         * 链式编程
         */
        StringBuilder sb3 = new StringBuilder();
        sb3.append("sss").append(300).append("we");
        System.out.println("sb3:" + sb3);

        System.out.println("sb3.reverse:" + sb3.reverse());
    }

    /**
     * 130.String和StringBuilder相互转换
     * 为什么要转？因为StringBuilder有append和reverse这两个方法好用
     */
    static void stringToStringBuilder(){
        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        sb.append("123");
        String str2 = sb.toString();
        System.out.println("str2:" + str2);
        System.out.println(str == str2);
    }

    /**
     * 131.拼接字符串
     */
    static String concat(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return  sb.toString();
    }
    static void concatDemo(){
        int[] arr = {1,3,5};
        String re = concat(arr);
        System.out.println(re);
    }

    /**
     * 132.字符串反转
     */
    static String reverse(String str){
        return  new StringBuilder(str).reverse().toString();
    }
    static void reverseDemo(){
        String re = reverse("abcdef");
        System.out.println(re);
    }
}
