open class Animal {
    fun eat() {
        println("Animal is eating")
    }
}

class Dog : Animal() {
    fun bark() {
        println("Dog is barking")
    }
}

fun main() {
    val d = Dog()
    d.eat()
    d.bark()
}