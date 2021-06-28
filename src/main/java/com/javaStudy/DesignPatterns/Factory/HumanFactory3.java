package com.javaStudy.DesignPatterns.Factory;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 优点：
 * 1.便于交换产品系列，由于具体工厂类在一个应用中只需要在初始化的时候出现一次，这就使得改变一个应用的具体工厂变得非常容易，它只要改变具体工厂即可使用不同的产品配置。
 * 2.它让具体的创建实例过程与客户端分离，客户端通过抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离，不会出现在客户代码中。
 * <p/>
 * *抽象工厂+反射*
 */
public class HumanFactory3 {

    public interface KitchenFactory {
        Food getFood();

        TableWare getTableWare();
    }

    public interface Food {
        String getFoodName();
    }

    public interface TableWare {
        String getTableWareName();
    }

    public class Apple implements Food {

        @Override
        public String getFoodName() {
            // TODO Auto-generated method stub
            return "apple";
        }

    }

    public class Knife implements TableWare {

        @Override
        public String getTableWareName() {
            // TODO Auto-generated method stub
            return "knife";
        }
    }

    public class Akitchen implements KitchenFactory {

        @Override
        public Food getFood() {
            // TODO Auto-generated method stub
            return new Apple();
        }

        @Override
        public TableWare getTableWare() {
            // TODO Auto-generated method stub
            return new Knife();
        }
    }

    public static void main(String[] args) {
        HumanFactory3 eat = new HumanFactory3();
        KitchenFactory ak = eat.new Akitchen();
        System.out.println(ak.getFood().getFoodName());
        System.out.println(ak.getTableWare().getTableWareName());
    }
}
