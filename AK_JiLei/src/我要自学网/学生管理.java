package 我要自学网;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/12.
 */
public class 学生管理 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入学生人数");
        int ren=cin.nextInt();
        System.out.println("请输入课程数目");
        int keshu=cin.nextInt();
        String[] name=new String[ren];
        String[] kenanme=new String[keshu];
        int[][] a=new int[ren][keshu];
        int[] b=new int[ren];
        for (int i = 0; i < kenanme.length; i++) {
            System.out.println("请输入课程"+(i+1)+"的名字");
            kenanme[i]=cin.next();
        }
        for (int i = 0; i < ren; i++) {
            System.out.println("请输入学生姓名：");
            name[i]=cin.next();
            for (int j = 0; j < keshu; j++) {
                System.out.println("输入"+name[i]+kenanme[j]+"的成绩");
                a[i][j]=cin.nextInt();
                b[i]+=a[i][j];
            }
        }
        System.out.print("学生");
        for (int i = 0; i < keshu; i++) {
            System.out.print("\t"+kenanme[i]);
        }
        System.out.print("\t总分\t平均分\t排行榜");
        System.out.println();
        for (int i = 0; i < ren; i++) {
            System.out.print(name[i]);
            for (int j = 0; j < keshu; j++) {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\t"+b[i]+"\t"+b[i]/keshu);
            System.out.println();
        }
    }
}
