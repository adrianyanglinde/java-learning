package athlete_coach_demo;

public class BasketBallAthlete extends Athlete{

    public BasketBallAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void practice() {
        System.out.println("篮球运动员训练");
    }
}


