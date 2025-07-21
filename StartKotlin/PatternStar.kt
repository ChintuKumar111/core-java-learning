package StartKotlin

fun main(){

    println("printing the star pattern")

    for(i in 1..5){
        for(j in 1..i){

            print("*")
        }
        println()
    }
}