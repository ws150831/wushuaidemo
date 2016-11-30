package javaprice;

/**
 * Created by Administrator on 2016/11/30/030.
 */
/**
*功能:求1+2!+3!+...+20!的和
 * autour: 武帅
 * date: 2016/11/30/030 15:00 
 * update: 2016/11/30/030
 */

import java.math.BigDecimal;

/**
*功能:求1+2!+3!+...+20!的和
 * autour: 武帅
 * date: 2016/11/30/030 14:43 
 * update: 2016/11/30/030
 */

public class JavaFile5
{
    public static void main(String[] args) {
        BigDecimal result = new BigDecimal(0);
        BigDecimal decimal = new BigDecimal(1);
        for(int i=1;i<=20;i++){
            decimal = decimal.multiply(new BigDecimal(i));
            result = result.add(decimal);
         System.out.println("前"+i+"个"+"阶乘的和:"+result);
        }
        System.out.println("前20个阶乘的总和:"+result);
    }
}
