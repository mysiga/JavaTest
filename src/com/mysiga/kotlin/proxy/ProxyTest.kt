package com.mysiga.kotlin.proxy

fun main(args: Array<String>) {
//        反射
//        1、反射对象创建
    var helloObject=HelloClass()
    var helloClass=helloObject.javaClass
    println("helloClass1:${helloClass.name}")
    helloClass=HelloClass::class.java
    println("helloClass2:${helloClass.name}")
    helloClass= Class.forName("com.mysiga.kotlin.proxy.HelloClass") as Class<HelloClass>
    println("helloClass3:${helloClass.name}")
//        2、反射获取构造方法
    var hellofields=helloClass.fields

//        3、反射获取成员变量
//        4、反射获取方法
//    var handler=MyInvocationHandler
}