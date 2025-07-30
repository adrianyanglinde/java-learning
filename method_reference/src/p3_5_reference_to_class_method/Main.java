package p3_5_reference_to_class_method;

public class Main {
    public static void main(String[] args) {

        useMyString(new MyString() {
            @Override
            public String mySubString(String s, int start, int end) {
                // lambda 表达式被类的实例方法替代时，第一个参数作为调用者，后面所有参数全部传递给该方法作为参数
                return s.substring(start,end);
            }
        });

        useMyString((s,start,end)-> s.substring(start,end));

        useMyString(String::substring);


    }

    public static void useMyString(MyString myString) {
        String s = myString.mySubString("布布和一二",1,3);
        System.out.println(s);
    }
}
