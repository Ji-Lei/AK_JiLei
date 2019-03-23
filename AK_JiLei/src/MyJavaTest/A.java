package MyJavaTest;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/6/14.
 */
public class A {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){//多组输入的格式
            int[] a=new int[10];//定义一个新整形数组，空间大小为10
            int sum=0;//初始化加法器为0
            for (int i = 0; i < 10; i++) {
                sum=sum+a[i];
            }
            System.out.println(sum);
        }
    }
}
