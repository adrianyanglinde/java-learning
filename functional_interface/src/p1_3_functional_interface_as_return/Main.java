package p1_3_functional_interface_as_return;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("ccc");
        list.add("aa");
        list.add("b");
        list.add("ddd");
        System.out.println("排序前：" + list);
        Collections.sort(list, getComparator());
        System.out.println("排序后：" + list);

    }
    public static Comparator<String> getComparator() {
//        return new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
      return ( o1,  o2) -> o1.length() - o2.length();
    }
}