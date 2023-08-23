package polymorphism_demo_catdog;

public class Animal {
    private String name;
    private int age;
    public String text = "默认";

    public Animal(){}
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void eat(){
        System.out.println("动物吃饭");
    }
}
