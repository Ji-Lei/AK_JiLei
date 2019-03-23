package JavaWeb;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 数字母 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        char[] a=new char[225];
        int[] sum=new int[26];
        for (int i = 0; i < 26; i++) {
            sum[i]=0;
        }
        for (int i = 0; i < 225; i++) {
            if(a[i]=='#')
            break;
            a[i]=cin.nextLine().toLowerCase().charAt(0);

            sum[a[i]-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char)(i+'a')+" "+sum[i]);
        }
    }
}
