package section1.chapter1

fun main() {
    printName3("Elroy Kanye")
}

// let
fun printName(name: String?) {
    val isSingle = name?.let { it.split(" ").size > 1 }
    if (isSingle == true) println("Single names are strange")
}

fun printName2(name: String?) {
    val isSingle = name?.run { this.split(" ").size > 1 }
    if (isSingle == true) println("Multiple names are common")
}

fun printName3(name: String?) {
    name?.also { it.plus(" Vince") }.let {
        if ((it?.split(" ")?.size ?: 0) > 1) {
            println("$it is a nice name")
        }
    }
}