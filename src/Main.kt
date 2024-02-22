fun main() {
    //  getting the input from the user
    var start = "Hello"
    var middle = "KAVINDA"
    var end = "kotlin"

    //  checking whether the input is in uppercase
    start = checkWhetherUpperCase(start)
    middle = checkWhetherUpperCase(middle)
    end = checkWhetherUpperCase(end)

    //  making the first letter of the input to uppercase
    start = firstLetterUpperCase(start)
    middle = firstLetterUpperCase(middle)
    end = firstLetterUpperCase(end)

    //  calling the greet function and print the output
    greet(start, middle, end)
}

fun greet(start: String, middle: String, end: String) {
    val greetText = "Welcome To"
    println("$start, $middle, $greetText $end")
}

fun checkWhetherUpperCase(text: String): String {
    if(text == text.uppercase()){
        return text.lowercase()
    }
    return text
}

fun firstLetterUpperCase(name: String): String{
    return name.replaceFirstChar { it.uppercase() }
}
