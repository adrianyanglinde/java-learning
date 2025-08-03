package p2_3_constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        practice2();
    }

    public static void overview() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?>[] declaredConstructors = studentCls.getDeclaredConstructors();
        for(Constructor con:declaredConstructors){
            System.out.println(con);
        }

        Constructor<?> con = studentCls.getConstructor();
        System.out.println(con);

        Object o = con.newInstance();
        System.out.println(o);
    }

    public static void practice1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?> con = studentCls.getConstructor(String.class, int.class, String.class);
        Object obj = con.newInstance("Hong",18,"amoy");
        System.out.println(obj);
    }

    public static void practice2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?> con = studentCls.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object obj = con.newInstance("Hong");
        System.out.println(obj);
    }
}
