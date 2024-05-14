import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Calculator {
    fun add(a: Int, b: Int)
    fun subtract(a: Int, b: Int)
    fun multiply(a: Int, b: Int)
    fun divide(a: Int, b: Int)
}

open class PiCalculator {
  open fun piCalculator(a: Int){
        println(3.1416 * a)
    }
}


class BasicCalculator() : PiCalculator(), Calculator {
    override fun add(a: Int, b: Int) {
        val result = a + b

        println("add is $result")
    }

    override fun subtract(a: Int, b: Int) {
        val result = a - b

        println("subtract is $result")
    }

    override fun multiply(a: Int, b: Int) {
        val result = a * b

        println("multiply is $result")
    }

    override fun divide(a: Int, b: Int) {
        if (b != 0) {
            val divide = a / b

            println("divide is $divide")
        } else {
            println("Cannot divide by 0")

        }
    }

    override fun piCalculator(a: Int) {

        println("piCalculator is  ${3.1416 * a}")

    }
    private fun result(message: String) {
        println(message)
    }
}


fun main() {

    val scanner = Scanner(System.`in`)

    println("Enter the first operand:")
    val operatorOne = scanner.nextInt()

    println("Enter the second operand:")
    val operatorTwo = scanner.nextInt()

    val basicCalculator = BasicCalculator()

    basicCalculator.subtract(operatorOne, operatorTwo)

    basicCalculator.add(operatorOne, operatorTwo)


    basicCalculator.multiply(operatorOne, operatorTwo)


    basicCalculator.divide(operatorOne, operatorTwo)
    basicCalculator.piCalculator(operatorTwo)


}
