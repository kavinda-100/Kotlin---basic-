fun main(){
    //TODO:This is a lambda function
    val lambda = { a: Int, b: Int -> a + b }
    println(lambda(5, 3))

    //TODO:This is a lambda function
    val lambda2: (Int, Int) -> Int = { a, b -> a + b }
}