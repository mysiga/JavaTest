package com.mysiga.kotlin.pattern

class Computer(builder: Builder) {
    var cpu: String? = null
    var ram: String? = null
    var usbCount: Int? = 0
    var keyboard: String? = null
    var display: String? = null

    init {
        cpu = builder.cpu
        ram = builder.ram
        usbCount = builder.usbCount
        keyboard = builder.keyboard
        display = builder.display
    }

    class Builder {
        var cpu: String? = null
        var ram: String? = null
        var usbCount: Int? = 0
        var keyboard: String? = null
        var display: String? = null

        constructor(cpu: String, ram: String) {
            this.cpu = cpu
            this.ram = ram
        }

        fun setUsbCount(usbCount: Int): Builder {
            this.usbCount = usbCount
            return this
        }

        fun setKeyboard(keyboard: String): Builder {
            this.keyboard = keyboard
            return this
        }

        fun setDisplay(display: String): Builder {
            this.display = display
            return this
        }

        fun builder(): Computer {
            return Computer(this)
        }
    }

    override fun toString(): String {
        return "Computer(cpu=$cpu, ram=$ram, usbCount=$usbCount, keyboard=$keyboard, display=$display)"
    }

}

fun main(args: Array<String>) {
    var computer =
        Computer.Builder("cpu", "ram").setUsbCount(11).setKeyboard("keyboard").setDisplay("display")
            .builder()
    println("builder:${computer.toString()}")
}