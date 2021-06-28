package com.javaStudy.Generic;

/**
 * Created by 902 on 2016/4/8.
 */
import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> stackContainer = new LinkedList<T>();
    public void push(T t){
        stackContainer.addFirst(t);
    }
    public T pop(){
        return stackContainer.removeLast();
    }

    public boolean isEmpty(){
        return stackContainer.isEmpty();
    }

    public int size(){
        return stackContainer.size();
    }

    public T getIndex(int index){
        return stackContainer.get(index);
    }
    public void put(int index,T t){
        stackContainer.add(index, t);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GenericStack<String> s = new GenericStack<String>();
        System.out.println("No words");
        s.push("kou");
        s.push("jia");
        s.push("xing");
        System.out.println(s.isEmpty());
        while(!s.isEmpty()){
            System.out.println("There is "+s.size()+" words in the stack");
            String subs = s.pop();
            System.out.println(subs);
        }
        System.out.println(s.isEmpty());
    }
}

