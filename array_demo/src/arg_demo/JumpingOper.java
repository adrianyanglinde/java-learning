package arg_demo;

/**
 * 03. 接口名作为形参和返回值
 * 方法的形参是接口名，其实是要该接口的实现类对象
 * 方法的返回值是接口名，其实返回的是该接口的子实现类对象
 */
public class JumpingOper {
    public void useJump(Jumping j){
        j.jump();
    }
    public Jumping getJumping(){
        return new Cat();
    }
}
