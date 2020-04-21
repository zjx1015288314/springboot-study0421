package com.itzjx;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class TestStatic {
    public static String staticField = "静态变量..父";
    static {
        System.out.println("静态语句块..父");

    }
    public String field = "实例变量..父";
    {
        System.out.println("普通语句块..父");
    }
    public TestStatic() {
        System.out.println("field: " + field);
        System.out.println("构造函数..父");

//        new Throwable()
//                new Error()
//                        new Exception()
//                                new RuntimeException()
//                                                new NullPointerException()
        int[] arr = {1, 2, 3};
        List list = Arrays.asList(arr);
    }

    public static void main(String[] args) {
        new TestStaticChild1();
    }
}


class TestStaticChild1 extends TestStatic{
    public static String staticField = "静态变量..子";
    static {
        System.out.println("静态语句块..子");

    }
    public String field = "实例变量..子";
    {
        System.out.println("普通语句块..子");
    }
    public TestStaticChild1() {
        System.out.println("field: " + field);
        System.out.println("构造函数..子");
    }
}