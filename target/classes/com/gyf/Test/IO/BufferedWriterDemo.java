package com.gyf.Test.IO;

import java.io.*;

/**
 * @author xiaoyu
 * @date 2021/04/30 10:17:32
 */
//字符流案例 依赖于FileReader和FileWriter的BufferedReader和BufferedWriter有缓冲区效率更高
public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            String path1 = "d:/test.txt";

            //String path2 = "d:/Test2/D2.txt";
            //FileReader fr = new FileReader(path1);
            FileWriter fw = new FileWriter(path1,true);//true表示追加false表示覆盖内容
            //BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("同一个世界");
            bw.newLine();
            bw.write("同一个梦想");

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
