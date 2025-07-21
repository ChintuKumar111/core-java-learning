package StartKotlin

import kotlin.jvm.internal.Ref.DoubleRef


fun main(){
    println("calling different function by ")

    addition(3,4)

    addition(2.0,3.0)

   println( newAddition(2,3))

    newAddition(2.0,4.0)

    val result = ::printf

    println(result("Ackerman",3))

}
//simple method
     fun addition(num1:Int ,num2:Int){

    val result = num1+num2;

    println(result)

}

// method overloading
fun addition(num1 :Double ,num2 :Double){

    val result = num1 +num2
    println(result)
}


fun newAddition(num1 :Int ,num2:Int):Int {
    return num1+num2


}

fun newAddition(num1 :Double  ,num2:Double)  = num1+num2

fun printf(name:String ,roll_no :Int){
    println("name is $name")
    println("roll no $roll_no")
}