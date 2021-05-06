package com.gyf.Test.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author xiaoyu
 * @date 2021/04/30 11:28:27
 */
public class ObjectStream {
    public static void main(String[] args) {
        try {
            Student s = new Student("zhangsan",31,'男');
            String path = "d:/test.ser";
            OutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(s);
            oos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
