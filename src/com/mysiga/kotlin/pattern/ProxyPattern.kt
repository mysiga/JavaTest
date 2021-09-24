package com.mysiga.kotlin.pattern

/**
 * 代理模式
 */
interface Subject {
    fun request()
}

class RealSubject : Subject {
    override fun request() {
        println("RealSubject#request")
    }
}

class SubjectProxy(var subject: Subject) : Subject {
    override fun request() {
        subject.request()
    }
}

fun main(args: Array<String>) {
    val realSubject = RealSubject()
    val proxy = SubjectProxy(realSubject)
    proxy.request()
}