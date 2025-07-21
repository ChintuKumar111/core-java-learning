package StartKotlin

fun main(){
    println("Getter and Setter ")


    val anime  = Anime("Tanjiro ",17)
    anime.age = -12
   //println(anime.age)


}
class Anime ( nameParam:String , ageParam:Int){

    val name = nameParam

        get(){
         return   field.uppercase()
        }
    var age = ageParam
        set(value){
            if(value>0){
                field = value
            }else {
                println("A age cannot be in negative ")
            }
        }
}