fun main() {
        val  a = esMayor(6)
    defineTipo(10)
}

fun esMayor(data:Int): Boolean{
    if (data>0){
        println("$data es mayor que cero")
        return true
    }else {
        println("$data no es mayor que cero")
        return false
    }
}

fun defineTipo (data: Any) {
    if (data is String) {
        print (data.length)
    }else if (data is Int) {
        print("${data * 2}")
    }//else if (data is persona)
    //  print(data.name)
}