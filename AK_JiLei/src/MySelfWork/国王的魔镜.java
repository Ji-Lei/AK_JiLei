package MySelfWork;

import java.util.Scanner;

/**
 * Created by ${纪雷} on 2018/6/10.
 */

public class 国王的魔镜 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n-->0){
            String str=input.next();
            int num=str.length();
            while(true){
                if(str.length()%2!=0){break;}
                String s1=str.substring(0, str.length()/2);
                String s2=str.substring(str.length()/2,str.length());

                char[] s=new char[s2.length()];
                s=s2.toCharArray();
                for (int i = 0,j=s.length-1; i < s.length/2; i++,j--) {
                    char a=s[i];
                    s[i]=s[j];
                    s[j]=a;
                }
                s2="";
                for (int i = 0; i < s.length; i++) {
                    s2+=s[i];
                }
                if(s1.equals(s2)){

                    num=s1.length();
                    str=s1;
                }
                else{
                    break;
                }
            }
            System.out.println(num);
        }
    }
}
