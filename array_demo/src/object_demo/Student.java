package object_demo;

public class Student {

    private String name;
    private String age;

    public Student( String name, String age){

        this.name = name;
        this.age = age;

    }



    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null)
            return false;
        return age != null ? age.equals(student.age) : student.age == null;
    }


}
