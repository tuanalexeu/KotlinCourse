package alekseytyan.doc.idioms

data class Result(val result: Int, val status: Status)

fun function(result: Int, status: Status): Result {
    return Result(result, status)
}

enum class Status {
    KEK, LOL
}




fun main() {
    val (result, status) = function(1, Status.KEK)
    println(result)
    println(status)
}