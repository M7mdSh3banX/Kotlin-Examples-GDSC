fun main() {

    //Example 1
    for (i in 1..10) {
        if (i == 5)
            break
        println(i)
    }

    //Example 2
    for (i in 1..10) {
        if (i == 5)
            continue
        println(i)
    }
}