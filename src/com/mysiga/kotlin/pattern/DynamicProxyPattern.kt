package com.mysiga.kotlin.pattern

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

interface BaseSchool {
    fun getSchoolName(): String
}

class HighSchool : BaseSchool {
    override fun getSchoolName(): String {
        println("High")
        return "High"
    }
}

class SchoolHandler(var baseSchool: BaseSchool) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        return method?.invoke(baseSchool, args)!!
    }
}

fun main(args: Array<String>) {
    val school = HighSchool()
    val handler = SchoolHandler(school)
    val schoolproxy =
        Proxy.newProxyInstance(
            HighSchool::javaClass.javaClass.classLoader,
            HighSchool::javaClass.javaClass.interfaces,
            handler
        ) as? BaseSchool
    schoolproxy?.getSchoolName()
}