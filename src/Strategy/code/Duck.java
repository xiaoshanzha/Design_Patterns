package Strategy.code;
import Strategy.code.behavior.flyBehavior;
import Strategy.code.behavior.singBehavior;

public abstract class Duck {
    flyBehavior flyBehavior;
    singBehavior singBehavior;
    /**
     * ���
     */
    public abstract void display();
    /**
     * ��Ӿ
     */
    public void swim() {
        System.out.println("����......");
    }
    /**
     * ����
     */
    public void performFly() {
        //���������С��ί�и���Ϊ��
        if (flyBehavior != null)
            flyBehavior.fly();
    }
    /**
     * ����
     */
    public void performQuack() {
        //���������С��ί�и���Ϊ��
        if (singBehavior != null)
            singBehavior.sing();
    }
    /**
    * ����Ѽ�ӷ��е���Ϊ
    * */
    public void setFlyBehavior(flyBehavior flyB) {
        this.flyBehavior = flyB;
    }
    /**
    * ����Ѽ�ӳ�����Ϊ
    * */
    public void setSingBehavior(singBehavior singB) {
        this.singBehavior = singB;
    }
}
