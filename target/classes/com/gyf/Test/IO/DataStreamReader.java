package com.gyf.Test.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author xiaoyu
 * @date 2021/04/30 11:11:11
 */
public class DataStreamReader {
    public static void main(String[] args) {
        try {
            String path = "d:/test2.bin";
            FileInputStream fr = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fr);

            String name = dis.readUTF();
            int age = dis.readInt();
            char sex = dis.readChar();

            System.out.println(name + "  " + age + "  " + sex + "  ");
            dis.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
