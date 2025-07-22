package StartKotlin


fun main(){
    println(" using polymorphism")

    var obj : Shape

    obj= Square()
    obj = Circle()
    obj = Rectangle()

    var arr = arrayOf(Square(),Rectangle(),Circle())

    for(i in arr)
        i.draw()




}

open class Shape{
    open fun draw(){
        println(" shape  class using  draw method ")
    }
}

class Circle :Shape(){

    override fun draw(){
        println(" circle class using draw method")
    }
}
class Rectangle :Shape(){
    override fun draw() {
       println("Rectangle Using draw class")
    }

}
class Square :Shape(){

    override fun draw(){
        println("Square using draw method ")
    }
}