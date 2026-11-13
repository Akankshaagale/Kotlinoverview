fun main() {

    val students = mutableMapOf(
        1 to "Akanksha",
        2 to "Arya"
    )

    students[3] = "Priya"

    students[2] = "Anjali"

    students.remove(1)

    println(students)

}