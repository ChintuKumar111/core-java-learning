package StartKotlin

fun main(){
    println("Data class using ")

    val p1 = DataClass(1,"ackerman")
    val p2 = DataClass(1,"ackerman")
    println(p1)
    println(p1==p2)
}

 data class DataClass(val Id : Int ,var name:String){


}