import Employee.Employee

fun main(){
    val notNullText = "not null"
    val nullableTextOne: String? = null //TODO: it can be like this " " or null

    //TODO: checkNull(notNullText)
    fun checkNull(text: String?){
        if (text != null){
            println(text)
        } else {
            println("nothing to print :(")
        }
    }

    //TODO: safeCall (like we do in javaScript)
    fun safeCall(text: String?){
        println(text?.length)
    }
    fun checkEmployee(employee: Employee?){
        println(employee?.name)
    }
}