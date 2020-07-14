package chapter2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber1(reader: BufferedReader): Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e:NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e:NumberFormatException){
        return
    }
    println(number)
}

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException){
        null
    }
    println(number)
}

fun main(){
    var reader = BufferedReader(StringReader("239"))
    println(readNumber1(reader))
    println("------------------分界线-------------------")
    reader = BufferedReader(StringReader("not a number"))
    println(readNumber2(reader))
    println("------------------分界线-------------------")
    println(readNumber3(reader))

}