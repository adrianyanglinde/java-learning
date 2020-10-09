import java.util.Scanner;

/**
 * 运算符和表达式
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
        short fb = 10;
        fb += 20;  //等价于fa = (int)(fa + 20);  short类型的fa在加操作中提升为int类型，结果是int类型
        System.out.println(fb);


        /**
         * 3.1
         * 自增自减运算符
         */
        System.out.println("------------");

        //单独使用
        int z = 10;
        //++z; //11
        //z++; //11
        System.out.println(z);

        //参与操作使用
        //int j = z++;  //先赋值 后++
        int j = ++z;
        System.out.println("z:" + z);
        System.out.println("j:" + j);

        /**
         * 5.3
         * "短路与"和"与"的区别
         */
        System.out.println("------------");

        int h1 = 10;
        int h2 = 20;

        //System.out.println((h1++ > 100) & (h2++ > 100));
        System.out.println((h1++ > 100) && (h2++ > 100));  //左边false &&右边不执行

        System.out.println("h1:" + h1);
        System.out.println("h2:" + h2);


        /**
         *
         * 三个和尚
         */
        System.out.println("------------");
        int hs1 = 210;
        int hs2 = 165;
        int hs3 = 150;

        int higher = hs1 > hs2 ? (hs1 > hs3 ? hs1 : hs3) : (hs2 > hs3 ? hs2 : hs3);

        System.out.println(higher);


        /**
         *
         * 三个和尚Pro
         */
        System.out.println("------------");
        Scanner sc = new Scanner(System.in);

        int hhs1 = sc.nextInt();
        int hhs2 = sc.nextInt();
        int hhs3 = sc.nextInt();

        int tempH = hhs1 > hhs2 ? hhs1 : hhs2;
        int maxH = tempH > hhs3 ? tempH : hhs3;
        System.out.println(maxH);




    }
}