package file_demo;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            collect_to_file_sort();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 16_集合到文件
     */
    public static void collect_to_file() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/test.txt"));
        String str;
        while ((str = br.readLine()) != null){
            list.add(str);
        }
        br.close();
        for (String st:list){
            System.out.println(st);
        }
    }

    /**
     * 17_文件到集合
     */
    public static void file_to_collect() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("yanglinde love hongdanping");
        list.add("hongdanping love yanglinde");
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/test.txt"));
        for (String st:list){
            bw.write(st);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
    /**
     * 18_点名器
     */
    public static void roll_book() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/student.txt"));
        String str;
        while ((str = br.readLine()) != null){
            list.add(str);
        }
        br.close();
        Random random = new Random();
        int index = random.nextInt(list.size());
        System.out.println(list.get(index));

    }
    /**
     * 19_集合到文件改进版
     */
    public static void collect_to_file2() throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"yanglinde",31));
        list.add(new Student(2,"hongdanping",32));
        list.add(new Student(3,"gengxinxin",30));
        list.add(new Student(4,"panyiran",31));
        list.add(new Student(5,"zhoutian",32));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/student.txt"));
        for (Student st:list){
            StringBuilder sb = new StringBuilder();
            sb.append(st.getNum()).append(",").append(st.getName()).append(",").append(st.getAge());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    /**
     * 20_文件到集合改进版
     */
    public static void file_to_collect2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/student.txt"));
        ArrayList<Student> list = new ArrayList<>();
        String line;
        while ((line = br.readLine())!=null){
            String[] prop = line.split(",");
            list.add(new Student(Integer.parseInt(prop[0]),prop[1],Integer.parseInt(prop[2])));
        }
        br.close();
        for (Student st:list){
            System.out.print(st.getNum());
            System.out.print(st.getName());
            System.out.print(st.getAge());
            System.out.println();
        }
    }
/**
 * Day10
 */
    /**
     * 01_集合到文件数据排序改进版
     */
    public static void collect_to_file_sort() throws IOException {
        TreeSet<StudentStudy> treeSet = new TreeSet<>(new StudentStudyComparator());
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            StudentStudy student = new StudentStudy();
            System.out.println("请输入姓名");
            student.setName(scanner.nextLine());
            System.out.println("请输入语文成绩");
            student.setChinese(scanner.nextInt());
            System.out.println("请输入数学成绩");
            student.setMath(scanner.nextInt());
            System.out.println("请输入英语成绩");
            student.setEnglish(scanner.nextInt());
            treeSet.add(student);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/test_study.txt"));
        for(StudentStudy st:treeSet){
            StringBuilder sb = new StringBuilder();
            sb.append(st.getName());
            sb.append(",");
            sb.append(st.getChinese());
            sb.append(",");
            sb.append(st.getMath());
            sb.append(",");
            sb.append(st.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
    }

    static class StudentStudyComparator implements Comparator<StudentStudy> {
        @Override
        public int compare(StudentStudy o1, StudentStudy o2) {
            int total1 = o1.getEnglish() + o1.getChinese() + o1.getMath();
            int total2 = o2.getEnglish() + o2.getChinese() + o2.getMath();
            return Integer.compare(total1, total2);
        }
    }
}























