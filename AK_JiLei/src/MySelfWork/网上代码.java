package MySelfWork;

/**
 * Created by ${纪雷} on 2018/10/22.
 */
/**
 *Java中字符串中子串的查找共有四种方法(indexof())

 indexOf 方法返回一个整数值，指出 String 对象内子字符串的开始位置。如果没有找到子字符串，则返回-1。
 如果 startindex 是负数，则 startindex 被当作零。如果它比最大的字符位置索引还大，则它被当作最大的可能索引。
 Java中字符串中子串的查找共有四种方法，如下：
 1、int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。
 2、int indexOf(String str, int startIndex)：从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。
 3、int lastIndexOf(String str) ：返回在此字符串中最右边出现的指定子字符串的索引。
 4、int lastIndexOf(String str, int startIndex) ：从指定的索引处开始向后搜索，返回在此字符串中最后一次出现的指定
 */
public class 网上代码 {

        public static void main(String agrs[]){

            String str="this is my original string";
            String toDelete=" original";
            if(str.startsWith(toDelete))
                /**if(a.startsWith(b))
                  判断字符串a 是不是以字符串b开头.
                  if(a.endsWith(b))
                  判断字符串a 是不是以字符串b结尾.
                 */
                str=str.substring(toDelete.length());//截取掉toDelete开头的部分，把剩余的赋给str
            else
            if(str.endsWith(toDelete))//截取掉toDelete结尾的部分，把剩余的赋给str
                str=str.substring(0, str.length()-toDelete.length());
            else
            {
                int index=str.indexOf(toDelete);
                if(index!=-1)
                {
                    String str1=str.substring(0, index);
                    String str2=str.substring(index+toDelete.length());
                    str=str1+str2;
                }
                else
                    System.out.println("string "+toDelete+" not found");
            }
            System.out.println(str);
        }
}
