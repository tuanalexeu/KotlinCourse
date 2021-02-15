package alekseytyan.doc.basicsyntax

open class Shape {
}

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) / 2
}

fun main() {
    var myRectangle = Rectangle(1.2,2.0)
    println(myRectangle.perimeter)
}