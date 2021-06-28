package com.javaStudy.DesignPatterns.Observer;

import java.util.ArrayList;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 观察者模式（Observer Pattern）
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新。
 * 优点：解除耦合，应用于当一个对象的改变需要同时改变其他对象的情况。
 * 缺点：
 * <p/>
 * 结构：
 * Subject类：即主题对象或抽象通知者，由一个抽象类或接口实现，把所有对观察者的引用保存在一个聚集内，有方法可以增加或删除观察者对象，并可以通知聚集内的观察者对象。
 * ConcreteSubject类：具体主题对象或具体通知者。
 * Observer类：即抽象观察者，为所有具体观察者定义一个接口，在得到主题对象的通知时，调用Update()方法更新自己。
 * ConcreteObserver类：具体观察者。
 */
public class ObserverPattern {

    public interface Subject {
        public void addObserver(Observer o);

        public void removeObserver(Observer o);

        public void notifyAllObservers();
    }

    public static class Videos implements Subject {
        private ArrayList<Observer> userList;
        private ArrayList<String> videos;

        public Videos() {
            userList = new ArrayList<Observer>();
            videos = new ArrayList<String>();
        }

        @Override
        public void addObserver(Observer o) {
            userList.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            userList.remove(o);
        }

        @Override
        public void notifyAllObservers() {
            for (Observer o : userList)
                o.update(this);
        }

        public void addVideos(String video) {
            this.videos.add(video);
            notifyAllObservers();
        }

        public ArrayList<String> getVideos() {
            return videos;
        }

        public String toString() {
            return videos.toString();
        }
    }

    public interface Observer {
        public void update(Subject s);
    }

    public static class Users implements Observer {
        private String name;

        public Users(String name) {
            this.name = name;
        }

        @Override
        public void update(Subject s) {
            System.out.println(this.name + ",new videos are updated!");
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        Videos GOT = new Videos();
        GOT.addObserver(new Users("kou"));
        GOT.addObserver(new Users("zhang"));
        GOT.addObserver(new Users("li"));
        GOT.addVideos("Game of Throne");

    }
}
