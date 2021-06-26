package per.pao.example.syntax.base.curry

object Test {

  // 一般加法 method
  def sum(num1: Int, num2: Int): Int = num1 + num2

  def currySum(num1: Int)(num2: Int): Int = num1 + num2

  // equal to currySum method
  def tempSum(num1: Int): Int => Int = (num2: Int) => num1 + num2

  def sum(add: Int => Int)(num: Int): Int = add(add(num))

  def hello(name: String): String = "Hello " + name

  def hello2: Any => String = "Hello " + _

  def main(args: Array[String]): Unit = {
    val x = sum(1, 2)
    println(x)

    val y = currySum(1)(2)
    println(y)

    val z = tempSum(1)
    println(z(2))

    val w = tempSum(1)(_)
    println(w(2))

    val t: Int => Int = _ * 3
    println(sum(t) {
      5
    })

    println(hello {
      "david"
    })

    println(hello2 {
      "david"
    })

    println(hello2 {
      123
    })
  }
}
