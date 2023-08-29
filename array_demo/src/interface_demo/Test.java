package interface_demo;

public class Test {

    public static void main(String[] args) {
        Jumping j = new Cat();
        j.jump();

        Jumping ji = new JumpingImpl();
//        ji.num = 90;    接口里num默认被final修饰
        System.out.println(ji.num);
        System.out.println(Jumping.num); // 接口里num默认被static修饰
    }
}
