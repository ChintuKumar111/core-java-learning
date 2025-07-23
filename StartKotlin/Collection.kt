package StartKotlin

fun main (){
    println(" collection in kotlin ")

    // list

    val list = listOf(1,2,3,4,5)

     for(i in 0 ..list.size-1) {
         println(list.get(i))
         println(" we can also this " + list[i])
     }


    val list2 = mutableListOf("eren yeager" , "tomiyuka sa ")

    list2.add(2, "akaza")
    for( element in list2)
        println(element)

    // set - it does not allow duplicate value

    // example

    val set = setOf("Armin","Mikasa","eren " ,"levi " ,"Mikasa","Armin")

    for(i in set )
        println(i)


    // map we set the data using key and value
    // example

    val map = mapOf<Int, String>(
        1 to "Armin ",
        2 to "Mikasa",
        3 to "Ackerman"
    )

    println(map)

    // new approach

    val map2 = mutableMapOf<Int , String>()
    map2.put(1,"Name")
    map2.put(2,"age")
    map2.put(3,"Class")

    for ( i in map2)
        println(i)


}