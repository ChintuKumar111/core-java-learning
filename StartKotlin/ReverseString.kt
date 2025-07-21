package StartKotlin


fun main() {

println(" Enter a String to Reverse the string")

    var input = readln().toString()
var ch = '-'

    for(i in input.length-1 downTo  0){

        ch = input.get(i)

        print(ch)

    }

}