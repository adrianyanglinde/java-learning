package collections_demo;

import java.util.*;

public class Dou {
    private final ArrayList<String> pokers;
    private final HashMap<String,ArrayList<String>> hm;
    public Dou(){
        this.pokers = new ArrayList<>();
        this.hm = new HashMap<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] dians = {"3","4","5","6","7","8","9","10","J","Q","K"};
        for(String color:colors){
            for (String dian:dians){
                this.pokers.add(color+dian);
            }
        }
        this.pokers.add("大王");
        this.pokers.add("小王");

    }
    public void shuffle(){
        Collections.shuffle(this.pokers);
    }
    public void show(){
        System.out.println(this.pokers);
    }

    public void publish(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> listd = new ArrayList<>();
        for (int i = 0; i < this.pokers.size(); i++) {
            String item = this.pokers.get(i);
            if(i >= this.pokers.size() - 3){
                listd.add(item);
            }else if(i % 3 == 0){
                list1.add(item);
            }else if(i % 3 == 1){
                list2.add(item);
            }else{
                list3.add(item);
            }
        }
        hm.put("dipai",listd);
        hm.put("yanglinde",list1);
        hm.put("hongdanping",list2);
        hm.put("gnegxinxin",list3);

    }

    public void showEvery(){
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for(Map.Entry<String, ArrayList<String>> entry:entries){
            String name = entry.getKey();
            ArrayList<String> list = entry.getValue();
            System.out.println(name + "的牌是" + list);
        }

    }
}
