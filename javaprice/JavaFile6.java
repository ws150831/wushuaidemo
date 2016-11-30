package javaprice;

/**
 * Created by Administrator on 2016/11/30/030.
 */

import java.util.Scanner;

/**
*功能:5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * autour: 武帅
 * date: 2016/11/30/030 15:01 
 * update: 2016/11/30/030
 */

public class JavaFile6
{

    static int[] a = new int[5];
    static int[] b = new int[5];
    public static void main(String[] args) {
        boolean is =false;
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();
        if (l > 99999 || l < 10000) {
            System.out.println("输入的数字不是5位数,请重新输入!");
            l = s.nextLong();
        }
        for (int i = 4; i >= 0; i--) {
            a[i] = (int) (l / (long) Math.pow(10, i));
            l =(l % ( long) Math.pow(10, i));
        }
        System.out.println();
        for(int i=0,j=0; i<5; i++, j++) {
            b[j] = a[i];
        }
        for(int i=0,j=4; i<5; i++, j--) {
            if(a[i] != b[j]) {
                is = false;
                break;
            } else {
                is = true;
            }
        }
        if(is == false) {
            System.out.println("不是回文数");
        } else if(is == true) {
            System.out.println("是回文数");
        }
    }

}
