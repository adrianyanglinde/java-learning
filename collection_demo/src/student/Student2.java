package student;

public class Student2 implements Comparable<Student2>{

    private String name;
    private int age;

    public Student2( String name, int age){

        this.name = name;
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student2 o) {
        int num = o.getAge() - this.age;
        int num2 = num == 0 ? this.name.compareTo(o.getName()) : num;
        return num2;
    }
}
