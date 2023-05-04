fun main() {

    //Example 1
    val day = readln().toInt()

    val result = when (day) {
        1 -> "Saturday"
        2 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        5 -> "Wednesday"
        6 -> "Thursday"
        7 -> "Friday"
        else -> "Invalid day."
    }
    println(result)

    //Example 2
    val time = readln().toInt()

    when (time) {
        in 0..12 -> {
            println("Time is $time:00 AM")
        }
        in 13..24 -> {
            println("Time is $time:00 PM")
        }
        else -> {
            println("Wrong!")
        }
    }
}