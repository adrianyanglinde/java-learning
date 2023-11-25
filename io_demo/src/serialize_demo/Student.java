package serialize_demo;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private final int num;
    private final String name;
    private transient final int age;

    public Student(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
