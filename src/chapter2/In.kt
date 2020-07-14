package chapter2

fun isLetter(c: Char) = c in 'a'..'z'|| c in 'A'..'Z'
//isLetter()的另一种写法
/*fun isLetter(c: Char)= when(c){
    in 'a'..'z' , in 'A'..'Z' -> true
    else -> false
}*/

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c){
    in '0'..'9' -> "it`s a digit"
    in 'a'..'z', in 'A'..'Z' -> "it`s a letter!"
    else -> "I don`t know..."
}

fun main(){
    println(isLetter('q'))
    println(isNotDigit('X'))
    println(recognize('8'))
    println("Kotlin" in "Java".."Scale")
    println("Kotlin" in setOf("Java","Scale"))
}