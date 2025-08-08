package p2_10_2_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("/Users/adrianyoung/Documents/project/java-learning/reflection/src/p2_10_2_practice/class.txt");
        properties.load(fileReader);
        fileReader.close();
        
        //System.out.println(properties);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        Class<?> cls = Class.forName(className);
        Method method = cls.getMethod(methodName);
        method.invoke(cls.newInstance());
    }
}
