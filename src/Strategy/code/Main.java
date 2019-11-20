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

        //���ڻ����
        duck.setFlyBehavior(new flyByWings());
        duck.performFly();
        //���ǲ������
        duck.setSingBehavior(new singNo());
        duck.performQuack();
    }
}
