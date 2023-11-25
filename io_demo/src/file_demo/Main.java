package file_demo;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            copy_file_deep();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        copy_exp();
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
            int flag_1 = o2.getSum() - o1.getSum();
            int flag_2 = flag_1 == 0 ? o2.getMath() - o1.getMath() : flag_1;
            int flag_3 = flag_2 == 0 ? o2.getEnglish() - o1.getEnglish() : flag_2;
            int flag_4 = flag_3 == 0 ? o2.getName().compareTo(o1.getName()) : flag_3;
            return flag_4;
        }
    }

    /**
     * 02_复制单级文件夹
     */
    public static void copy_file_from_folder() throws IOException {
        File target = new File("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/temp_target");
        File origin = new File("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/temp");
        if(!(target.exists() && target.isDirectory())){
            target.mkdir();
        }
        File[] fileList = origin.listFiles();
        for(File originFile:fileList){
            File targetFile = new File(target.getPath(),originFile.getName());
//            if(!(targetFile.exists() && targetFile.isFile())){
//                targetFile.createNewFile();
//            }
            copy(originFile,targetFile);
        }
    }
    public static void copy(File originFile,File targetFile) throws IOException {
        System.out.println(originFile.getPath());
        System.out.println(targetFile.getPath());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));
        int by;
        while ((by = bis.read()) != -1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    /**
     * 03_复制多级文件夹
     */
    public static void copy_file_deep() throws IOException {
        File originFile = new File("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/temp_2");
        File targetFile = new File("/Users/yanglinde/Documents/project/java-learning/io_demo/src/file_demo/temp_2_target");
        recur(originFile,targetFile);
    }
    public static void recur(File file,File dir) throws IOException {
        String fileName = file.getName();
        if(file.isFile()){
            File copyFile = new File(dir,fileName);
            copy(file,copyFile);
            return;
        }
        if(file.isDirectory()){
            File copyDir = new File(dir,fileName);
            if(!copyDir.exists()){
                copyDir.mkdir();
            }
            File[] files = file.listFiles();
            if(files != null){
                for(File _file : files){
                    recur(_file,copyDir);
                }
            }
        }
    }

    /**
     * 04_复制文件的异常处理
     */
    public static void copy_exp() {
        try (FileReader fr = new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2.txt");
             FileWriter fw = new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/io_char_demo/test2-copy.txt")){
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1){
                fw.write(chs,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}























