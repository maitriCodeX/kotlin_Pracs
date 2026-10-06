fun main() {
    var a = 10
    var b = 20
    println("Swapping without third variable")
    println("Value of a: $a")
    println("Value of b: $b")
    b = a + b
    a = b - a
    b = b - a
    println("After swapping both elements")
    println("Value of a: $a")
    println("Value of b: $b")
    a = 10
    b = 20
    println("\nSwapping using third variable")
    println("Value of a: $a")
    println("Value of b: $b")
    val c = a
    a = b
    b = c
    println("After swapping both elements")
    println("Value of a: $a")
    println("Value of b: $b")
}