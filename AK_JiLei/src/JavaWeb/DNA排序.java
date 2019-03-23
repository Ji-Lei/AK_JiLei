package JavaWeb;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ${纪雷} on 2019/3/14.
 */

public class DNA排序 {

    static class Node implements Comparable{

        String str="";
        int id=0;
        int sortN=0;

        Node(String str,int id,int sortN){
            this.str=str;
            this.id=id;
            this.sortN=sortN;
        }

        public int compareTo(Object o) {
            Node node=(Node)o;
            if(node.sortN==sortN){
                return node.id<id?1:(node.id==id?0:-1);
            }else{
                return node.sortN<sortN?1:-1;
            }
        }

    }

    private static int getSortN(String str){
        int len=str.length();
        int ans=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(str.charAt(i)>str.charAt(j))
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int ncase=in.nextInt();
        List<Node> l=new ArrayList<Node>();
        for(int i=0;i<ncase;i++){
            String str=in.next();
            l.add(new Node(str,i,getSortN(str)));
        }
        Collections.sort(l);
        for(Iterator<Node> it=l.iterator();it.hasNext();){
            System.out.println(it.next().str);
        }
    }
}

