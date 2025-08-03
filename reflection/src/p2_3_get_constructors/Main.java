package p2_3_get_constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");

//        Constructor<?>[] declaredConstructors = studentCls.getDeclaredConstructors();
//        for(Constructor con:declaredConstructors){
//            System.out.println(con);
//        }
//
//        Constructor<?> con = studentCls.getConstructor();
//        System.out.println(con);
//
//        Object o = con.newInstance();
//        System.out.println(o);

        Constructor<?> con2 = studentCls.getConstructor(String.class, int.class, String.class);
        Object o2 = con2.newInstance("Hong",18,"amoy");
        System.out.println(o2);
    }
}
