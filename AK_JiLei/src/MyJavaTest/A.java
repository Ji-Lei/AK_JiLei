package MyJavaTest;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
public class A {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            int d=1;
            for(int i=0;i<b;i++){
                d=d*a%10;
            }
            System.out.println(d);
        }
    }
}
