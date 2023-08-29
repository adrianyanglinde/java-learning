package athlete_coach_demo;

public class SoccerAthlete extends Athlete implements Language{

    public SoccerAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void practice() {
        System.out.println("足球运动员训练");
    }

    @Override
    public void learnEnglish(){
        System.out.println("足球运动员学习英语");
    }
}
