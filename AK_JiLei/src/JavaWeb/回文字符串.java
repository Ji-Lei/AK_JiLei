package JavaWeb;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 回文字符串 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String a=cin.next();
        char[] b;
        b=a.toCharArray();
        int n=b.length;
        int m=0;
        for (int i = 0; i < n; i++) {
            if(b[i]==b[n-1-i])m++;
            else break;
        }
        if(m==n)
            System.out.println("Y");
        else
            System.out.println("N");
        cin.close();
    }
}
