package StartKotlin

fun main() {

    println("Checking prime number \n Enter your digit ")

    val input = readln().toInt()

    var  bn :Boolean = true
    for(i in 2..Math.sqrt(input.toDouble()).toInt()){


        if(input<=1)  {println(" $input number is prime")}



        if(input %i==0) {
            bn = false

        }



    }
    if(bn){
        println("$input is prime number")
    }
    else println("not a prime number")


}

