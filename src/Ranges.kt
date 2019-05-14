fun main() {

    for (i in 1..4)
        println(i)

    print("************************\n")

    for (i in 4 downTo 1)
        println(i)

    print("************************\n")

    for (i in 1..10 step 2)
        println(i)

    print("************************\n")

    for (i in 10 downTo 1 step 2)
        println(i)

    print("************************\n")

    for (i in 1 until 10)
        println(i)

    print("************************\n")

    val esOnce = (1..12 step 2).last == 11
    println(true)


}   