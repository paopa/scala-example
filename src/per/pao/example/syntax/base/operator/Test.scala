package per.pao.example.syntax.base.operator

import scala.language.postfixOps

/**
 * In scala operators are methods & any method can be an operator
 *
 * prefix operators 是 +, -, !, and ~
 * infix operator 就是在物件及方法參數的中間運算子．
 * Postfix operators 是沒有帶參數的方法．
 */
object Test {

  def test(): Unit = {
    val sum = (1).+(5)
    println(sum)
    val sum2 = 1 + 5
    println(sum2)
    val nums = 1 to 5
    println(nums)
    nums.foreach(num => {
      println(num)
    })
  }

  def hi(name: String): String = "Hi " + name

  //  def hi(name: String): Int = name.length // can't overload

  def overloadTest(): Unit = {
    println(hi("xxx"))
    //    println(hi(1)) // can't overload
  }

  def plusTest(): Unit = {
    val sum1 = 1 + 2
    println(sum1 + " " + sum1.getClass)
    val sum2 = 1 + "2"
    println(sum2 + " " + sum2.getClass)
    val sum3 = 1 + 2D
    println(sum3 + " " + sum3.getClass)
    val sum4 = 1 + 2L
    println(sum4 + " " + sum4.getClass)
  }

  def concatTest(): Unit = {
    val msg = "hi "
    println(msg + " " + msg.getClass)
    val newMsg = msg concat "Jack"
    println(newMsg)
    println(newMsg.toLowerCase)

  }

  def postfixTest(): Unit = {
    val t = "ABCD" toLowerCase;
    println(t)
    val t2 = "ABCD".toLowerCase() toUpperCase;
    println(t2)
  }

  def main(args: Array[String]): Unit = {
    //    test()
    //    overloadTest()
    //    plusTest()
    //    concatTest()
    postfixTest()
  }
}
