package StartKotlin


fun main(){
    println("Filter")

    val list =listOf(1,2,3,4,5)
    val fLIst = list.filter ( ::isOdd )
    println(fLIst)

    val evenList = list.filter (::isEven)
    println(evenList)
}

fun isOdd(input :Int):Boolean{
    return input%2!=0
}

fun isEven(a:Int) :Boolean{
    return a%2==0
}