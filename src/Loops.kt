fun main(){

    val input = arrayOf("Hello", "KAVINDA", "kotlin")

    //TODO: for Loop -------------------------------------
    for (element in input){
        println(element)
    }
    //TODO: and get the index and the element while looping
    for((index, element) in input.withIndex()){
        println("Index: $index, Element: $element")
    }
    //TODO: you can get just the index while looping
    for(index in input.indices){
        println("Index: $index")
    }

    //TODO: ForEach Loop -----
    input.forEach { element ->
        println(element)
    }
    input.forEachIndexed { index, element ->
        println("Index: $index, Element: $element")
    }

    //TODO: Map Loop ----
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }
    println(doubledNumbers)
    val upperCaseInput = input.map{ it.uppercase() }
    //TODO: you can use the following code instead of the above code
    input.map{ it.uppercase() }.forEach { println(it) }


    //TODO: While Loop ----------------------------------------------
    var i = 0
    while (i < input.size){
        println(input[i])
        i++
    }

    //TODO: Do While Loop -------------------------------------------
    var j = 0
    do {
        println(input[j])
        j++
    } while (j < input.size)
}