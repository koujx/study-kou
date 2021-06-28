package com.javaStudy.DesignPatterns.Adapter;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 配器模式（Adapter Pattern）
 * 将一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能在一起工作的那些类可以一起工作。
 * 其主要作用是在旧的接口和新的接口之间完成适配，应用于希望复用一些现存的类，但接口又与复用环境要求不一致的情况。
 * <p/>
 * 示例：http://blog.csdn.net/zhangjg_blog/article/details/18735243
 */
public class Adapter {

    //英标充电器接口
    public interface EnPluginInterface {
        void chargeWith3();
    }

    //实现英标接口的充电方法
    public class EnPlugin implements EnPluginInterface {

        @Override
        public void chargeWith3() {
            // TODO Auto-generated method stub
            System.out.println("charge with EnPlugin");
        }
    }

    //在室内充电
    public class Home {
        private EnPluginInterface enPlugin;

        public Home() {
        }

        public Home(EnPluginInterface enPlugin) {
            this.enPlugin = enPlugin;
        }

        public void setPlugin(EnPluginInterface enPlugin) {
            this.enPlugin = enPlugin;
        }

        //充电
        public void charge() {
            enPlugin.chargeWith3();
        }
    }

    //国标充电器接口
    public interface CnPluginInterface {
        public void chargeWith2();
    }

    //实现国标接口的充电方法
    public class CnPlugin implements CnPluginInterface {

        @Override
        public void chargeWith2() {
            // TODO Auto-generated method stub
            System.out.println("charge with cnPlugin");
        }
    }

    //适配器
    public class PluginAdapter implements EnPluginInterface {

        private CnPluginInterface cnPlugin;

        public PluginAdapter(CnPluginInterface cnPlugin) {
            this.cnPlugin = cnPlugin;
        }

        // 这是重点，适配器实现了英标的接口，然后重载英标的充电方法为国标的方法
        @Override
        public void chargeWith3() {
            // TODO Auto-generated method stub
            cnPlugin.chargeWith2();
        }
    }


}
