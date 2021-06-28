package com.javaStudy.DesignPatterns.Decorator;

/**
 * Created by koujx on 2016/5/5.
 * 装饰模式（Decorator）
 * 动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 *
 */
public abstract class GirlDecorator extends Girl {
    public abstract String getDescription();
}
