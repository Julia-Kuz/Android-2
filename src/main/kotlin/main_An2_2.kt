import kotlin.concurrent.thread

fun main() {
    val t1 = thread { println("${Thread.currentThread().name}: thread-1") }
    val t2 = thread { println("${Thread.currentThread().name}: thread-2") }
    val t3 = thread { println("${Thread.currentThread().name}: thread-3") }
    println("${Thread.currentThread().name}: main")
}