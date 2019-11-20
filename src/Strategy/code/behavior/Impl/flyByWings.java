package Strategy.code.behavior.Impl;

import Strategy.code.behavior.flyBehavior;

/*
* 飞行行为实现类
* */
public class flyByWings implements flyBehavior {
    @Override
    public void fly() {
        System.out.println("哈哈，飞飞飞");
    }
}
