package chapter2

import java.util.*

fun main(){
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'Z'){//将字母A~Z所对应的字母和字码放入binaryReps
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps){
        println("$letter = $binary")
    }

    println("-----------------分界线--------------------")

    val list = arrayListOf("10","11","1001")

    for ((index, element) in list.withIndex()){
        println("$index: $element")
    }
}
