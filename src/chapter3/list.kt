package chapter3

import java.lang.StringBuilder

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
):String{
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}



fun main(){
    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1,7,53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println("set.javaClass \t"+set.javaClass)
    println("list.javaClass \t"+list.javaClass)
    println("map.javaClass \t"+map.javaClass)
    val string= listOf("first", "second", "fourteenth")
    println("string.last() \t"+string.last())
    val numbers = setOf(1, 14, 2)
    println("numbers.max() \t"+numbers.max())
    val list2= listOf(1, 2, 3)
    println("list2 \t"+list2)

    //函数调用
    val list3 = listOf(1, 2, 3)
    println(joinToString(list3,"; ", "( ", ") "))
    println(joinToString(list3,separator = "; ", postfix = "( ", prefix = ") "))
    println(joinToString(list3,", ", "  ", "  "))//重载
    println(joinToString(list3))
    println(joinToString(list3,"; "))
    println(joinToString(list3, postfix = ";" , prefix = "#"))
}