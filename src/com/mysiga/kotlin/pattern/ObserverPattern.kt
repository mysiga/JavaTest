package com.mysiga.kotlin.pattern

abstract class Subject1 {
    val observers = mutableListOf<Observer>()
    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    abstract fun notify1()
}

class ConcreteSubject : Subject1() {
    override fun notify1() {
        for (item in observers) {
            item.update()
        }
    }
}

interface Observer {
    fun update()
}

class ConcreteObserver : Observer {
    override fun update() {
        println("update")
    }
}

class ConcreteObserver1 : Observer {
    override fun update() {
        println("update1")
    }
}

fun main(args: Array<String>) {
    val subject = ConcreteSubject()
    val concreteObserver = ConcreteObserver()
    val concreteObserver1 = ConcreteObserver1()
    subject.attach(concreteObserver)
    subject.attach(concreteObserver1)
    subject.notify1()
}