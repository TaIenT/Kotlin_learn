package chapter3


val String.lastChar: Char
    get() = get(length - 1)


var StringBuilder.lastChar: Char
    get()= get(length -1)
    set(value: Char){
        this.setCharAt(length - 1, value)
    }

fun main(){
    println("\"Kotlin\".lastChar \t"+"Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println("sb \t\t\t\t\t"+sb)

    val string: List<String> = listOf("first", "second", "fourteenth")
    println("string.last() \t\t"+string.last())
    val numbers: Collection<Int> = setOf(1, 14, 2)
    println("numbers.max() \t\t"+numbers.max())
}