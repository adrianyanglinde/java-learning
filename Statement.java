import java.util.Scanner;
import java.util.Random;

/**
 * 语句
 */
public class Statement {
    public static void main(String[] args) {

        /**
         * case穿透
         * 38.春夏秋冬
         */
        system_demo.out.println("------------");
        Scanner sc = new Scanner(system_demo.in);

        int month = sc.nextInt();
        switch (month) {
            case 1:
                system_demo.out.println("春"); // 没有break 继续向下执行，直到遇到break
            case 2:
            case 12:
                system_demo.out.println("春");
                break;
            case 3:
            case 4:
            case 5:
                system_demo.out.println("夏");
                break;
            default:
                system_demo.out.println("无");

        }

        /**
         * 43.水仙花
         */
        system_demo.out.println("------------");

        for (int i = 100; i <= 999; i++) {
            int b = i / 100;
            int s = (i % 100) / 10;
            int g = (i % 10) / 1;
            int sss = (b * b * b) + (s * s * s) + (g * g * g);
            if (sss == i) {
                system_demo.out.println(i);
            }
        }

        /**
         * 46.珠穆朗玛峰
         */
        system_demo.out.println("------------");

        int zhu = 8844430;
        double zhi = 0.1;
        int times = 0;
        while (zhi < zhu) {
            zhi = zhi * 2;
            times++;
        }
        system_demo.out.println(times);

        /**
         * 47.do...while
         */
        int count = 1;
        do {
            system_demo.out.println("do while");
            count++;
        } while (count <= 5);

        /**
         * 49.跳转控制语句continue，break
         */
        for (int i = 1; i <= 30; i++) {
            if ((i % 7 == 6) || (i % 7 == 0)) {
                continue;
            }
            if (i == 20) {
                break;
            }
            system_demo.out.println("第" + i + "天去上班");
        }

        /**
         * 51.Random
         */
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10) + 1;
            system_demo.out.println(number);
        }

        /**
         * 52.猜数字
         */
        Scanner scanner = new Scanner(system_demo.in);
        Random random = new Random();
        int random_number = random.nextInt(10) + 1;
        int counts = 1;
        do {
            counts++;
            system_demo.out.println("请输入数字");
            int input_number = scanner.nextInt();
            if (input_number < random_number) {
                system_demo.out.println("太小");
                continue;
            }
            if (input_number > random_number) {
                system_demo.out.println("太大");
                continue;
            }
            if (input_number == random_number) {
                system_demo.out.println("congratulation");
                break;
            }
        } while (counts <= 10);

    }
}