package alekseytyan.doc

open class A {
    open fun foo(i: Int = 10) {
        // do something
    }
}

class B: A() {
    override fun foo(i: Int) {

    }
}


fun double(x: Int): Int {
    return 2 * x;
}

fun read(
    b: Array<Byte>,
    off: Int = 0,
    len: Int = b.size) {
    // TODO
}

fun foo(
    bar: Int = 0,
    baz: Int) {
}

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit) {

}

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCameHumps: Boolean = false,
    wordSeparator: Char = ' ') {
}

fun foo(vararg strings: String) {}

fun printHello(name: String?): Unit {
    if(name != null) {
        println("Hello $name")
    } else {
        println("Hi there!")
    }
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>();
    for (t in ts) {
        result.add(t);
    }
    return result;
}