package com.gyf.Test.Reflex;

import java.lang.reflect.*;

/**
 * @author xiaoyu
 * @date 2021/04/19 15:29:43
 */
public class App13_2 {
    public static void main(String[] args) {
        try {
            Class<Person> a = Person.class;
            Constructor con = a.getConstructor(String.class,int.class);
            System.out.println("构造方法名"+con.getName());
            Class [] c = con.getParameterTypes();

            for (int i = 0; i < c.length; i++) {
                System.out.println("构造方法参数类型"+(i+1)+":"+c[i]);
            }
            Field [] d = a.getDeclaredFields();
            for (Field fd : d) {
             int count1 = fd.getModifiers();
                System.out.println("成员变量修饰符" + Modifier.toString(count1));
                System.out.println("成员变量的类型" + fd.getType().getName());
                System.out.println("成员变量的名称" + fd.getName());
            }

            Method[] s = a.getMethods();
            for (Method md : s) {

                System.out.println("方法名"+md.getName());
                System.out.println("方法参数个数"+md.getParameterCount());
                Parameter [] pr = md.getParameters();
                int index = 1;
                for(Parameter pmt : pr){
                    if(pmt.isNamePresent()) {//判断java源文件在编译成class文件时有没有包含方法形参名称
                        System.out.println("第" + (index++) + "个参数的信息");
                        System.out.println("方法参数名"+pmt.getName());
                        System.out.println("方法参数类型"+pmt.getType());
                        System.out.println("方法参数的泛型"+pmt.getParameterizedType());//输出泛型类型
                        /*输出的wait、equals、hashCode等是因为Person类默认继承了Object，而这些方法是Object中的方法，默认Object的.class字节码文件是不
                        包含参数信息的所以没有打印参数信息只打印了方法信息*/

                    }
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
