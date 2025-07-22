package StartKotlin

fun main(){

    println(" use of Interface")

    val mode = ModeOfPayment()


    mode.paymentMethod()
}

 interface Bill{

    fun paymentMethod()
    fun Upi()
    fun Cash()


}

class ModeOfPayment : Bill{

    init {
        println("printing the init block ......")
    }
    override fun paymentMethod() {
        this.Cash()
        this.Upi()
        println("they have variety of access for payment")
    }

    override fun Cash(){
        println("pay by using cash")

    }

    override fun Upi() {
println("pay by using UPi")    }
}