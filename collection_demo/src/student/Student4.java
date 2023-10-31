package student;

public class Student4 {

    private String name;
    private int yuwen;
    private int math;

    public Student4(String name, int yuwen, int math) {
        this.name = name;
        this.yuwen = yuwen;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public int getYuwen() {
        return yuwen;
    }

    public int getSum() {
        return yuwen + math;
    }
}
