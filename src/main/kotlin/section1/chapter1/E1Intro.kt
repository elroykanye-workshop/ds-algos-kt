package section1.chapter1

fun main() {
    intBox()
}

// Variables and data types
val name = "ELroy Kanye" // constant
var country  = "Cameroon" // variable
var age: Int = 21


// optionals and null safety
var job: String? = null // optional type


// conditionals
fun makeMax(a: Int, b: Int) {
    var max = -1
    max = if (a > b) a else b
    /* original if
    if (a > b) {
        max = a
    } else {
        max = b
    }
     */
    println(max)
}

fun groupSizeCond(groupSize: Int) {
    when (groupSize) {
        1 -> println("Single")
        2 -> println("Pair")
        3 -> {
            // could be a block
            println("Trio")
        }
        else -> println("This is either a nobody or a big crowd")
    }
}


// loops
fun printThree() {
    for (i in 1..3) {
        println(i)
    }
    var x = 6
    while (x > 3) {
        println(x)
        x--
    }
    var y = 9
    do {
        println(y)
        y--
    } while (y > 6)

}


// functions
/*
Pretty much been writing functions already
 */
class Box<T> {
    var content: T? = null
    fun put(content: T?) {this.content = content }
    fun retrieve(): T? {return content}
    fun isEmpty(): Boolean = content == null
}
fun intBox() {
    val box = Box<Int>()
    box.put(4)
    val boolBox = Box<Boolean>()
    boolBox.put(true)
    println(boolBox.isEmpty())
}