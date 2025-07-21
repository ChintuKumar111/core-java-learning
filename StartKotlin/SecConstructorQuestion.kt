package StartKotlin

fun main(){
    println("Question from you")

    val book1 = Books("Kotlin basics",299.0)


    val book2 = Books("Advanced Kotlin")


    book1.printDetails()
    book2.printDetails()
}

 private class Books(val title :String ,val price:Double){

    constructor(title: String):this(title,399.0)

    init{
        println("Book Initialize : $title - RS $price")
    }

     fun printDetails(){
        println("Title : $title ,Price $price")
    }}