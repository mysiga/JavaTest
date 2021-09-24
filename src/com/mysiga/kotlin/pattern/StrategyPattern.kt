package com.mysiga.kotlin.pattern

/**
 * 策略模式
 */
interface Discount {
    fun calculate(price: Double?): Double?
}

class StudentDiscount : Discount {
    override fun calculate(price: Double?): Double? {
        return 1.0
    }
}

class VipDiscount : Discount {
    override fun calculate(price: Double?): Double? {
        return 2.0
    }
}

class ChildrenDiscount : Discount {
    override fun calculate(price: Double?): Double? {
        return 3.0
    }
}

class MoveTicket {
    var price: Double? = null
        set(value) {
            println("产品原价:$value")
        }
    var discount: Discount? = null
    fun getPrice1(): Double? {
        return discount?.calculate(price)
    }
}

fun main(args: Array<String>) {
    val vipDiscount = VipDiscount()
    val moveTicket = MoveTicket()
    moveTicket.price = 100.0
    moveTicket.discount = vipDiscount
    println("最后价格：${moveTicket.getPrice1()}")
}