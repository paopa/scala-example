package per.pao.example.syntax.basic

import per.pao.example.syntax.basic.`object`.Complex

object InfixOperatorTest {

  def demo(): Unit = {
    println(1 + 1)
    println(1.+(1))
  }

  def demo2(): Unit = {
    val x = Complex(8, 7)
    val y = Complex(4, 9)
    println(x, y)
    println("x add y: " + (x add y))
    println("x add y: " + x.add(y))
    x print(x, y)
  }

  def main(args: Array[String]): Unit = {
    demo()
    demo2()
  }

}
