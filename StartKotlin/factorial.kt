package StartKotlin

fun main(){

    println("printing thr valur factorial Enter your digit")
    var  fact = 1

    var input = readln().toInt()

    for(i in 1..input){
        fact*=i
        print(" $i X")
    }
    println(" = Factorial of the number $fact")
}