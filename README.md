# JavaTest
learn java code 
## 23种设计模式中的常用的15种
- 创建型模式6种
    - 简单工厂模式 [StaticFactory](/src/com/mysiga/learn/factory/statics/StaticFactory.java)
    - 工厂方法模式 [EP8Factory](/src/com/mysiga/learn/factory/method/EP8Factory.java)[EP9Factory](/src/com/mysiga/learn/factory/method/EP9Factory.java)
    - 抽象工厂模式 [GameTest](/src/com/mysiga/learn/factory/abstracts/GameTest.java)
    - 单例模式 [SingleTest](/src/com/mysiga/learn/single/SingleTest.java)
    - 原型模式 [Client](/src/com/mysiga/learn/archetype/Client.java)
    - 建造者模式 [BuilderTest](/src/com/mysiga/learn/builder/BuilderTest.java)
- 结构型模式中4种
    - 适配器模式
    - 组合模式
    - 外观模式
    - 代理模式 [ProxyTest](/src/com/mysiga/learn/proxy/ProxyTest.java)
- 行为型模式中5种
    - 命令模式:一种使用频率非常高的设计模式，它可以将请求者和接受者解耦。
        - 使用场景：
            - 系统需要将请求调用者和接受者解耦，使得调用者和接受者不直接交互。请求调用者无须知道接受者的存在，
            也无须知道接受者是谁，接受者也无须关心何时被调用。
            - 系统需要在不同的时间指定请求、将请求排队和执行请求
            - 系统需要支持命令的撤销操作和恢复操作
            - 系统需要将一组操作组合在一起形成宏命令
    - 迭代器模式 [IteratorTest](/src/com/mysiga/learn/iterator/IteratorTest.java)
    - 观察者模式 [ObserverTest](/src/com/mysiga/learn/observe/ObserverTest.java)
    - 策略模式 [StrategyTest](/src/com/mysiga/learn/strategy/StrategyTest.java)
    - 模板方法模式 [TemplateText](/src/com/mysiga/learn/template/TemplateText.java)
