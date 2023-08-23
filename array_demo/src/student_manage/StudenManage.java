package student_manage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenManage {
    private static ArrayList<Student> array = new ArrayList<>();
    public static void main(String[] args) {
        while (true){
            System.out.println("-----Welcome to Student System-----");
            System.out.println("1.添加学生");
            System.out.println("2.查看学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.println("亲输入选择：");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()){
                case 1:
                    addStudent();
                    break;
                case 2:
                    findAllStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM退出
                    break;
            }
        }


    }
    private static int findIndexBySid(String sid){
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student st = array.get(i);
            if(st.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        return index;
    }
    private static void addStudent(){
        System.out.println("请输入学生学号");
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true){
            sid = sc.next();
            if(findIndexBySid(sid) != -1){
                System.out.println("已经存在该学号！请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生地址");
        String address = sc.next();
        array.add(new Student(sid,name,age,address));
        System.out.println("添加成功！");
    }
    static void findAllStudent(){
        if(array.isEmpty()){
            System.out.println("无信息！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student st = array.get(i);
            System.out.println(st.getSid() + "\t"+st.getName()+"\t"+st.getAge()+"\t"+st.getAddress());
        }
    }

    static void deleteStudent(){
        System.out.println("请输入要删除学生的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();

        int index = findIndexBySid(sid);
        if(index == -1){
            System.out.println("删除失败");
        }else{
            array.remove(index);
            System.out.println("删除成功");
        }

    }
    static void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更新的学生的学号");
        String sid = sc.next();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生地址");
        String address = sc.next();

        int index = findIndexBySid(sid);
        if(index == -1){
            System.out.println("更改失败");
        }else{
            array.set(index,new Student(sid,name,age,address));
            System.out.println("更改成功");
        }
    }
}
