package MySelfWork;

/**
 * Created by ${纪雷} on 2018/8/19.
 */
public class 朋友 {
    public static void main(String[] args) {
        char[] chs=generate();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

    }


    public static char[] generate(){
        char[] chs=new char[5];
        char[] letters={'A','B','C','D','E','F','G','H','I',
                        'J','K','L','M','N','O','P','Q','R',
                        'S','T','U','V','W','X','Y','Z'};
        boolean[] flags=new boolean[letters.length];
        for (int i = 0; i < chs.length; i++) {
            int index;
            do {
                index = (int)Math.random()*26;
            }
            while (flags[index]==true);
            chs[i]=letters[index];
            flags[index]=true;
        }
        //System.out.println(chs);
        return chs;
    }
}
