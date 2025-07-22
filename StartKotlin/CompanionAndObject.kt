package StartKotlin

fun main() {
    println("using companion keyword ")
    println("using Object keyword")
    Project.works.onComplete("Levi Ackerman")

    val project = Project()
    project.OnFailure()

}
class Project {
    companion object works{
        fun onComplete(name:String): Project{
            println("$name has complete his project ")
         return  Project()
        }
    }

    fun OnFailure(){

        println("project is not complete till now ")
    }
}