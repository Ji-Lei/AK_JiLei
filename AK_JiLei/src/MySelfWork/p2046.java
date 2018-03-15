package 课下练习;

import java.util.Scanner;
/**
 * Created by 纪雷 on 2017/11/12.
 */
public class p2046 {
    public static void main(String[] args) {
        double[] a={0,40,80,120,160,180};
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
            int x=cin.nextInt();
            int y=cin.nextInt();
            int x1=cin.nextInt();
            int y1=cin.nextInt();
            double L=Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
            double x3=x;
            double y3=y-L;
            double c=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
            double k=Math.acos((Math.pow(L,2)*2-Math.pow(c,2))/(2.0*Math.pow(L,2)));
            k=k*180/3.14159265358979;
            if(x1==x)
                System.out.println(1);
            else if (x1>x){
                for (int i = 0; i <5 ; i++) {
                    if(k>a[i]&&k<=a[i+1])
                        System.out.println(5-i);
                }
            }
            else{
                for (int i = 0; i <5; i++) {
                    if(k>a[i]&&k<=a[i+1])
                        System.out.println((6+i)%9);
                }
            }
        }
    }
}

