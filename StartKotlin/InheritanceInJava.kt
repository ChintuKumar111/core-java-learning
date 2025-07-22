package StartKotlin


fun  main(){

    println(" Inhertance in kotlin")

    // creating objects for  use the properties by  child single object

    val phone = SmartPhone()

    phone.specs(1001,"128gb  rom ")






}

open class Mobile{

    var name :String  = ""
    var ram :Int= 0

    init{
        println("This is the Mobile class ")
    }

    fun specs(name:String, ram:Int){



        this.ram= ram
        this.name = name
        println(" ram is $ram and name of device is $name")



    }

    fun phoneDetails(){

        println("printing  the phone Details")
    }
}
class SmartPhone: Mobile() {


    var model : Int = 0
    var storage :String =""

    init {
        println("This is the smartPhone class $storage ")
    }


    fun specs(model:Int,storage:String){
        this.model=model
        this.storage= storage
        super.specs("Realme phone",12)

        println(" Model is $model and storage capcity is $storage")
    }

}