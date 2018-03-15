package 课下练习;

import java.util.*;

/**
 * Created by 纪雷 on 2017/10/14.
 */
public class 贪心会场时间安排 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        while(n-->0) {
            int m = cin.nextInt();
            int[][] a = new int[m][2];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = cin.nextInt();
                }
            }
            ArrayList<Edge> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(new Edge(a[i][0], a[i][1]));
            }
            Collections.sort(list, new Comparator<Edge>() {
                @Override
                public int compare(Edge o1, Edge o2) {
                    return o1.v - o2.v;
                }
            });
            int[][] b=new int[m][2];
            int t=0;
            for (Edge e : list) {
                b[t][0]=e.u;
                b[t][1]=e.v;
                t++;
            }
            int sum = 1;
            for (int i = 0; i < m-1; i++) {
                if (b[i + 1][0] > b[i][1]) {
                    sum++;
                }
                else {
                    b[i + 1][0] = b[i][0];
                    b[i + 1][1] = b[i][1];
                }
            }
            System.out.println(sum);
        }
        cin.close();
    }
    static class Edge {
        int u, v;
        Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }
}