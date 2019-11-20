## 策略模式(Strategy Pattern)
* 基础
    * 抽象
    * 封装
    * 继承
    * 多态

### 问题
    如何让算法和对象分开来，使得算法可以独立于使用它的客户而变化？
### 解决方案
    策略模式：
        定义算法族，把每一个算法分别封装到具有共同接口的独立的类中，让他们之间可以互相替换，此模式使得算法可独立于使用它的客户而变化。
    策略模式原则 ：
        1.封装变化
        （把容易变化的部分取出进行封装，让其他部分不会受到影响。代码变化引起的不经意后果变少，系统将变得更有弹性）
        2.多用组合，少用继承
        3.针对接口编程，不针对实现编程
        （将会变化的部分放在类中，此类专门提供某行为接口的实现，这样主类就不需要知道行为的实现细节。）
### 适用场景
    1. 多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择具体要执行的行为。
    2. 需要在不同情况下使用一个算法的不同变体，或者策略还可能在未来用其它方式来实现。
    3. 对于分支语句内代码块较复杂时，可以使用策略模式优化，可用于优化质量较差的if else程序。
    4. 对客户隐藏具体策略(算法)的实现细节，彼此完全独立。

### 模式的结构及组成

![](https://upload-images.jianshu.io/upload_images/10460153-63df904c993e1bc9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

    1. Strategy：抽象策略类，定义所支持算法的接口或者抽象类。Context类使用此接口调用ConcreteStrategy实现的算法。
    2. Context：环境类，作为上下文角色，引用策略接口对象，屏蔽了外部模块对策略或方法的直接访问，只能通过Context 提供的方法访问。
    3. ConcreteStrategy：抽象策略类的具体实现(实现Strategy接口)，该类含有具体的算法，并且通常不只一种实现，有多个类。

### 优缺点
###### 优点
    1.很好地诠释了开闭原则，有效地减少了分支语句。
     开闭原则OCP(Open Closed Principle) :即对扩展开放，对修改关闭。
    2.策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码转移到父类里面，从而避免重复的代码。
    3. 策略模式提供了可以替换继承关系的办法。继承可以处理多种算法或行为。如果不是用策略模式，那么使用算法或行为的环境类就可能会有一些子类，每一个子类提供一个不同的算法或行为。但是，这样一来算法或行为的使用者就和算法或行为本身混在一起。决定使用哪一种算法或采取哪一种行为的逻辑就和算法或行为的逻辑混合在一起，从而不可能再独立演化。继承使得动态改变算法或行为变得不可能。

###### 缺点
    1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道所有的算法或行为的情况。
    2. 策略模式造成很多的策略类，每个具体策略类都会产生一个新类。有时候可以通过把依赖于环境的状态保存到客户端里面，而将策略类设计成可共享的，这样策略类实例可以被不同客户端使用。换言之，可以使用享元模式来减少对象的数量。

### 举例：

* 引出鸭子问题
    模拟鸭子游戏，目前所有鸭子都会游泳，现在需要更改代码，使得不同种类的鸭子对某一行为有不同的表现方式：
    飞行 ：flyByWings(), flyByRocket(), flyNo();  
    唱歌 ：singByGaGa(), singByZhiZhi(), singNo();  
* 可能的解决方式及会出现的问题
    1. 设置鸭子超类，其他子类继承这个类。
        (当程序需求变动时，并不是所有的鸭子都正确实现了其特定功能)
    2. 父类添加相应方法，子类进行重写，使得不同鸭子的同一行为具有不同表现。
        (当子类数量剧增时要到对应子类去逐个修改)
    3. 单独使用接口
        (出现重复性代码) 
* 优解
    进行委托,把委托者和被委托者想成has-a（有一个）的关系。
    eg : 鸭子（被委托者）有一个飞行行为（委托者）。Duck本身含有飞行行为的实例，可以调用飞行行为的飞行方法。
### 实现代码：
* flyBehavior和singBehavior作为抽象策略类：

![](https://upload-images.jianshu.io/upload_images/10460153-5b7e9a93d410a2df.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/10460153-cfb65a84a35b4d5b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 抽象策略的具体实现

![](https://upload-images.jianshu.io/upload_images/10460153-9049f83f69456e8c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/10460153-505bcf30d33d2b86.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 环境类

![](https://upload-images.jianshu.io/upload_images/10460153-d094e4381c8459b4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/10460153-36e43de84e62dafb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


