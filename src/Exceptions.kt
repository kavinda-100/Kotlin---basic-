import java.util.*

fun main(){
    //TODO: get the user input and handle the exception
    val scanner = Scanner(System.`in`)
    println("Enter number:")
    val a = scanner.nextInt()
    println("Enter number:")
    val b = scanner.nextInt()

    try {
        val c = a / b
        println("Result: $c")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
    println("Program ended")
}