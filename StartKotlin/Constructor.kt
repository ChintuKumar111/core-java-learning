package StartKotlin

fun main(){

    println(" Constructor in  kotlin")

    val sportCar = SportCar("MUSTANG","1.2 LILTRE",4)
   sportCar.startRace()
    sportCar.endRace()
}

class SportCar ( val name:String , val engineCapacity :String ,val wheel :Int){

    ///constructor(name :String ,engineCapacity: String,wheel: Int) : this(name,engineCapacity,5)

init {
    println("${name.lowercase()}")
}




    fun startRace(){

        println("$name car star the race who has $engineCapacity engine with wheel $wheel")
    }

    fun endRace(){

        print("$name win the race ")
    }



}