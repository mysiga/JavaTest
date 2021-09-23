package com.mysiga.kotlin.proxy.pattern

/**
 * 装饰模式
 */
abstract class Component {
    abstract fun display()
}

class Window : Component() {
    override fun display() {
        println("window")
    }
}

class TextBox : Component() {
    override fun display() {
        println("textBox")
    }
}

class ListBox : Component() {
    override fun display() {
        println("listBox")
    }
}

open class ComponentDecorator(var component: Component) : Component() {
    override fun display() {
        component.display()
    }
}

class ScrollBarDecorator(component: Component) : ComponentDecorator(component) {

    override fun display() {
        setScrollBar()
        super.display()
    }

    private fun setScrollBar() {
        println("添加滚动")
    }
}

class BlackBorderDecorator(component: Component) : ComponentDecorator(component) {
    override fun display() {
        setBlackBorder()
        super.display()
    }

    private fun setBlackBorder() {
        println("添加黑边框")
    }
}

fun main(args: Array<String>) {
    val window = Window()
    val blackBorderDecorator = BlackBorderDecorator(window)
    blackBorderDecorator.display()
}