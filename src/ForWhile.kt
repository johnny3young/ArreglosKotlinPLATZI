fun main() {
    val listaNumeros = intArrayOf(1,2,3,4,5,6,7,8)

    for (i in listaNumeros.indices)
        println(listaNumeros[i])

    val frutas = listOf("Manzanas", "Pera", "Banano", "Piña")

    for (l in listOf(frutas.toString()))
        println(listOf(l))

    for (y in frutas){
        println(y)
    }

    var x = 3
    while (x>0){
        x--
        println(x)
    }

    var sum: Int = 0
    var input:String = ""

    do {
        println("Ingrese un número")
        input = readLine().toString()
        sum += input?.toInt() ?:0
    }while (input != "0")
    println("La suma es $sum")


}

