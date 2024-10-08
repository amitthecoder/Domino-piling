fun main(){
    val x = readln()
    val numbers = x.split(" ").map { it.toInt() }
    val mn = numbers[0]*numbers[1]
    println(mn/2)
}