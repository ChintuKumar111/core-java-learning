package StartKotlin

fun main(){

    println("Learning when statement in kotlin");
    println("Enter your number to check prime or not ")

    val number = readln().toInt();

    when{number%2==0  -> print("$number is even number")

       else -> println("$number is ODD number")
    }


}