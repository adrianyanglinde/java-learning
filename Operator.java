/**
 * 运算符
 */
public class Operator{
    public static void main(String[] args){

        int a = 6;
        int b = 4;

        /**
         * 1.1
         * +是运算符
         * a+b是表达式
         */
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //1
        System.out.println(a % b);


        //整数相除只能得到整数，要想得到小数，必须要有浮点数参与
        System.out.println(6.0 / 4); //1.5


        /**
         * 1.3
         * 字符的"+"操作
         */
        System.out.println("------------");
        int i = 10;
        char c = 'A';
        System.out.println(i + c);

        //char类型会被自动提升为int类型
        //char cc = i + c;
        int ii = i + c;
        System.out.println(ii);

        //int ii = i + 13.14;
        double d = i + 13.14;
        System.out.println(d);


        /**
         * 1.4
         * 字符串的"+"操作
         */
        System.out.println("------------");

        System.out.println("六六六" + "adrin");
        System.out.println(666 + "adrin");
        System.out.println("adrin" + 666);

        System.out.println("年黑马" + 99 + 1);
        System.out.println(99 + 1 + "年黑马");


        /**
         * 2.1
         * 赋值运算符
         */
        System.out.println("------------");

        int fa = 10;
        fa += 20;   //等价于 fa = fa + 20;
        System.out.println(fa);

        //注意：扩展的赋值运算符底层蕴含着强制类型转换
        short fa = 10;
        fa += 20;  //等价于fa = (int)(fa + 20);  short类型的fa在加操作中提升为int类型，结果是int类型
        System.out.println(fa);
    }
}