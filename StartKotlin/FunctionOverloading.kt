package StartKotlin

fun main(){

   val ans =  add1(1,2)
    val ans1=  add1(2.0,2.0)

    println(ans)
    println(ans1)


}


fun add1 (x:Int,y:Int):Int{

    val result = x+y;
    return result

}
fun add1(x:Double,y:Double):Double{
    val result = x+y;
    return result

}