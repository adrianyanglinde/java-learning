package object_demo;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("梅西","11");
        // Object toString 没有意义 建议重写
        System.out.println(st1.toString());

        // Object equals 建议重写
        Student st2 = new Student("梅西","11");
        System.out.println(st1.equals(st2));

        /**
         * public boolean equals(Object obj) {
         *     this --- s1 谁调用this就指向谁
 *             return (this == obj);
 *         }
         */




    }
}
