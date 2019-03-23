package Competation1307;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ${纪雷} on 2019/3/19.
 */
public class PA {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        TreeSet<Integer> list=new TreeSet<>();
        int n=cin.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        for(int c:list)
        System.out.println(c);
        cin.close();
    }
}
