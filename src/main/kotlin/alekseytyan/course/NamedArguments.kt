package alekseytyan.course

fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""): String {
    return "OK"
}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")
