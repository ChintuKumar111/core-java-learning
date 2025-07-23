package StartKotlin

fun main(){
    println(" exception handling ")

    var arr = arrayOf(1,2,3,4,5,6)

    // It will give me an error for index out of bound

   // println(arr[6])


    // so I can use try catch for better execution without get crashed

    try{
        println(arr[6])
    }catch (e:Exception)
    {
        println("the error is $e ")

    }
    // finally block we use it will run always no matter  what
    finally {
      println("This is finally block ")
    }
}