package StartKotlin

fun main(){
    println("use of abstract keyword ")

    val normalclass = normalClass()

    normalclass.Show()
    normalclass.hide()
    normalclass.simpleConcreteMethod("levi ackerman ")
}

// use abstract keyword for class

abstract  class absShape(){

    // use abstract key word for provide method that can be override in child class with body
    abstract fun Show()

    abstract fun hide()

    fun simpleConcreteMethod(name:String){
        println("concrete method  using name $name")
    }


}
class normalClass :absShape(){

    override fun Show(){
        println("showing")
    }

    override fun hide(){

        println("hiding")

    }
}