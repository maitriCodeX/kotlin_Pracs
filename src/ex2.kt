open class Product(
    val productName: String,
    val quantity: Int,
    val amountPerQuantity: Int
) {
    constructor(productName: String, amountPerQuantity: Int) : this(
        productName, 20, amountPerQuantity
    )
}

class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Int,
    val cpuName: String,
    val ramSize: Int,
    val hddSize: Int
) : Product(productName, quantity, amountPerQuantity) {

    constructor(
        productName: String,
        quantity: Int,
        amountPerQuantity: Int,
        cpuName: String
    ) : this(productName, quantity, amountPerQuantity, cpuName, 8, 256)

    override fun toString(): String {
        return "Laptop: $productName, CPU: $cpuName, RAM: ${ramSize}GB, HDD: ${hddSize}GB"
    }
}

fun main() {
    val laptops = listOf(
        Laptop("Dell XPS 13", 5, 1299, "Intel Core i7-1260P", 16, 512),
        Laptop("MacBook Pro 14", 3, 1899, "Apple M1 Pro", 16, 512),
        Laptop("Lenovo ThinkPad X1 Carbon", 2, 1499, "Intel Core i7-1260P", 16, 512),
        Laptop("HP Spectre x360 14", 4, 1399, "Intel Core i7-1260P", 16, 512),
        Laptop("Acer Predator Helios 300", 1, 999, "Intel Core i7-12700H", 32, 1024)
    )

    laptops.forEach { println(it) }
}