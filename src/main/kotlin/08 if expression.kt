/*
Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
*/

fun main() {

    //Example 1
    if (20 > 18) {
        println("20 is greater than 18")
    }

    //Example 2
    val x = 20
    val y = 18

    if (x > y) {
        println("x is greater than y")
    }

    //Example 3
    val number1 = readln().toInt()
    val number2 = readln().toInt()

    val maxNumber: Int

    if (number1 > number2) {
        maxNumber = number1
    } else {
        maxNumber = number2
    }

    println(maxNumber)

    //Example 4
    val time = 22

    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

}