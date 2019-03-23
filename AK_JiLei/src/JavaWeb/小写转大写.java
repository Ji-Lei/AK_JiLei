package JavaWeb;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 小写转大写 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String a=cin.next();
            a=a.toUpperCase();
            System.out.println(a);
        }
        cin.close();
    }
}
