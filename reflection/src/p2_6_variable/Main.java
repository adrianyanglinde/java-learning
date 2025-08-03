package p2_6_variable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        practice1();
    }

    public static void overview() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // Student st = new Student();
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?> con = studentCls.getConstructor();
        Object object = con.newInstance();

//        Field[] declaredFields = studentCls.getDeclaredFields();
//        for (Field f : declaredFields) {
//            System.out.println(f);
//        }

        // st.address = "xiamen"
        Field addressField = studentCls.getField("address");
        addressField.set(object,"xiamen");
        System.out.println(object);
    }

    public static void practice1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // Student st = new Student();
        Class<?> studentCls = Class.forName("p2_2_get_class_obj.Student");
        Constructor<?> con = studentCls.getConstructor();
        Object object = con.newInstance();

        // st.name = "Hong"
        Field nameField = studentCls.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(object,"Hong");

        // st.address = "xiamen"
        Field addressField = studentCls.getDeclaredField("address");
        addressField.set(object,"xiamen");

        // st.age = 18
        Field ageField = studentCls.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(object,18);

        System.out.println(object);
    }

}
