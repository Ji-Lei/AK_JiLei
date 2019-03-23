package JavaWeb;
import java.util.Scanner;

/**
 * Created by ${纪雷} on 2019/3/15.
 */

public class DNA排序2{
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int numOfChars = cin.nextInt();
        int numOfStrings = cin.nextInt();
        cin.nextLine();
        String strings[] = new String[numOfStrings];
        int degrees[] = new int[numOfStrings];//存储每个字符串的sortedness
        for(int i = 0; i < numOfStrings; i++){//求得每个字符串的sortedness,并存储在数组degrees[]中
            degrees[i] = 0;
            strings[i] = cin.nextLine();
            for(int j = 0; j < numOfChars; j++){
                if(strings[i].charAt(j) == 'A'){//如果当前字符是A，后面不管是什么字符，sortedness都不变

                }else if (strings[i].charAt(j) == 'C'){//如果当前字符是C，后面若有A，则sortedness+1
                    for(int k = j+1; k < numOfChars; k++){
                        if(strings[i].charAt(k) == 'A'){
                            degrees[i]++;
                        }
                    }
                }else if (strings[i].charAt(j) == 'G'){//如果当前字符是G，后面若有A或C，则sortedness+1
                    for(int k = j+1; k < numOfChars; k++){
                        if(strings[i].charAt(k) == 'A'|| strings[i].charAt(k) == 'C'){
                            degrees[i]++;
                        }
                    }
                }else{//若当前字符是T，后面有几个非T的字符，sortedness就加几
                    for(int k = j+1; k < numOfChars; k++){
                        if(strings[i].charAt(k) != 'T'){
                            degrees[i]++;
                        }
                    }
                }
            }
            //System.out.println(degrees[i]);
        }//outer for
        int minIndex = 0;
        for(int i = 0; i < numOfStrings; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j < numOfStrings; j++){
                if(degrees[j] < min){
                    min = degrees[j];
                    minIndex = j;
                }
            }
            System.out.println(strings[minIndex]);
            int tmp = degrees[i];
            degrees[i] = degrees[minIndex];
            degrees[minIndex] = tmp;
            String tmpString = strings[i];
            strings[i] = strings[minIndex];
            strings[minIndex] = tmpString;
        }



    }
}
