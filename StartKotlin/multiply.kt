package StartKotlin
fun main() {

        println("Enter the number you want it to multiply")
        val input = readLine()?.toInt()
        var need = 1;

        while(need<=10) {

            println("$input X $need  = "+ need*input!!);

            need++
        }
    }

