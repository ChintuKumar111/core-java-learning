package StartKotlin

fun  main(){

    println(" Null Safety")


    // safety check using "?" with data type to check value null or not to handle  this kind of  operation safely
    val name: String? = readlnOrNull()

    // when we perform some action with object we use " ?." for safe call the object
    val address : String ? = null
    println(address?.length)

    // more safe call

    address?.let{
        println(" this block only execute if the object  return some kind of value   $address")
        println("let block running $it")
    }

    // elvis operator in kotlin to provide default value if object hasn't anything to return

 var displayName = name?: "Eren"

    println(displayName)


    if (name != null) {
         displayName = name?.takeIf { it.isNotBlank() } ?: "Eren"
        println(displayName)


    }


    // when we have 100% surety about object will return some value we use "!!" operator for the operation

    var id :Int  ? = null

    println(id?.plus(6))

id  = 5

    println(id!!.plus(5))



}