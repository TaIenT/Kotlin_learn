package chapter2


fun main(args: Array<String>){
    val name =if(args.size>0) args[0] else "Kotlin"
    println("Hello, $name!")
    println("------------------------分界线1-------------------------")
    if (args.size>0){
        println("Hello, ${args[0]}!")
    }
    println("------------------------分界线2-------------------------")
    println("Hello,${if (args.size > 0) args[0] else "someone"}!")
}