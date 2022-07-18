import java.util.Scanner;

fun main() {

    var sc = Scanner(System.`in`)
    var A = sc.nextInt()
    var B = sc.nextInt()
    var gob = A*B
    
    for (i in 0..2){
        println(A*(B%10))
        B = B/10

    }
    print(gob)
    
}