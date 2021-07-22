/*

 */

fun main() {

    val v1 = 100
    val r1 = 100 add 50
    println("r1 : $r1")

    val r2 = v1 add 50
    println("r2 : $r2")
}

infix fun Int.add(a1:Int) : Int {
    return this + a1
}