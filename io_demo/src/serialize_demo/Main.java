package serialize_demo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
           // serialize();
           construct();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 10_对象序列化流
     * @throws IOException
     */
    public static void serialize() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/serialize_demo/text.txt"));
        Student st = new Student(1,"hongdanpin",32);
        oos.writeObject(st);
        oos.close();
    }

    /**
     * 11_对象反序列化流
     * @throws IOException
     */
    public static void construct() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/io_demo/src/serialize_demo/text.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + s.getAge());
         ois.close();
    }

    /**
     * 12_serialVersionUID&transient
     */
    public static void serialize2(){

    }
}
