package javaprice;

/**
 * Created by Administrator on 2016/11/30/030.
 */
/**
*功能:
 * autour: 武帅
 * date: 2016/11/30/030 16:37
 * update: 2016/11/30/030
 */

public class JavaFile10Two
{
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 5, 7};
        for(int j=0; j<4; j++)System.out.print(a[j] + " ");
        boolean b =false;
        for(int i=11; i<100; i+=2) {
            for(int j=0; j<4; j++) {
                if(i % a[j] == 0) {b = false;
                    break;
                } else{b = true;}
            }
            if(b == true) {System.out.print(i + " \n");}
        }
    }

}
