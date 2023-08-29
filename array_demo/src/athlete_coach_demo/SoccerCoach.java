package athlete_coach_demo;

public class SoccerCoach extends Coach implements Language{

    public SoccerCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("足球教练员教导");
    }

    @Override
    public void learnEnglish(){
        System.out.println("足球教练员学习英语");
    }

    @Override
    public void eat() {
        System.out.println("足球教练在A1办公室吃饭");
    }
}
