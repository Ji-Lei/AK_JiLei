package JavaWeb;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 挑选字母 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String a=cin.next();
        String b=a.replaceAll("[^(A-Za-z)]", "");
        int n=b.length();
        System.out.println(n);
        cin.close();
    }
}
