/**
 * Created by Administrator on 2016/11/28/028.
 */
/**
*功能:实现递归的简单应用
 * autour: 武帅
 * date: 2016/11/28/028 14:16 
 * update: 2016/11/28/028
 */

public class Jaaaa
{
    //5的阶乘
    static void count(int n)               //递归方法
    {
        if (n<5)
            count(n+1);
        System.out.print("     "+n);


    }


    static int multiply(int n){
        if(n==1||n==0)
            return n;
        else
            return n*multiply(n-1);
    }

    //Fibonacci数列--斐波那契数列
    public static int f(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }else
        {
            return f(n-1)+f(n-2);
        }
    }

    public static void main(String[] args){

        count(1);
       System.out.println();
        System.out.println(multiply(10));

        System.out.println(f(5));
    }
}
