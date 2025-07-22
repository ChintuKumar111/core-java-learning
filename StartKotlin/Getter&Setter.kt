package StartKotlin

fun main(){
    println("Getter and Setter ")


    val anime  = Anime("Tanjiro ",17)
    anime.age = -12
   //println(anime.age)


}
class Anime(name:String ,age:Int){

    val name = name
        get(){
            return field.uppercase()
        }
    var age = age
        set(value){
            if(value>0){
                field= value
            }else{

                println("A negative number can't set for age ")
            }
        }


}