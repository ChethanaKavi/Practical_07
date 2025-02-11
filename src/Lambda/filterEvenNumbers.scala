object filterEvenNumbers {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(inputList)
    println(s"Input: $inputList")
    println(s"Output: $evenNumbers")
  }
}
