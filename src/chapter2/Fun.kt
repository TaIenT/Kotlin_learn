package chapter2

fun max(a: Int, b: Int): Int{
    return if(a>b) a else b
}
//fun max(a: Int, b: Int) = if (a > b) a else b
//fun max(a: Int, b: Int): Int = if (a > b) a else b
fun main(){
    println(max(1,2))
}