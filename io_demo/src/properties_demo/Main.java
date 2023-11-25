package properties_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       //  storeFn();
        game();
    }

    /**
     * 16_游戏次数
     */
    private static void game() throws IOException {
        FileReader fileReader = new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/properties_demo/game.txt");
        Properties properties = new Properties();
        properties.load(fileReader);
        fileReader.close();
        Set<String> strings = properties.stringPropertyNames();
        System.out.println(strings);
        if(strings.size() >= 3){
            System.out.println("请充值");
            return;
        }
        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        int aws = scanner.nextInt();
        Random random = new Random();
        int rd = random.nextInt(10);
        int cout = strings.size() + 1;
        properties.setProperty(Integer.toString(cout),rd == aws ? "对" : "错");
        FileWriter fileWriter = new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/properties_demo/game.txt");
        properties.store(fileWriter,"");
        fileWriter.close();

    }




    /**
     * 13_Properties作为Map集合的使用
     */
    private static void mapFn() {
        Properties properties = new Properties();
        properties.put(001,"yanglinde");
        properties.put(002,"hongdanping");
        properties.put(003,"gengxinxin");
        System.out.println(properties);
        for(Object key: properties.keySet()){
            Object value = properties.get(key);
            System.out.println(key + "," + value);
        }
    }

    /**
     * 14_Properties作为Map集合的特有方法
     */
    private static void ownerFn() {
        Properties properties = new Properties();
        properties.setProperty("001","yanglinde");
        properties.setProperty("002","hongdanping");
        properties.setProperty("003","gengxinxin");
        for (String key: properties.stringPropertyNames()){
            String value = properties.getProperty(key);
            System.out.println(key + "," + value);
        }
    }

    /**
     * 15_Properties和IO流相结合的方法
     */
    private static void storeFn() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("001","yanglinde");
        properties.setProperty("002","hongdanping");
        properties.setProperty("003","gengxinxin");
        FileWriter fileWriter = new FileWriter("/Users/yanglinde/Documents/project/java-learning/io_demo/src/properties_demo/text.txt");
        properties.store(fileWriter,"");
    }
    private static void loadFn() throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("/Users/yanglinde/Documents/project/java-learning/io_demo/src/properties_demo/text.txt");
        properties.load(fileReader);
        System.out.println(properties);
    }

}
