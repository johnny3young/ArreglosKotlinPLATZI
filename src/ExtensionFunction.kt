fun main() {

    "Hola mi nombre es Johnny\n".print()
    println(4.multiply(2))
    //Si le agregamos INFIX a nuestra función entonces podemos escribir de otra manera
    println(4 multiply 5)
}

fun String.print(){
    print(this)
}

infix fun Int.multiply(numM: Int): Int {
    return this * numM
}

