package JavaWeb;


import java.util.*;

/**
 * Created by ${纪雷} on 2019/3/12.
 */
public class 一种排序 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        while (m-- > 0) {
            int n = cin.nextInt();
            int[][] a = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = cin.nextInt();
                }
            }
            int[][] b = new int[n][3];
            int k = 0, t;
            for (int i = 0; i < n; i++) {
                if (a[i][2] > a[i][1]) {
                t = a[i][2];
                a[i][2] = a[i][1];
                a[i][1] = t;
                }
                if (i>0&&((a[i][1] == a[i - 1][1] && a[i][2] == a[i - 1][2]&&a[i][0] == a[i - 1][0])
                        || (a[i][1] == a[i - 1][2] && a[i][2] == a[i - 1][1]&&a[i][0] == a[i - 1][0])))
                        continue;
                else {

                        b[k][0] = a[i][0];
                        b[k][1] = a[i][1];
                        b[k][2] = a[i][2];
                        k++;
                    }
            }
            ArrayList<Edge> list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                list.add(new Edge(b[i][0], b[i][1], b[i][2]));
            }
            Collections.sort(list, new Comparator<Edge>() {
                @Override
                public int compare(Edge o1, Edge o2) {
                    if (o1.u != o2.u) return o1.u - o2.u;
                    else if (o1.v != o2.v) return o1.v - o2.v;
                    else return o1.w - o2.w;
                }
            });
            for (Edge e : list) {
                System.out.println(e.u+" "+e.v+" "+e.w);
            }
        }
    }
    static class Edge {
        int u,v,w;
        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
}
