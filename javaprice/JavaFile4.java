package javaprice;

/**
 * Created by Administrator on 2016/11/30/030.
 */
/**
*功能:有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * autour: 武帅
 * date: 2016/11/30/030 14:41 
 * update: 2016/11/30/030
 */

public class JavaFile4
{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        int k=0;
        int t=0;
        for(i=1;i<=4;i++)
            for(j=1;j<=4;j++)
                for(k=1;k<=4;k++)
                    if(i!=j && j!=k && i!=k)
                    {t+=1;
                        System.out.println(i*100+j*10+k);
                    }
        System.out.println ("共有不重复的数:\t"+t);
    }
}
