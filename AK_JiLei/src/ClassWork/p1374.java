import java.util.*;

/**
 * Created by 纪雷 on 2017/10/14.
 */
public class p1374 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
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
        int[] c=new int[m];
        for (int i = 0; i < m; i++) {
            c[i]=0;
        }
        int t=0;
        for (Edge e : list) {
            b[t][0]=e.u;
            b[t][1]=e.v;
            t++;
        }
        int sum = 0;
            int x=0,i=0;
            while(x<m&&i<m) {
                if (c[x] != 0 && a[i][0] < c[x]) {
                    x++;
                }
                if (c[x] != 0 && b[i][0] >= c[x]) {
                    c[x] = b[i][1];
                    i++;
                    x=0;
                }
                if (c[x] == 0) {
                    c[x] = b[i][1];
                    i++;
                    sum++;
                    x=0;
                }
            }
        System.out.println(sum);
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