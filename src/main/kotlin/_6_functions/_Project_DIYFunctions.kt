package _6_functions

// Write your code below
fun getListOfNumbers(): List<Int> {
  val myList = mutableListOf<Int>()

  for (i in 1..7) {
    println("Please enter a number:")
    myList.add(Integer.valueOf(readLine()))
  }

  return myList
}

fun findMax(listInts: List<Int>): Int {
  var largestNumber = 0

  for (elem in listInts) {
    if (elem > largestNumber) {
      largestNumber = elem
    }
  }

  return largestNumber
}

fun findMin(listInts: List<Int>): Int {
  var smallestNumber = listInts[0]

  for (elem in listInts) {
    if (elem < smallestNumber) {
      smallestNumber = elem
    }
  }

  return smallestNumber
}

fun findAverage(listInts: List<Int>): Int {
  var sum = 0

  for (elem in listInts) {
    sum += elem
  }

  return sum / listInts.size
}

fun checkIfListContains(listInts: List<Int>, x: Int): Boolean {
  for (elem in listInts) {
    if (elem == x) {
      return true
    }
  }

  return false
}


val differenceBetweenMaxAndMin = { listInts: List<Int> ->
  findMax(listInts) - findMin(listInts)
}

fun squareList(listInts: List<Int>): List<Int> {
  val newList = mutableListOf<Int>()

  for (elem in listInts) {
    newList.add(elem * elem)
  }

  return newList
}

tailrec fun factorial(num: Int, product: Int = 1): Int {
  return if (num == 1) product
  else factorial(num - 1, num * product)
}


fun main() {
  // Write more code below
  val values = getListOfNumbers()
  println("values: $values")

  val largestValue = findMax(values)
  println("The largest number is $largestValue.")

  val smallestValue = findMin(values)
  println("The smallest number is $smallestValue.")

  val average = findAverage(values)
  println("The average is $average.")

  print("Please enter a number to check for: ")
  val numToFind = Integer.valueOf(readLine())
  val containsValue = checkIfListContains(values, numToFind)

  if (containsValue) {
    println("$numToFind exists within the list.")
  } else {
    println("$numToFind does not exist within the list")
  }

  val difference = differenceBetweenMaxAndMin(values)
  println("The difference between the max value and min value is $difference.")

  val squaredValues = squareList(values)
  println("values squared: $squaredValues")

}

