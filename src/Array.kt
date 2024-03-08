fun main(){
    //TODO: creating an array with string
    val input = arrayOf("Hello", "KAVINDA", "kotlin")
    //TODO: creating an array with integer
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    //TODO: accessing the elements of the array
    val start = input[0]

    //TODO: change the value of the array
    input[2] = "Kotlin"

    //TODO: checking whether the given element is exist in the array
    val isExist = input.contains("KAVINDA")
    //TODO: you can use if statement to check whether the given element is exist in the array
    if("Hello" in input) {
        println("Yes, the given element is exist in the array")
    }

    //TODO: length/size of the array
    val size = input.size

    //TODO: loop through the array
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

}

