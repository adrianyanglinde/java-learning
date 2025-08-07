package p2_8_method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        practice();
    }

    public static void overview() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");

        // Student st = new Student();
        Constructor<?> con = studentCls.getConstructor();
        Object object = con.newInstance();

//        Method[] declaredMethods = studentCls.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m);
//        }

        Method method1 = studentCls.getMethod("method1");
        method1.invoke(object);
    }

    public static void practice() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 获取Class对象
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");

        // Student s = new Student();
        Constructor<?> con = studentCls.getConstructor();
        Object object = con.newInstance();

        //s.method1();
        Method method1 = studentCls.getMethod("method1");
        method1.invoke(object);

        //s.method2();
        Method method2 = studentCls.getMethod("method2", String.class);
        method2.invoke(object, "Hong by reflection");


//        String ss = s.method3("林青霞",30);
//        System.out.println(ss);
        Method method3 = studentCls.getMethod("method3",String.class,int.class);
        Object str = method3.invoke(object, "Hong dan ping", 18);
        System.out.println(str);

        //s.function();
        Method func = studentCls.getDeclaredMethod("function");
        func.setAccessible(true);
        func.invoke(object);
    }



}
