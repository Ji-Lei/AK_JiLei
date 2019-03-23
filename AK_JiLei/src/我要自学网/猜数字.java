package 我要自学网;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/12.
 */
public class 猜数字 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        //Random cin1=new Random();//随机产生数函数
        //int computer1=cin1.nextInt();//调用随机产生数函数
        int computer=(int)(Math.random()*101);//最直接单次调用随机产生数
        int my;
        do{
            System.out.println("请猜数字");
            my=cin.nextInt();
            if (my>computer)
                System.out.println("大了");
            else if(my<computer)
                System.out.println("小了");
        }while(my!=computer);

        //do while是先执行在判断，while是先判断再执行
        /*
        while(my!=computer){//my未赋值，不能进行判断，此方法不适用
            System.out.println("请猜数字");
            my=cin.nextInt();
            if (my>computer)
                System.out.println("大了");
            else if(my<computer)
                System.out.println("小了");
        }
         */
        System.out.println("猜对了");
    }
}
