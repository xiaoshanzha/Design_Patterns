package Strategy.code.behavior.Impl;

import Strategy.code.behavior.flyBehavior;

public class flyNo implements flyBehavior {
    @Override
    public void fly() {
        System.out.println("我真的不会飞");
    }
}
