package alekseytyan.doc.basicsyntax

class Address {
    var name: String = "Some name"
    var street: String = "Some street"
    var state: String? = "some state"


    var myVariable: Int = 1
        get() = field + 1
        private set

    var counter = 3
        set(value) {
            if(value >= 0) field = value
        }

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.name = address.name
        result.street = address.street
        result.state = address.state
        return result
    }
}

fun main() {
    var adress = Address()
    println(adress.state)
}