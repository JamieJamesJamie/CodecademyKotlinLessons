package _5_loops

fun main() {
  // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  // Write your code below

  for (row in 1..sqSide) {
    for (col in 1..sqSide) {
      if (row % 2 == col % 2) {
        print(sqChar1)
      } else {
        print(sqChar2)
      }
    }
    println()
  }


  // Triangle Variables
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  // Write your code below

  for (row in triRows downTo 1) {
    triCount = 0
    while (triCount < triRowLen) {
      triCount++
      print(triChar1)
    }
    println()
    triRowLen--
  }


  // Triangle Outline
  triRowLen = triRows

  for (row in triRows downTo 1) {
    triCount = 0
    while (triCount < triRowLen) {
      triCount++

      if (triCount != 1 && triCount != triRowLen && row != triRows) {
        print(triChar2)
      } else {
        print(triChar1)
      }
    }
    println()
    triRowLen--
  }
}
