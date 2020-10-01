package per.pao.example.test

object ReturnFunctionTest {

  def demo(i: Int): Int = {
    if (i == 1) {
      return i
    }
    i + 1
  }

  def demo2(i: Int): Int = i * 100

  def demo3(): String = "hello"

  def main(args: Array[String]): Unit = {
    println(demo(2))
    println(demo2(1))
    println(demo3())
  }
}
