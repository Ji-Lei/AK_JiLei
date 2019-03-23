package 我要自学网;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/11.
 */
public class 猜拳游戏 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("---猜拳游戏---");
        System.out.println("请出拳：1，石头；2，剪刀，3布");
            int my = cin.nextInt();
            int computer = (int) (Math.random() * 3) + 1;//随机数
            if (my == 1)
                System.out.print("我出的是：石头 ");
            else if (my == 2)
                System.out.print("我出的是：剪刀 ");
            else System.out.print("我出的是：布 ");

            if (computer == 1)
                System.out.println("电脑出的是：石头");
            else if (computer == 2)
                System.out.println("电脑出的是：剪刀");
            else System.out.println("电脑出的是：布");
            if (my == computer)
                System.out.println("平局");
            else if ((my == 1 && computer == 2) ||(my==2&&computer == 3) || (my == 3 && computer == 1))
                System.out.println("我赢");
            else System.out.println("电脑赢");
       cin.close();
    }
}
