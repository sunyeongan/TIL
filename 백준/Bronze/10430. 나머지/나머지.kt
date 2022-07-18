import java.util.Scanner;

fun main() {

    var sc = Scanner(System.`in`)

    var A = sc.nextInt()
    var B = sc.nextInt()
    var C = sc.nextInt()

    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println( ((A%C) * (B%C))%C)
}