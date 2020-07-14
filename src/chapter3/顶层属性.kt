package chapter3

var opCount = 0
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation(){
    opCount++
    println("1")
}

fun reportOperationCount(){
    println("Operation performed $opCount times")
}

fun String.lastChar():Char = this.get(this.length-1)

fun main(){
    reportOperationCount()
    performOperation()
    reportOperationCount()
    println(UNIX_LINE_SEPARATOR+"1")
    println("Kotlin".lastChar())
}