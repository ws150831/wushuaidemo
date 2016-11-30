package javaprice;

/**
 * Created by Administrator on 2016/11/30/030.
 */
/**
*功能:计算字符串中子串出现的次数
 * autour: 武帅
 * date: 2016/11/30/030 16:27 
 * update: 2016/11/30/030
 */

public class JavaFile8
{
    public static void main(String[] args)
    {
        String s1 = "abcwabcerabctyabcuiabcabc";
        String s2 = "abc";
        int count = getCount(s1,s2);
        int count2 = getCount2(s1,s2);
        System.out.println("count = "+count);
        System.out.println("count2 = "+count2);

    }

    /*第一种方法
    获取abc字符串在整个字符串中出现的次数。
    "wabcerabctyabcuiabcabcqq"
    */
    public static int getCount(String str,String sub)
    {
        int index = 0;
        int count = 0;
        while((index = str.indexOf(sub,index))!=-1)
        {

            index = index + sub.length();
            count++;
        }
        return count;
    }

    /*第二种方法*/
    public static int getCount2(String str,String sub)
    {
        int index = 0;
        int count = 0;

        while((index=str.indexOf(sub))!=-1)
        {
            str = str.substring(index+sub.length());
            count++;
        }
        return count;
    }
}
