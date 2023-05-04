fun main() {

    outer@ for (i in 1..5) {
        for (j in 1..5) {
            println("$i + $j")
            if (i == 3 && j == 3)
                break@outer
        }
    }
}