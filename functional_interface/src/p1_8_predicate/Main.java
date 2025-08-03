package p1_8_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        checkString("Hong",(str)->str.length()>10);
        checkString("Hong",(str)->str.length()>2);
        checkStringCombine("Hong", (str)->str.length()>10,(str)->str.length()>2);

        String[] members = {"杨林德,17","洪丹萍,18","周恬,17","耿欣欣,17","李子晨,12","黄雅静,28"};
        ArrayList<String> members2 = filterMembers(members,
                str->str.split(",")[0].length()>=3,
                str-> Integer.parseInt(str.split(",")[1]) <=22);
        for (String member : members2) {
            System.out.println(member);
        }
    }
    public static void checkString(String str,Predicate<String> predicate) {
        boolean result = predicate.negate().test(str);
        System.out.println(result);
    }
    public static void checkStringCombine(String str,Predicate<String> predicate1,Predicate<String> predicate2) {
        boolean result = predicate1.or(predicate2).test(str);
        System.out.println(result);
    }
    public static ArrayList<String> filterMembers(String[] members, Predicate<String> predicate1, Predicate<String> predicate2) {
        ArrayList<String> list = new ArrayList<>();
        for (String member : members) {
            if(predicate1.and(predicate2).test(member)) {
                list.add(member);
            }
        }
        return list;

    }


}