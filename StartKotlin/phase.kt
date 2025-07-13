package StartKotlin


fun main(){
    println("This is the start");

    var arr = arrayOf(1,2,3,4)

    var cz =0;

    for(i in 0 until arr.size){

        println(arr[i])
        cz= arr[i]
    }
    for (Item in arr){
        println(Item)
    }


}