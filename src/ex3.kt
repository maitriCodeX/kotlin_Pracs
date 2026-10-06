open class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {

    constructor(firstName: String, lastName: String) : this(
        firstName,
        lastName,
        18
    )
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    var enrollmentNo: String,
    var branch: String,
    var className: String,
    var labBatch: String
) : Person(firstName, lastName, age) {

    constructor(firstName: String, lastName: String) : this(
        firstName,
        lastName,
        18,
        "Not Assigned",
        "Not Assigned",
        "Not Assigned",
        "Not Assigned"
    )

    override fun toString(): String {
        return "Name: $firstName $lastName, Age: $age, Enrollment No: $enrollmentNo, Branch: $branch, Class: $className, Batch: $labBatch"
    }
}

fun main() {

    val students = listOf(
        Student("Xyz", "Abc", 21, "EN001", "Computer Engineering", "I", "1"),
        Student("Bob", "Johnson", 21, "EN002", "Electrical Engineering", "B", "2"),
        Student("Charlie", "Brown", 19, "EN003", "Mechanical Engineering", "B", "1"),
        Student("David", "Lee", 22, "EN004", "Civil Engineering", "A", "3"),
        Student("Emily", "Davis", 20, "EN005", "Information Technology", "C", "4")
    )

    students.forEach {
        println(it)
    }
}