package alekseytyan.doc.highOrderFunctions

class ExampleFunctionsList {

}


fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (arr: R, nextElement: T) -> R): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

