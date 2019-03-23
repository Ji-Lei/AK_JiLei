package JavaWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/15.
 */
public class 分学生的根 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        double a=cin.nextDouble();
        double b=cin.nextDouble();
        double c=cin.nextDouble();
        double d=cin.nextDouble();
        double e=cin.nextDouble();
        ArrayList<Edge> list=new ArrayList<>();

        while(cin.hasNext()){
              String str=cin.next();
              double a1=cin.nextDouble();
              double b1=cin.nextDouble();
              double c1=cin.nextDouble();
              double d1=cin.nextDouble();
              double e1=cin.nextDouble();
              double sum=a1+b1+c1+d1;
              double cont=sum*0.6+e1*0.4;
              if(a1<a||b1<b||c1<c||d1<d||sum<e)continue;
              else
              {
                  list.add(new Edge(str,e1,sum,cont));
              }
        }


        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.o==o2.o)return o1.name.compareTo(o2.name);
                return (int)(o2.o-o1.o);
            }
        });
        int k=0;
        for (Edge s:list){
            System.out.println(s.name+" "+(int)s.z+" "+(int)s.y+" "+String.format("%.1f",s.o)+" "+(k=k+1));
        }
    }
    static class Edge{
        String name;
        double y,z,o;
        Edge(String name,double y,double z,double o){
            this.name=name;
            this.y=y;
            this.z=z;
            this.o=o;
        }
    }
}
