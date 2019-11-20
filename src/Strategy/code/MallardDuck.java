package Strategy.code;

import Strategy.code.behavior.Impl.flyNo;
import Strategy.code.behavior.Impl.singByGaGa;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new flyNo();
        singBehavior = new singByGaGa();
    }

    @Override
    public void display() {
        System.out.println("我是一只黄色的橡皮鸭！");
    }
}
