package StartKotlin


fun main() {

    val input = 4;


    var name = "cz star"

    if(name== "cz star"){
        println("you are right :")
    }else if(name=="is that you "){
        "not right"
    }else{

        "user not found"
    }

    when (name ){

        "cz star" -> println("you are right")
        "is that you " -> println("not righty")
        else-> println("user not found")
    }
}

