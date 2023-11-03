package map_demo;

import student.Student;

import java.util.*;

/**
 * Day7
 */
public class Test {
    public static void main(String[] args) {
        exp5();
    }

    /**
     * 1.map集合
     */
    public static void def(){
        Map<String, String> map = new HashMap<>();
        map.put("001","hongdanping");
        map.put("002","yanglinde");
        map.put("003","panyiran");
        map.put("003","gengxinxin");
        System.out.println(map);

        /**
         * 2.Map集合的基本功能
         */
        map.put("004","杨姐");
        map.remove("004");
//        map.clear();
        System.out.println(map.containsKey("001"));
        System.out.println(map.containsValue("hongdanping"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());



        /**
         * 3.Map 集合的获取功能
         */
        System.out.println(map.get("001"));
        System.out.println(map.keySet());
        System.out.println(map.values());


        /**
         * 4.Map集合的遍历(方式1)
         */
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key + ":" + map.get(key));
        }

        /**
         * 5.Map集合的遍历(方式2)
         */
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    /**
     * 6.
     */
    public static void exp1(){
        HashMap<String, Student> map = new HashMap<>();
        map.put("001",new Student("001","hongdanpin","32","111"));
        map.put("002",new Student("002","yanglinde","31","111"));
        map.put("003",new Student("003","gengxinxin","30","111"));
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry: entries){
            System.out.println(entry);
            System.out.println(entry.getKey() + ":" + entry.getValue().getName());
        }
    }
    /**
     * 7. 学生对象作为HashMap的唯一键
     * 重写Student 的hashSet&equal
     */
    public static void exp2(){
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("001","hongdanpin","32","111"),"中国");
        map.put(new Student("002","yanglinde","31","111"),"美国");
        map.put(new Student("003","gengxinxin","30","111"),"澳洲");
        map.put(new Student("003","gengxinxin","30","111"),"香港");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry: entries){
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
    }

    /**
     * 8. ArrayList 嵌套HashMap
     */
    public static void exp3(){
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("001","中国");
        hm1.put("002","美国");
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("00001","洪丹萍");
        hm2.put("00002","杨林德");
        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("1","曼城");
        hm3.put("2","曼联");
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        list.add(hm1);
        list.add(hm2);
        list.add(hm3);
        for(HashMap<String,String>hm:list){
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for(Map.Entry<String, String> entry:entries){
                System.out.println(entry);
            }
        }
    }

    /**
     * 9. HashMap嵌套ArrayList
     */
    public static void exp4(){
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("曼联");
        list1.add("曼城");
        hm.put("俱乐部",list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("洪丹萍");
        list2.add("杨林德");
        hm.put("人物",list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("中国");
        list3.add("美国");
        hm.put("国家",list3);



        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry: entries){
            System.out.println(entry.getKey());
            ArrayList<String> list = entry.getValue();
            for (String str:list){
                System.out.println(str);
            }
        }
//        Set<String> keys = hm.keySet();
//        for (String key:keys){
//            System.out.println(key);
//            ArrayList<String> list = hm.get(key);
//            for(String str:list){
//                System.out.println(str);
//            }
//        }
    }
    /**
     * 10. 统计字符串中每个字符出现的次数
     */
    public static void exp5(){
        String str = "abcsdabbbgaaebdcc";
//        HashMap<Character, Integer> hm = new HashMap<>();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            Integer t = hm.get(c);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                t+=1;
                hm.put(c,t);
            }
        }
        StringBuilder str1 = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for(Map.Entry<Character, Integer> entry:entries){
            str1.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
        }
        System.out.println(str1);
    }
}
