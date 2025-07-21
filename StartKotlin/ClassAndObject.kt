package StartKotlin

fun main(){

    println("class and object in kotlin")

    val mustang = Car("mustang","black",1222)
    val audi = Car("audi","white",1414)
    val mercedes = Car("mercedes","matt black",2546)
    val bmw = Car("bmw m5","matt blue",6565)
    val porche = Car("porche","yellow",546)

    println(mustang.name)
    println(porche.showDetails())
}

class Car(val name :String , val color :String ,val kmRan :Int){

    fun showDetails(){
        println("showing details of cars $name")
    }

    fun  driving(){

        println("$ name car is driving")
    }

    fun aplliedBrakes(){

        print("applied brakes in car ")
    }
}