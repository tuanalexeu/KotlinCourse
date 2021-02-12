import alekseytyan.doc.asList
import alekseytyan.doc.double
import alekseytyan.doc.foo
import alekseytyan.doc.reformat

fun main(args: Array<String>) {
    println("Hello World!")
    println(double(2))

    reformat("String", false, upperCaseFirstLetter = false, divideByCameHumps = true,'_')

    foo(*arrayOf("a", "b", "c"))

    val list = asList(1,2,3);
}