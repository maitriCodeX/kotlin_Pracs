class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDrive: Int
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInformation() {
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
    }

    fun getOriginalCarPrice() {
        println("Original Car Price: $price")
    }

    fun getCurrentCarPrice() {
        val currentPrice = price - (milesDrive * 10)
        println("Current Car Price: $currentPrice")
    }

    fun displayCarInfo() {
        println("------------")
        getCarInformation()
        getOriginalCarPrice()
        getCurrentCarPrice()
        println("------------")
    }
}

fun main() {
    println("\nCreating Car Class Object car1 in next line")

    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayCarInfo()

    println("\nCreating Car Class Object car2 in next line")

    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayCarInfo()

    println("\n******** ArrayList of Car **************")

    val carList = ArrayList<Car>()

    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    for (car in carList) {
        car.displayCarInfo()
    }
}