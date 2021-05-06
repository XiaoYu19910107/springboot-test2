package com.gyf.Test.Reflex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author xiaoyu
 * @date 2021/04/19 17:42:41
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new

            FileOutputStream("D:/Z.txt",false));//工程里面的路径

            oos.writeObject(new Person("java",16));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
