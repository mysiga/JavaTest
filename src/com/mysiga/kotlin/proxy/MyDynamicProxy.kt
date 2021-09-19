package com.mysiga.kotlin.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

interface Hello {
    fun sayHello()
}

class HelloImpl :Hello{
    override fun sayHello() {
        TODO("Not yet implemented")
        println("hello world")
    }
}

open class MyInvocationHandler :InvocationHandler{
    var hello:Hello?=null

    constructor(hello: Hello?) {
        this.hello = hello
    }

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        TODO("Not yet implemented")
        return method?.invoke(hello,args)!!
    }
}