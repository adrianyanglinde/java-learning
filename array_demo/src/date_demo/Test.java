package date_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Day4
 */

/**
 * 6,7. Date类
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);


        System.out.println(d1.getTime() * 1.0 / 1000 / 60 /60 /24 /365);

        Date d3 = new Date();
        d3.setTime(System.currentTimeMillis());
        System.out.println(d3);

        /**
         * 8. SimpleDateFormat
         * 格式化：将日期格式化成 日期/时间 字符串
         * 解析：从给定的字符串开始解析文本生成 日期
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d1));

        Date d5 = sdf.parse("2023-09-30 10:03:08");
        System.out.println(d5);

        /**
         * 9.
         */
        Date d6 = new Date();
        String str = "2023-09-30 10:03:08";
        String format = "yyyy-MM-dd HH:mm:ss";
        System.out.println(DateUtils.dateToString(d6,format));
        System.out.println(DateUtils.stringToDate(str,format));



        /**
         * 10. Calendar 类
         * 11. Calendar 常用方法
         */
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.YEAR,-3);
        ca.set(2048,10,6);
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH) + 1);
        System.out.println(ca.get(Calendar.DATE));


        /**
         * 12. 二月天
         */
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Calendar ca2 = Calendar.getInstance();
        ca2.set(year,2,1);
        ca2.add(Calendar.DATE,-1);
        System.out.println(ca2.get(Calendar.DATE));


    }

}
