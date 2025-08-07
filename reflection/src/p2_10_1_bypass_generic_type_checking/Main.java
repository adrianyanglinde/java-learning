package p2_10_1_bypass_generic_type_checking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {

    // 绕过泛型检查（类型擦除）
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add("hong");
        Class<? extends ArrayList> cls = integers.getClass();
//        Constructor<? extends ArrayList> constructor = cls.getConstructor();
//        ArrayList obj = constructor.newInstance();
        Method add = cls.getMethod("add", Object.class);
        add.invoke(integers, 1);
        add.invoke(integers, "hong");

        System.out.println(integers);


    }







}
