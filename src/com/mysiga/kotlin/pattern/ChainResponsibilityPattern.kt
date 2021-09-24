package com.mysiga.kotlin.pattern

/**
 * 责任链模式
 * @constructor
 */
abstract class Handler() {
    var handlerValue: Handler? = null
    abstract fun handlerRequest()

}

class ConcreteHandlerA() : Handler() {
    override fun handlerRequest() {
        println("ConcreteHandlerA")
        handlerValue?.handlerRequest()
    }
}

class ConcreteHandlerB() : Handler() {
    override fun handlerRequest() {
        println("ConcreteHandlerB")
        handlerValue?.handlerRequest()
    }
}

fun main(args: Array<String>) {
    val handler = ConcreteHandlerA()
    handler.handlerValue=ConcreteHandlerB()
    handler.handlerRequest()
}