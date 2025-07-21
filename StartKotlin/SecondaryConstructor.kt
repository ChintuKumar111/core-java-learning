package StartKotlin

fun main(){
    println("Secondary constructor")

val game = Game("cricket")
    game.startPlaying()
    val game2 = Game("football", 12)
    game2.startPlaying()


}


class Game(val name :String ,val players :Int){

    constructor(name:String) :this (name,11)

    init{

        println(" init block in secondary constructor")
    }

    fun startPlaying(){
        println("playing start $name with $players players")
    }
}