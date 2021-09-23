package com.mysiga.kotlin.proxy.pattern

import javax.security.sasl.RealmChoiceCallback

abstract class Shape() {
    var x: Int? = 0
    var y: Int? = 0
    var color: String? = null

    constructor(target: Shape?) : this() {
        target?.let {
            x = it.x
            y = it.y
            color = it.color
        }
    }

    abstract fun clone(): Shape

    override fun equals(other: Any?): Boolean {
        if (other !is Shape) {
            return false
        }
        val shape2 = other as Shape
        return shape2.x == x && shape2.y == y && shape2.color == color
    }

    override fun toString(): String {
        return "Shape(x=$x, y=$y, color=$color)"
    }

}

class Circle : Shape {
    var radius: Int? = 0

    constructor() : super() {

    }

    constructor(target: Circle?) : super(target) {
        target?.let {
            radius = it.radius
        }
    }

    override fun clone(): Shape {
        return Circle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Circle || !super.equals(other)) return false
        val shape2 = other as Circle
        return shape2.radius === radius
    }

    override fun toString(): String {
        return "Circle(radius=$radius)"
    }

}

class Rectangle : Shape {
    var width: Int? = 0
    var height: Int? = 0

    constructor() : super() {

    }

    constructor(target: Rectangle) : super(target) {
        target?.let {
            width = target.width
            height = target.height
        }
    }

    override fun clone(): Shape {
        return Rectangle(this)
    }

    override fun equals(object2: Any?): Boolean {
        if (object2 !is Rectangle || !super.equals(object2)) return false
        val shape2 = object2 as Rectangle
        return shape2.width === width && shape2.height === height
    }

    override fun toString(): String {
        return "Rectangle(width=$width, height=$height)"
    }

}

fun main(args: Array<String>) {
    var circle= Circle()
    circle.x=12
    circle.y=122
    circle.color="yellow"
    circle.radius=1222
    var circle1=circle.clone()
    println("circle:${circle.toString()}")
    println("circle1:${circle1.toString()}")
    println("circle==circle1:${circle?.equals(circle1)}")
    println("circle===circle1:${circle.toString()===circle1.toString()}")
}