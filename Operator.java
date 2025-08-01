import java.util.Scanner;

/**
 * 运算符和表达式
 */
public class Operator {
    public static void main(String[] args) {

        int a = 6;
        int b = 4;

        /**
         * +是运算符
         * a+b是表达式
         */

        /**
         * 18.算数运算符
         */
        system_demo.out.println(a + b);
        system_demo.out.println(a - b);
        system_demo.out.println(a * b);
        system_demo.out.println(a / b); // 1
        system_demo.out.println(a % b);

        // 整数相除只能得到整数，要想得到小数，必须要有浮点数参与
        system_demo.out.println(6.0 / 4); // 1.5

        /**
         * 19.字符的"+"操作
         */
        system_demo.out.println("------------");
        int i = 10;
        char c = 'A';
        system_demo.out.println(i + c);

        // char类型会被自动提升为int类型
        // char cc = i + c;
        int ii = i + c;
        system_demo.out.println(ii);

        // int ii = i + 13.14;
        double d = i + 13.14;
        system_demo.out.println(d);

        /**
         * 20.字符串的"+"操作
         */
        system_demo.out.println("------------");

        system_demo.out.println("六六六" + "adrin");
        system_demo.out.println(666 + "adrin");
        system_demo.out.println("adrin" + 666);

        system_demo.out.println("年黑马" + 99 + 1);
        system_demo.out.println(99 + 1 + "年黑马");

        /**
         * 21.赋值运算符
         */
        system_demo.out.println("------------");

        int fa = 10;
        fa += 20; // 等价于 fa = fa + 20;
        system_demo.out.println(fa);

        // 注意：扩展的赋值运算符底层蕴含着强制类型转换
        short fb = 10;
        fb += 20; // 等价于fa = (int)(fa + 20); short类型的fa在加操作中提升为int类型，结果是int类型
        system_demo.out.println(fb);

        /**
         * 22.自增自减运算符
         */
        system_demo.out.println("------------");

        // 单独使用
        int z = 10;
        // ++z; //11
        // z++; //11
        system_demo.out.println(z);

        // 参与操作使用
        // int j = z++; //先赋值 后++
        int j = ++z;
        system_demo.out.println("z:" + z);
        system_demo.out.println("j:" + j);

        /**
         * 23.关系运算符
         * 
         * 逻辑"与" & : 有false则false
         * 逻辑"或" ｜ : 有true则true
         * 逻辑"异或" ^ : 相同为false,不同为true
         * 逻辑"异或" ^ : 相同为false,不同为true
         */

        /**
         * 24.逻辑运算符
         * 
         * 逻辑"与" & : 有false则false
         * 逻辑"或" ｜ : 有true则true
         * 逻辑"异或" ^ : 相同为false,不同为true
         * 逻辑"非" ！ : 相反
         */

        /**
         * 25."短路与"和"与"的区别
         * "短路与" &&
         * "短路或" ||
         */
        system_demo.out.println("------------");

        int h1 = 10;
        int h2 = 20;

        // System.out.println((h1++ > 100) & (h2++ > 100));
        system_demo.out.println((h1++ > 100) && (h2++ > 100)); // 左边false &&右边不执行

        system_demo.out.println("h1:" + h1);
        system_demo.out.println("h2:" + h2);

        /**
         * 28.三个和尚
         */
        system_demo.out.println("------------");
        int hs1 = 210;
        int hs2 = 165;
        int hs3 = 150;

        int higher = hs1 > hs2 ? (hs1 > hs3 ? hs1 : hs3) : (hs2 > hs3 ? hs2 : hs3);

        system_demo.out.println(higher);

        /**
         * 30.三个和尚Pro
         */
        system_demo.out.println("------------");
        Scanner sc = new Scanner(system_demo.in);

        int hhs1 = sc.nextInt();
        int hhs2 = sc.nextInt();
        int hhs3 = sc.nextInt();

        int tempH = hhs1 > hhs2 ? hhs1 : hhs2;
        int maxH = tempH > hhs3 ? tempH : hhs3;
        system_demo.out.println(maxH);

    }
}