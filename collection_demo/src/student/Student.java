package student;

import java.util.Objects;

public class Student {
    private String sid;
    private String name;
    private String age;
    private String address;
    public Student(String sid,String name,String age,String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age, address);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        Student student = (Student) o;
//
//        if (sid != null ? !sid.equals(student.sid) : student.sid != null)
//            return false;
//        if (name != null ? !name.equals(student.name) : student.name != null)
//            return false;
//        if (age != null ? !age.equals(student.age) : student.age != null)
//            return false;
//        return address != null ? address.equals(student.address) : student.address == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = sid != null ? sid.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (age != null ? age.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        return result;
//    }
}
