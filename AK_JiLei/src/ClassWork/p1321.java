import java.util.*;
public class p1321 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            TreeMap<Double, Integer> map = new TreeMap<Double, Integer>();
            int n = cin.nextInt();
            for (int i = 1; i <=n ; i++) {
                Double x = cin.nextDouble()/cin.nextDouble();
                if(map.containsKey(x))
                    map.put(x,map.get(x)+1);
                else map.put(x,1);
            }
            System.out.println(Collections.max(map.values()));
        }
        cin.close();
    }
}
