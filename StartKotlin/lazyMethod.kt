package StartKotlin

val bigCalculation: Int by lazy {
    println("Doing heavy calculation...")
    50 * 20  // result = 1000
}

fun main() {
    println("Before using bigCalculation")
    println(bigCalculation)  // First time → does calculation
    println(bigCalculation)  // Next time → just returns cached result
}
