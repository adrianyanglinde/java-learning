package file_demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            file_to_collect2();
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
}
