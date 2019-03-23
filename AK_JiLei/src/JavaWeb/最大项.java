package JavaWeb;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/13.
 */
public class 最大项 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            String a=cin.next();
            char[] b=a.toCharArray();
            char max=b[0];
            for (int i = 0; i < b.length; i++) {
                if(b[i]>max)max=b[i];
            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
                if(b[i]==max)
                    System.out.print("(max)");
            }
            System.out.println();
        }
        cin.close();
    }
}
