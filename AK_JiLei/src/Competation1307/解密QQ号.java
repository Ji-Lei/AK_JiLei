package Competation1307;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/19.
 */
public class 解密QQ号 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        int n=cin.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=cin.nextInt();
            list.add(a[i]);
        }
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
                list.remove(list.get(i));
                if(i==list.size())break;
            list.add(list.get(i));
        }
        cin.close();
    }
}
