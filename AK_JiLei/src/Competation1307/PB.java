package Competation1307;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ${纪雷} on 2019/3/19.
 */
public class PB {
        public static void main(String[] args) {
            Scanner cin=new Scanner(System.in);

            String str=cin.nextLine();

            String[] str1=str.toLowerCase().split("\\W+");
            int[] a=new int[str1.length];
            //TreeSet<String> set=new TreeSet<>();

            System.out.println(str1.length);

            Arrays.sort(str1);

            String t=str1[0];

            System.out.print(str1[0]+":");
            int sum=1;
            for (int i = 1; i < str1.length; i++) {

                if(t.equals(str1[i])){
                    sum++;
                    continue;
                }

                else{
                    System.out.println(sum);
                    sum=1;
                    System.out.print(str1[i]+":");
                    t=str1[i];
                }
            }
            System.out.println(sum);

            //for (int i = 0; i < str1.length; i++) {
            // set.add(str1[i]);
            //}

            //for (String c:set)
                //System.out.println(c);
            cin.close();
        }
}
