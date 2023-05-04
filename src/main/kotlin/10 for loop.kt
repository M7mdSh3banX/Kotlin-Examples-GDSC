fun main() {

    //Example 1
    for (i in 1..10) {
        println(i)
    }

    //Example 2
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
    println(cars.joinToString("\n"))
}