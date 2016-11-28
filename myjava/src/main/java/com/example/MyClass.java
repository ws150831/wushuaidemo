package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClass
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("d:" + "\\" + "Test.txt");
        FileInputStream fis = null;
        String s = "";
        try {
            fis = new FileInputStream(f);
            byte [] bt = new byte[1024];
            int n = 0;
            while((n = fis.read(bt)) != -1){
                s = new String(bt, 0, n);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(s);
    }
}
