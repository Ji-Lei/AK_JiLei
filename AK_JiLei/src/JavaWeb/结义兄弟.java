package JavaWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/112
 */
public class 结义兄弟 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        String[] b=new String[n];
        int[][] a=new int[n][3];
        for (int i = 0; i < n; i++) {
            b[i]=cin.next();
            a[i][0]=cin.nextInt();
            a[i][1]=cin.nextInt();
            a[i][2]=cin.nextInt();
        }
        ArrayList<Edge> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Edge(b[i],a[i][0], a[i][1],a[i][2]));
        }
        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.v!=o2.v)
                    return o1.v - o2.v;
                else if(o1.w!=o2.w)
                    return o1.w - o2.w;
                else
                    return o1.x - o2.x;
            }
        });
        String[] c=new String[n];
        int t=0;
        for (Edge e:list){
            c[t]=e.u;
            t++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }

    static class Edge {
        String u;
        int v,w,x;
        Edge(String u, int v, int w, int x) {
            this.u = u;
            this.v = v;
            this.w = w;
            this.x = x;
        }
    }
}