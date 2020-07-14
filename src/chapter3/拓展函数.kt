package chapter3

open class View{
    open fun click() = println("View clicked")
}
class Button:View(){
    override fun click() = println("BUtton clicked")
}

fun View.showoff() = println("I`m a view!")

fun Button.showOff() = println("I`m a button!")





fun main(){

    val view:View = Button()
    view.click()
    view.showoff()
}

