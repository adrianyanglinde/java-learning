package athlete_coach_demo;

public class BasketBallCoach extends Coach{

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练员教导");
    }

}
