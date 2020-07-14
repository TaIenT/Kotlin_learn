package chapter2

import java.lang.Exception


enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,0,0),ORANGE(255,165,0),YELLOW(255,255,0),GREEN(0,255,0),BLUE(0,0,255),INDIGO(75,0,130),VIOLET(238,130,238);

    fun rgb()=(r*256+g)*256+b

}

fun getMnemonic(color: Color) =
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) = when(color){
    Color.RED,Color.ORANGE,Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE,Color.INDIGO,Color.VIOLET -> "cold"
}

fun mix(C1:Color,C2:Color) = when (setOf(C1, C2)) {
    setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW,Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE,Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

fun mixOptimized(C1:Color,C2:Color) =
    when{
        (C1 ==Color.RED && C2 == Color.YELLOW)||(C1 == Color.YELLOW && C2 == Color.RED) -> Color.ORANGE
        (C1 ==Color.YELLOW && C2 == Color.BLUE)||(C1 == Color.BLUE && C2 == Color.YELLOW) -> Color.GREEN
        (C1 ==Color.BLUE && C2 == Color.VIOLET)||(C1 == Color.VIOLET && C2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun main(){
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
    println(mix(Color.BLUE,Color.YELLOW))
    println(mixOptimized(Color.BLUE,Color.YELLOW))

}
