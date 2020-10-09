import java.util.Scanner;

/**
 * 语句
 */
public class Statement{
    public static void main(String[] args){

        /**
         * case穿透
         * 春夏秋冬
         */
        System.out.println("------------");
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("春");    //没有break 继续向下执行，直到遇到break
            case 2:
            case 12:
                System.out.println("春");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("夏");
                break;
            default:
                System.out.println("无");

        }

        /**
         * 水仙花
         */
        System.out.println("------------");

        for (int i = 100;i <= 999;i++){
            int b = i / 100;
            int s = (i % 100) / 10;
            int g = (i % 10) / 1;
            int sss = (b * b * b) + (s * s * s) + (g * g * g);
            if(sss == i){
                System.out.println(i);
            }
        }


        /**
         * 珠穆朗玛峰
         */
        System.out.println("------------");

        int zhu = 8844430;
        double zhi = 0.1;
        int times = 0;
        while (zhi < zhu){
            zhi = zhi * 2;
            times++;
        }
        System.out.println(times);
    }
}