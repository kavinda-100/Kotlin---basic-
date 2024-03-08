fun main(){
    //TODO: Ranges -------------------------------------
    for(i in 1..5){
        println(i)
    }

    //TODO: you can use the following code instead of the above code
    (1..5).forEach { println(it) }

    //TODO: reverse the range
    for(i in 5 downTo 1){
        println(i)
    }
    //TODO: you can use the following code instead of the above code
    (5 downTo 1).forEach { println(it) }

    //TODO: reverse the range with step
    for(i in 5 downTo 0 step 2){
        println(i)
    }
}