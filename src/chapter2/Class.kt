package chapter2

class Person(val name: String,var isMarried:Boolean)//val为只读属性,var为可写属性

class Rectangle(val height:Int,val width: Int){
    val isSquare: Boolean
    get() {
        return height==width
    }
}

fun main(){
    val person=Person("Bob",true)
    println(person.name)
    println(person.isMarried)
    val rectangle=Rectangle(41,43)
    println(rectangle.isSquare)
}