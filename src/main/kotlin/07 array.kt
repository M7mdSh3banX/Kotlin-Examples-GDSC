fun main() {
    //arrayOf()
    val studentsId = arrayOf(100, 200, 300, 400, 500)

    //access the element of an array
    println(studentsId[2])
    println(studentsId.get(2))

    //print the array directly
    println(studentsId)

    //print the values of array using join to string
    println(studentsId.joinToString(" -> "))

    //change an array element
    studentsId[2] = 900
    println(studentsId[2])

    studentsId.set(2, 900)
    println(studentsId[2])

    //array size
    val size = studentsId.size
    println(size)

    //types of array
    val numbers = intArrayOf(10, 20, 30)
    println(numbers[0])

    //multiple values
    val multipleArray = arrayOf(1, 10, 4, "Mohamed", "Shaban", 50.5F)
    println(multipleArray.joinToString(" -> "))

    //first and last element
    println(multipleArray.first())
    println(multipleArray.last())

    //max and min element
    println(studentsId.max())
    println(studentsId.min())

    //sorting array
    val newArray = arrayOf(9, 0, 5, 1, 10, 60, 2)
    val newSortedArray = newArray.sortedArray()
    val newSortedArrayDescending = newArray.sortedArrayDescending()

    println(newSortedArray.joinToString(" -> "))
    println(newSortedArrayDescending.joinToString(" -> "))
}