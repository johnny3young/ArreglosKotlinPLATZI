fun main() {

    val arrA = intArrayOf(1,100,200,300)
    val listA = arrayListOf<String>("Hola", "Kotlin", "Java")

    val num = arrA.get(1)
    arrA[1] = 500

    println(num)
    println(listA)

    val mutableList = mutableListOf(2,3,4,5,6,7)
    mutableList.add(9)
    mutableList.add(2,10)
    mutableList[0] = 1

    val map = mutableMapOf<String, Int>(Pair("key",30))
    map.put("Key",40)

    val listaNombres = mutableListOf("Johnny", "Negro","Mono", "Stefanny", "Faruth", "Ñetita")
    //listaNombres.swap(0,2)
    println(listaNombres.toString())

    fun <T> MutableList<T>.swap(index1: Int, index2: Int){
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }
}