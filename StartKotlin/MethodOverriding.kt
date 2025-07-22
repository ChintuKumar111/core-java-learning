package StartKotlin

fun  main(){

    println("method overriding")

    val child = Child()

   val result =   child.Calc(5,5)
    println(result)
}

open class MethodOverriding{

    var numer1 :Int = 0
    var number2 :Int =0

     open fun Calc(number1:Int , number2:Int) :Int{
         return number1+number2
     }
}

class Child:MethodOverriding(){

     override fun Calc(number1: Int,number2:Int) :Int {
          val result = super.Calc(number1, number2)
         println(result)
        return  number2*number1

    }
}