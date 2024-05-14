import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Calculator {
    fun add(a: Int, b: Int): Int
    fun subtract(a: Int, b: Int): Int
    fun multiply(a: Int, b: Int): Int
    fun divide(a: Int, b: Int): Int
}

class BasicCalculator : Calculator{
    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun divide(a: Int, b: Int): Int {
        if (b != 0) {
            return a / b
        } else {
            throw ArithmeticException("Cannot divide by 0")
        }
    }


}


fun main() {

    val scanner = Scanner(System.`in`)
    val operatorOne = scanner.nextInt()
    val operatorTwo = scanner.nextInt()



}
