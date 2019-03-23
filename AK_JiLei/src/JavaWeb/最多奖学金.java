package JavaWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/15.
 */
public class 最多奖学金 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int sum=0;
        ArrayList<Edge> list=new ArrayList<>();
        while (n-->0){
            int cont=0;
            String str=cin.next();
            int a=cin.nextInt();
            int b=cin.nextInt();
            String c1=cin.next();
            String d1=cin.next();
            char c=c1.charAt(0);
            char d=d1.charAt(0);
            int l=cin.nextInt();
            if(a>80&&l>0){
                sum=sum+8000;
                cont=cont+8000;
            }
            if(a>85&&b>80){
                sum=sum+4000;
                cont=cont+4000;
            }
            if(a>90){
                sum=sum+2000;
                cont=cont+2000;
            }
            if(b>80&&c=='Y'){
                sum=sum+850;
                cont=cont+850;
            }
            if(a>85&&d=='Y'){
                sum=sum+1000;
                cont=cont+1000;
            }
            list.add(new Edge(str,cont));
        }
        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o2.x-o1.x;
            }
        });
        for(Edge y:list){
            System.out.println(y.name);
            System.out.println(y.x);
            break;
        }
        System.out.println(sum);
    }
    static class Edge{
        String name;
        int x;
        Edge(String name,int x){
            this.name=name;
            this.x=x;
        }
    }
}
