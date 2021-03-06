package com.sucq.demo.test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 遍历集合
 * 我们可以调用集合的 public void forEach(Consumer<? super E> action) 方法，通过 lambda 表达式的方式遍历集合中的元素。以下是 Consumer 接口的方法以及遍历集合的操作。Consumer 接口是 jdk 为我们提供的一个函数式接口。
 */
public class Test6 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5);

        //lambda表达式 方法引用
        list.forEach(System.out::println);

        list.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });
    }

}
