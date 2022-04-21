package _7_classes

// Write your code here

class Calculator(val name: String) {
  init {
    println("The owner of the calculator is named $name.")
  }

  val add = { operand1: Int, operand2: Int -> operand1 + operand2 }

  val subtract = { operand1: Int, operand2: Int -> operand1 - operand2 }

  val multiply = { operand1: Int, operand2: Int -> operand1 * operand2 }

  fun divide(operand1: Int, operand2: Int): Any {
    return if (operand2 == 0) "operand2 is 0. Cannot divide by 0."
    else operand1 / operand2
  }

  fun power(param1: Int, param2: Int): Int {
    var result = 1

    for (i in 1..param1) {
      result *= param2
    }

    return result
  }

  fun percentage(percentage: Int, number: Double): Double {
    val decimalForm = percentage * 0.01
    return decimalForm * number
  }
}

fun main() {
  val calculator = Calculator("Codey")
  println("1 + 2 = ${calculator.add(1, 2)}")
  println("1 - 2 = ${calculator.subtract(1, 2)}")
  println("4 * 2 = ${calculator.multiply(4, 2)}")
  println("4 / 2 = ${calculator.divide(4, 2)}")
  println("4 / 0 = ${calculator.divide(4, 0)}")
  println("5^2 = ${calculator.power(2, 5)}")
  println("50% of 20.0 = ${calculator.percentage(50, 20.0)}")
}