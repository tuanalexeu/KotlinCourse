package alekseytyan.doc.idioms

data class Customer(val name: String, val email: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Customer) return false

        if (name != other.name) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + email.hashCode()
        return result
    }

    override fun toString(): String {
        return "Customer(name = $name, email = $email)"
    }
}

fun main() {
    var myCustomer = Customer("Aleksey", "alekseytyan45@gmail.com")
    println(myCustomer)
}