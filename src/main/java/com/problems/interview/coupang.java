package com.problems.interview;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * @Author: koujiaxing
 * @Date: 2021/6/28 下午4:39
 */
public class coupang {


    private static Object lock = new Object();
    private volatile static int p = 0;
    private volatile static int flag = 0;

    public static void main(String[] args) {
        List<Integer> numberList = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
        List<String> letterList = Lists.newArrayList("a","b","c","d","e");

        func(numberList, letterList);
    }

    public static void func(List<Integer> numberList, List<String> letterList) {
        if (CollectionUtils.isEmpty(numberList) || CollectionUtils.isEmpty(letterList)) {
            System.out.println("list is null,try again");
            return;
        }
        if (numberList.size() != letterList.size() * 2) {
            System.out.println("list size is invaliad,try again");
            return;
        }
        new Thread(() -> printNum(numberList)).start();
        new Thread(() -> printLetter(letterList)).start();

    }

    public static void printNum(List<Integer> list) {
        while (p < list.size() / 2) {
            synchronized (lock) {
                try {
                    if (flag == 0) {
                        System.out.print(list.get(2 * p) + " " + list.get(2 * p + 1) + " ");
                        flag = 1;
                    } else {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.notify();
                }
            }
        }
    }

    public static void printLetter(List<String> list) {
        while (p < list.size()) {
            synchronized (lock) {
                try {
                    if (flag == 1) {
                        System.out.print(list.get(p) + " ");
                        flag = 0;
                        p++;
                    } else {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.notify();
                }
            }
        }
    }

    public static void func2(List<Integer> numberList, List<String> letterList) throws InterruptedException {
        if (CollectionUtils.isEmpty(numberList) || CollectionUtils.isEmpty(letterList)) {
            System.out.println("list is null,try again");
            return;
        }
        if (numberList.size() != letterList.size() * 2) {
            System.out.println("list size is invaliad,try again");
            return;
        }

        while (p < letterList.size()) {
            Thread thread = new Thread(() -> {
                System.out.print(numberList.get(2 * p) + " " + numberList.get(2 * p + 1) + " ");
            });
            thread.start();
            thread.join();
            System.out.print(letterList.get(p) + " ");
            p++;
        }
    }

    public static void func3(List<Integer> numberList, List<String> letterList) throws InterruptedException {
        if (CollectionUtils.isEmpty(numberList) || CollectionUtils.isEmpty(letterList)) {
            System.out.println("list is null,try again");
            return;
        }
        if (numberList.size() != letterList.size() * 2) {
            System.out.println("list size is invaliad,try again");
            return;
        }

        Thread thread = new Thread(() -> {
            System.out.print(numberList.get(2 * p) + " " + numberList.get(2 * p + 1) + " ");
        });
        while (p < letterList.size()) {
            thread.resume();
            thread.start();
            thread.join();
            System.out.print(letterList.get(p) + " ");
            p++;
            thread.suspend();
        }
    }
}
