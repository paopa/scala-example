package per.pao.example.syntax.base.if_.expression

object IfExpressionTest {
  def main(args: Array[String]): Unit = {
    val a = if (1 < 2) 10 else 12
    val b = if (a > 10) a else if (a == 10) a + 1 else a - 1
    val c = if (a == 10) {
      "A" + "B"
    } else "C" + "D"
    println(a)
    println(b)
    println(c)
  }
}
