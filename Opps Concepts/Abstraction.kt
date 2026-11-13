abstract class Vehicle {
    abstract fun start()
}

class Car : Vehicle() {
    override fun start() {
        println("Car starts")
    }
}

fun main() {
    val c = Car()
    c.start()
}