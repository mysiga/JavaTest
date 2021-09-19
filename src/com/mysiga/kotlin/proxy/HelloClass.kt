package com.mysiga.kotlin.proxy


class HelloClass {
    val name:String?=null
    val year:Int?=123
    override fun toString(): String {
        return "HelloClass(name=$name, year=$year)"
    }

    fun addName(name:String, year:Int){
        println("name:$name ,year:$year")
    }

}