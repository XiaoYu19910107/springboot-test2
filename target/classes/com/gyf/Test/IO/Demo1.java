package com.gyf.Test.IO;

import java.io.File;

/**
 * @author xiaoyu
 * @date 2021/04/29 17:41:49
 */
public class Demo1 {

    public static void main(String[] args) {
        String path = "d:/dhc";
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file.mkdirs());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        //System.out.println(file.delete());
    }
}
