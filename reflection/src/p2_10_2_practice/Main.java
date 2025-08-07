package p2_10_2_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("p2_10_2_practice\\class.txt");
        properties.load(fileReader);
        fileReader.close();

        System.out.println(properties);
    }
}
