fun main() {
    var a: String = "abc"

    var b: String? = "abc"
        b = null

    val lA = a.length
    val lB = b?.length ?: 0

    println(lA)
    println(lB)

 
}