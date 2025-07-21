package StartKotlin


fun main(){
    println("acces modifier")

    val obj = BlackBox()

    obj.publicName
    obj.internalName

    val white = WhiteBox()

    white.showingDetails()
    white.internalName


}

open class BlackBox{

    private val privateNumber = 10
    protected val canInherit = "Parent class property "
    public val  publicName = "mark Levi"

    internal val internalName= "Internal value"


}