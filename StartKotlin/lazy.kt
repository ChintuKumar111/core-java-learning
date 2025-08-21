package StartKotlin

val greeting: String by lazy {
    println("Running block...")
    "Hello World"
}

fun main() {
    println("Program started")
    println(greeting)
    println(greeting)
}
