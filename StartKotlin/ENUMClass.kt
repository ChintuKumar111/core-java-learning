package StartKotlin

fun main(){
    println("enum class use case")

    // how we use  enum class

    // by use object

    println(PizzaSize.MEDIUM)

    // or we  can use when method to provide information to the user like ......

    val gettingSize = PizzaSize.MEDIUM

    println("${getSize(gettingSize)}")


}

enum class PizzaSize{

    SMALL,
    MEDIUM,
    LARGE

    // all those instances are same type and  with same datatype  small :String and so on
}

// creating a  function to provide info to the user

fun getSize(size:PizzaSize) :String{
 return when(size){


        PizzaSize.SMALL -> " you are odering $size size pizaa"
        PizzaSize.MEDIUM -> "you are odering  $size size pizza"
        PizzaSize.LARGE -> "you are odering $size size pizza"
    }
}