package com.gyf.Test.IO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xiaoyu
 * @date 2021/04/30 10:49:28
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            String path = "d:/test.txt";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while (null != ( line = br.readLine()) ){
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
