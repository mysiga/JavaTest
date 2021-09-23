package com.mysiga.kotlin.proxy.pattern

public interface Product{

}
public class ProductA: Product {

}

public class ProductB: Product {

}

public class ProductC: Product {

}

/**
 * 工厂模式，静态工厂模式
 */
public object ProductFactory{
    public fun createProduct(type:String): Product {
        when (type) {
            "A" -> {
                println("ProductA")
                return ProductA()
            }
            "B" ->{
                println("ProductB")
                return ProductB()
            }
            "C" -> {
                println("ProductC")
                return ProductC()
            }
            else -> {
                println("ProductC")
                return ProductC()
            }

        }
    }
}
fun main(args: Array<String>) {
    var product= ProductFactory.createProduct("A")
}