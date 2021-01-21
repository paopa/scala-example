package per.pao.example.syntax.basic.placeholder.notation

/**
 * placeholder notation "_" test
 */
object Test {

  def sum(num1: Int, num2: Int): Int = num1 + num2

  def sum(add: Int => Int, num: Int): Int = add(add(num))

  def main(args: Array[String]): Unit = {
    val sum1 = sum(1, _: Int)
    println(sum1(2))

    println(sum(num => num + 1, 2))
    println(sum(num => num * 2, 2))
    println(sum(_ + 1, 2))
    println(sum(_ * 2, 2))
  }
}
