package StartKotlin

fun main(){

    println("Learning when statement in kotlin");
    println("Enter your number to check even and odd  or not ")

    val number = readln().toInt();

    when{number%2==0  -> print("$number is even number")

       else -> println("$number is ODD number")
    }

    val result = When()
    println(result)

}

fun When(){

    val input = readln().toInt()

    when(input){

        10 -> println("number is 10")
        20 -> println("number is 20")
        30-> println("number is 30")
        else -> println("not identifying the number")

    }
}