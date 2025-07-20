package StartKotlin

fun main(){
    println("Array in kotlin ")

    var arr = arrayOf(1,2,3)

    var a = arrayOf<Int>(4,5,6)

    for((i,e) in arr.withIndex()){





        println(i.toString() + e)
        println()



    }

    for(value   in 0 until a.size ){
        println(value)
    }

    arr.set(0,10)
    println(arr[0])

  println( arr.get(0))


}