package file_demo;

public class Student {
    private final int num;
    private final String name;
    private final int age;

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

}
