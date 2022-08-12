import java.util.*

fun elementInStrings(scan: Scanner, n: Int) {
    val strings: MutableList<String> = mutableListOf()
    for (i in 0..n) {
        strings.add(i, scan.nextLine())
    }
    for (i in 0..n) {
        if (strings[i].contains("B", true) or strings[i].contains("M", true))
            strings[i] = strings[i]+ " Changed to => "+ strings[i].uppercase()
    }
    for (i in 0..n)
        println(strings[i])
}
fun main() {
    println("Enter array size: ")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    println("Enter Array elements: ")
    elementInStrings(scan, n)
}