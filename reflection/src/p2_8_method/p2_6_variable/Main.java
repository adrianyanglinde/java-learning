package p2_8_method.p2_6_variable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        overview();
    }

    public static void overview() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // Student st = new Student();
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?> con = studentCls.getConstructor();
        Object object = con.newInstance();

//        Method[] declaredMethods = studentCls.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m);
//        }

        Method method1 = studentCls.getMethod("method1");
        method1.invoke(object);
    }



}
