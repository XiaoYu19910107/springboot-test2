package com.gyf.Test.Reflex;

/**
 * @author xiaoyu
 * @date 2021/04/08 15:20:33
 */
public class test1 {
    public static void main(String[] args) {
        Class aClass = null;
        try {
            aClass = Class.forName("com.gyf.Test.Reflex.test3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print("?"+aClass.isInstance(new test2()));
        /*String a = "java.lang.String";
        //Class b = a.getClass();
        try {
            Class b = Class.forName(a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        /*test2 test = new test2();
        Class c4 = test.getClass();
        Constructor [] constructors ;
        Constructor constructor;
        constructors = c4.getDeclaredConstructors();
        Field field = null;

        try {

            //调用构造方法
            Class[] p = {String.class};
            constructor = c4.getDeclaredConstructor(p);
            constructor.setAccessible(true);
            Object o = constructor.newInstance("HuangLinqing");

            //调用类的私有方法
            Class[] p4 = {String.class};
            Method method = c4.getDeclaredMethod("welcome",p4);
            method.setAccessible(true);
            Object arg1s[] = {"欢迎关注代码男人技术公众号"};
            method.invoke(test,arg1s);

            //获取类的私有字段并修改值
            field = c4.getDeclaredField("name");
            field.setAccessible(true);
            field.set(o,"代码男人");//我们修改了name的值只对当前的实例对象有效。
            System.out.println(field.get(o).toString());

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/

        /*Class c1 = Boolean.TYPE;
        Class c2 = Byte.TYPE;
        Class c3 = Float.TYPE;
        Class c4 = Double.TYPE;
        System.out.println(c1);*/
       /*String a = "java.lang.String";
       Class b = null;
        try {
            b = Class.forName(a);
            System.out.println(b.getName());
            System.out.println(b.getSuperclass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
       /* String a = "sss";
        Class b = a.getClass();
        System.out.println(b.getName());*/

    }


}
