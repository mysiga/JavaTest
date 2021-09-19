package com.mysiga.kotlin.proxy.designmode.build.simple

/**
 * 饿汉试
 */
object SingletonHungry {

}

/**
 * 静态内部类
 */
class SingletonInner private constructor(){
    private object ViewHolder{
        val holder=SingletonInner()
    }
    companion object{
        val instance=ViewHolder.holder
    }
}
/**
 * 双检锁
 */
class SingletonLock private constructor(){
    companion object {
        val instance by lazy(mode =LazyThreadSafetyMode.SYNCHRONIZED){
            SingletonLock()
        }
    }
}


fun main(args: Array<String>) {
//    val singletonHungry=SingletonHungry.
    val singletonInner = SingletonInner.instance
    val singletonLock = SingletonLock.instance


}