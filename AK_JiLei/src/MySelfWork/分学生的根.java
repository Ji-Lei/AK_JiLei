package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 分学生的根 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        double m=cin.nextDouble();
        double n=cin.nextDouble();
        double h=cin.nextDouble();
        double t=cin.nextDouble();
        String[] a=new String[100];
        double[][] b=new double[200][5];
        for (int i = 0; i < 200; i++) {
            a[i]=cin.next();
            for (int j = 0; j < 5; j++) {
                b[i][j]=cin.nextDouble();
            }
        }

    }
    static class Edeg{
        String u;
        double v,w,x,y;
        Edeg(String u,double v,double w,double x,double y){
            this.u=u;
            this.v=v;
            this.w=w;
            this.x=x;
            this.y=y;
        }
    }
}
