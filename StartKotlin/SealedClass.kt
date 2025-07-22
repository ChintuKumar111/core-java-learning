package StartKotlin


fun main(){
    println("Sealed class")
    val response1 = success("for acker man")
    val response2 = dishpatched("to your address")

    val response3 = failure(404)
    val response5= error

    getResponse(response5)
    getResponse(response3)
    getResponse(response2)
    getResponse(response1)
}

sealed class Response()

 data class success(val result:String) : Response()
 data class dishpatched(val  result:String) : Response()
  class failure(val result:Int) : Response()
  object error : Response()

fun getResponse( response: Response){
    when(response){

         is success -> println("success full response ${response.result}")
         is dishpatched-> println("oder has been dispatched ${response.result}")
       is  failure -> println("something failure occurred ${response.result}")
       error -> println("error")
        else -> println("nothing happen ")
    }
}