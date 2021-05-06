package com.gyf.Test.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xiaoyu
 * @date 2021/04/30 11:05:34
 */
public class DataStreamWriter {
    public static void main(String[] args) {
        try {
            String name = "zhangsan";
            int age = 23;
            char sex = '男';

            String path = "d:/test2.bin";
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeChar(sex);

            dos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
