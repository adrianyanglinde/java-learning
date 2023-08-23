package student_teacher_demo;

public class Teacher extends Person{
    /**
     * 一旦给了带参数构造，系统就不会给无参构造
     */
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
    public void tech(){
        System.out.println(this.getName() + "老师正在教书");
    }
}
