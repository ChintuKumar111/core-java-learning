package StartKotlin


fun main(){
    println("enter you input ")

    var input = readln().toInt()

    var sum = 0;
    for(i in 1..input){

        sum = sum+i


    }

    println(" total sum  is  : $sum")
}