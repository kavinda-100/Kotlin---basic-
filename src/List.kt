fun main(){
    //TODO: immutable list
    val immutableList = listOf(1, 2, 3, 4, 5)

    //TODO: Create a list of 5 elements
    val list = mutableListOf(1, 2, 3, 4, 5)

    //TODO: Print the list
    for(i in list){
        println(i)
    }

    list.add(6) //TODO: add an element to the list
    list.addAll(list.size -1 , immutableList) //TODO: add a list to the list
    list.remove(3) //TODO: remove an element from the list
    list.size //TODO: get the size of the list
    list.set(1, 2) //TODO: change the value of an element in the list
    list.removeIf { it == 2 } //TODO: remove an element if it meets a condition
}