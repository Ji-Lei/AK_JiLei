package Competation1307;

import MyJavaTest.E;
import com.sun.javafx.geom.Edge;

import java.util.*;

/**
 * Created by ${纪雷} on 2019/3/20.
 */
public class 众数 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] a=new int[n];
        TreeSet<Integer> set=new TreeSet<>();
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a[i]=cin.nextInt();
            set.add(a[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        int k=0;
        int[] b=new int[set.size()];
        Object[] c=set.toArray();
        Object[] d=list.toArray();
        for (int i = 0; i < n; i++) {
            if (d[i]==c[k])b[k]++;
            else{
                k++;
                b[k]++;
            }
        }
        ArrayList<Edge> list1=new ArrayList<>();
        for (int i = 0; i < set.size(); i++) {
            list1.add(new Edge(c[i],b[i]));
        }
        Collections.sort(list1, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.v==o2.v)return 1;
                return o2.v-o1.v;
            }
        });
        for(Edge h:list1){
            System.out.println(h.u);
            System.out.println(h.v);
            break;
        }
        cin.close();
    }
    static class Edge{
        Object u;
        int v;
        Edge(Object u,int v){
            this.u=u;
            this.v=v;
        }
    }
}
