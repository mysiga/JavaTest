package com.mysiga.kotlin.proxy.designmode.build.simple

interface Button {
    fun display()
}

class SpringButton : Button {
    override fun display() {
        println("显示浅绿色按钮。");
    }
}

class SummerButton : Button {
    override fun display() {
        println("显示浅蓝色按钮。");
    }
}

interface TextField {
    fun display()
}

class SpringTextField : TextField {
    override fun display() {
        println("显示浅绿色边框。");
    }
}

class SummerTextField : TextField {
    override fun display() {
        println("显示浅蓝色边框。");
    }
}

interface ComboBox {
    fun display()
}

class SpringComboBox : ComboBox {
    override fun display() {
        println("显示浅绿色组合框。");
    }
}

class SummerComboBox : ComboBox {
    override fun display() {
        println("显示浅蓝色组合框。");
    }
}

interface SkinFactory {
    fun createButton(): Button
    fun createTextField(): TextField
    fun createComboBox(): ComboBox
}

class SpringSkinFactory : SkinFactory {
    override fun createButton(): Button {
        return SpringButton()
    }

    override fun createTextField(): TextField {
        return SpringTextField()
    }

    override fun createComboBox(): ComboBox {
        return SpringComboBox()
    }
}

class SummerSkinFactory : SkinFactory {
    override fun createButton(): Button {
        return SummerButton()
    }

    override fun createTextField(): TextField {
        return SummerTextField()
    }

    override fun createComboBox(): ComboBox {
        return SummerComboBox()
    }
}

fun main(args: Array<String>) {
//    var factory = SpringSkinFactory()
    val factory = SummerSkinFactory()
    val button = factory.createButton()
    val textField = factory.createTextField()
    val comboBox = factory.createComboBox()
    button.display()
    textField.display()
    comboBox.display()
}