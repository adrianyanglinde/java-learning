package permi_modify_demo_b;

import permi_modify_demo_a.Fu;

/**
 * 015. 修饰符
 *  - 权限修饰符
 *  - 状态修饰符
 *
 *  权限修饰符(见图表) :
 *      - private
 *      - protected
 *      - public
 */
public class Zi extends Fu{
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.show4();

        Zi zi = new Zi();
        zi.show3();
        zi.show4();
    }
}
