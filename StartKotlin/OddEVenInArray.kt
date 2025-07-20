package StartKotlin

fun main() {
    println("Enter your digits ")

    var space = readLine()?.toInt()

    if (space != null) {
        if (space % 2 == 0)
            println("Number is even") else println("number is odd")

    }
}