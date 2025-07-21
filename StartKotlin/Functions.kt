package StartKotlin

import kotlin.time.times

fun main(){
    println(" using function  in the kotlin" )

   val result =   AreaOfCircle(2.0,4.0)
    println(result )

    val newResult = AreaOfCircle(5,6)
    println(newResult)
}

fun AreaOfCircle(num : Double ,num2 :Double) :Double{

    val pi = 3.14
    return  pi*num *num2

}

fun AreaOfCircle(num :Int ,num2 : Int):Int{

    val result= num+num2


    return result




}