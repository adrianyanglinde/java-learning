package athlete_coach_demo;

public class Test {
    /**
     * 17.18. 运动员和教练员
     * tip:
     *  分析的时候从具体分析 再去抽象
     *  实现的时候从抽象到具体
     */

    public static void main(String[] args) {
        SoccerAthlete sa = new SoccerAthlete("梅西",36);
        SoccerCoach sc = new SoccerCoach("弗格森",60);
        BasketBallAthlete ba = new BasketBallAthlete("姚明",30);
        BasketBallCoach bc = new BasketBallCoach("阿的江",50);

        sa.practice();
        sa.learnEnglish();
        sa.eat();

        sc.teach();
        sc.learnEnglish();
        sc.eat();

        ba.practice();
        ba.eat();

        bc.teach();
        bc.eat();
    }

}
