package set_demo;

import java.util.ArrayList;
import java.util.Collections;

public class Dou {
    private final ArrayList<String> list = new ArrayList<>();
    public Dou(){
        for (int i = 1; i <= 12; i++) {
            this.list.add("红桃"+i);
            this.list.add("方块"+i);
            this.list.add("梅花"+i);
            this.list.add("黑桃"+i);
        }
    }
    public void shuffle(){
        Collections.shuffle(this.list);
    }
    public void add(){
        Collections.shuffle(this.list);
    }
}
