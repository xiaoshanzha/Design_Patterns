package Strategy.code;

import Strategy.code.behavior.Impl.flyByWings;
import Strategy.code.behavior.Impl.singNo;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();

        //现在会飞了
        duck.setFlyBehavior(new flyByWings());
        duck.performFly();
        //可是不会叫了
        duck.setSingBehavior(new singNo());
        duck.performQuack();
    }
}
