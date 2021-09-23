package com.mysiga.kotlin.proxy.pattern

interface ScoreOperation {
    fun sort(array: Array<Int>): Array<Int>
    fun search(array: Array<Int>, key: Int): Int
}

class QuickSort {
    fun quickSort(array: Array<Int>): Array<Int> {
        println("quickSort()")
        sort(array, 0, array.size - 1)
        return array
    }

    fun sort(array: Array<Int>, p: Int, r: Int) {
        println("sort()")
    }

    fun partition(array: Array<Int>, p: Int, r: Int) {
        println("partition()")
    }
}

class BinarySearch {
    fun binarySearch(array: Array<Int>, key: Int): Int {
        println("binarySearch()")
        return -1
    }
}

class OperationAdapter : ScoreOperation {
    lateinit var quickSort: QuickSort
    lateinit var binarySearch: BinarySearch

    constructor() {

    }

    init {
        quickSort = QuickSort()
        binarySearch = BinarySearch()
    }

    override fun sort(array: Array<Int>): Array<Int> {
        return quickSort.quickSort(array)
    }

    override fun search(array: Array<Int>, key: Int): Int {
        return binarySearch.binarySearch(array, key)
    }
}

fun main(args: Array<String>) {
    val operationAdapter = OperationAdapter()
    val array=arrayOf<Int>(1,3,5,345)
    operationAdapter?.sort(array)
    operationAdapter?.search(array,5)
}