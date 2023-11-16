package collections_demo;

import java.util.*;

public class Dou2 {
    private final HashMap<Integer,String> pokers;
    private final ArrayList<Integer> pokers_list;
    public Dou2(){
        this.pokers = new HashMap<>();
        this.pokers_list = new ArrayList<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] dians = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 0;
        for(String dian:dians){
            for (String color:colors){
                index+=1;
                this.pokers.put(index,color+dian);
                this.pokers_list.add(index);
            }
        }
        this.pokers.put(54,"大王");
        this.pokers.put(53,"小王");
        this.pokers_list.add(53);
        this.pokers_list.add(54);
    }
    public void shuffle(){
        Collections.shuffle(this.pokers_list);
    }
    public void show(){
        System.out.println(this.pokers);
        System.out.println(this.pokers_list);
    }

    public void publish(){
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
        TreeSet<Integer> setd = new TreeSet<>();
        for (int i = 0; i < this.pokers_list.size(); i++) {
            int key = this.pokers_list.get(i);
            if(i >= this.pokers.size() - 3){
                setd.add(key);
            }else if(i % 3 == 0){
                set1.add(key);
            }else if(i % 3 == 1){
                set2.add(key);
            }else{
                set3.add(key);
            }
        }

        this.showEvery("hongdanping",set1);
        this.showEvery("yanglinde",set2);
        this.showEvery("gengxinxin",set3);
        this.showEvery("dipai",setd);
    }

    public void showEvery(String name,TreeSet<Integer> set){
        System.out.println(name + "的牌是：");
        for(Integer key:set){
            System.out.print(this.pokers.get(key) + " ");
        }
        System.out.println();
    }
}
