package StartKotlin


fun main(){
    println("Printing the even number between 1 to 100")

    for(i in 1..100){

        if(i%2==0){
            println("even nuber are $i")
        }else{
            continue
        }
    }
}