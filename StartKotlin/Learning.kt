
fun main(){

    println("Learning kotlin basics")

    val arr = arrayOf(1,2,3,4,5)

    for(i in 0 until arr.size){
        if(arr[i]%2==0)
            if (arr[i] % 2 == 0) {
                println("${arr[i]} is even")
            } else {
                println("${arr[i]} is odd")
            }
    }
    for(i in 1..10){
        println("number is $i")
    }


}