object SquareCalculator {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val squaredNumbers = calculateSquare(inputList)
    println(s"Input: $inputList")
    println(s"Output: $squaredNumbers")
  }
}
