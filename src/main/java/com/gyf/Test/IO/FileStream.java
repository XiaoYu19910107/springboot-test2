package com.gyf.Test.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xiaoyu
 * @date 2021/04/30 09:17:21
 */
//字节流案例
public class FileStream {
    public static void main(String[] args) {

        try {
            //FileInputStream fis = new FileInputStream("d:/Test1/D1.txt");
            FileInputStream fis = new FileInputStream("d:/Test1/1.png");
            FileOutputStream fos = new FileOutputStream("d:/Test2/2.png");
            byte [] by = new byte[1024];
            int len = 0;//每次读取的长度
            while ((len = fis.read(by)) > 0){
                System.out.println("每次读到的长度"+len);
                fos.write(by,0,len);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
