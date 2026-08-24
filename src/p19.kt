fun main() {
    val numbers = ArrayList<Int>()
    println("Enter 5 numbers:")
    for (i in 0..4) {
        print("a[$i]=")
        numbers.add(readLine()!!.toInt())
    }
    var max = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
    }
    println("Largest element = $max")
}