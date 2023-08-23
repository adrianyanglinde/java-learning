package variable_demo;

/**
 * 变量
 */
public class Variable {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        /**
         * 定义long类型
         * 为了防止整数过大，要加L
         */
        long l = 10000000000000L;
        System.out.println(l);

        /**
         * 定义float类型
         * 为了防止类型不兼容，要加F
         */
        float f = 3.14F;
        System.out.println(f);

        /**
         * 自动类型转换
         * 范围小转范围大
         */
        float ff = 10;
        System.out.println(ff);

        byte b = 55;
        short s = b;
        int i = s;
        System.out.println(i);

        /**
         * 强制类型转换
         * 范围小转范围大，不建议，会丢失数据
         */
        double dd = 88.88888;
        int ii = (int) dd;
        System.out.println(ii);

    }
}