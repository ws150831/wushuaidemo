package javaprice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2016/11/30/030.
 */
/**
*功能:输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * autour: 武帅
 * date: 2016/11/30/030 14:38 
 * update: 2016/11/30/030
 */

public class JavaFile2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer(br.readLine());
        JudgeElement je = new JudgeElement(sb);

        System.out.println("字母的总数为:" + je.getCharCount());
        System.out.println("数字的总数为:" + je.getNumberCount());
        System.out.println("空格的总数为:" + je.getSpaceCount());
        System.out.println("其它字符的总数为:" + je.getOtherCount());

    }
}
class JudgeElement
{
    StringBuffer sb;
    int charCount = 0;
    int spaceCount = 0;
    int numberCount = 0;
    int otherCount = 0;
    public JudgeElement(StringBuffer sb)
    {
        this.sb = sb;
        for(int i=0;i<sb.length();i++)
        {
            if((sb.charAt(i)>='a' && sb.charAt(i)<='z') || (sb.charAt(i)>='A'&&sb.charAt(i)<='Z'))
            {
                charCount++;
            }
            else if(sb.charAt(i)==' ')
            {
                spaceCount ++;
            }
            else if(sb.charAt(i)>'0'&&sb.charAt(i)<'9')
            {
                numberCount++;
            }
            else
            {
                otherCount++;
            }
        }
    }
    public int getCharCount()
    {
        return charCount;
    }
    public int getSpaceCount()
    {
        return spaceCount;
    }
    public int getNumberCount()
    {
        return numberCount;
    }
    public int getOtherCount()
    {
        return otherCount;
    }
}
