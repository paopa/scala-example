package per.pao.example.syntax.base.caseclass

case class Test(a: String, b: String, c: String) {
  def echoMsg: Unit = println("hi")
}

object Exec {
  def main(args: Array[String]): Unit = {
    val test = Test("aa", "bb", "cc")
    println(test)
    test.echoMsg
    println("--- copy test ---")
    println(test.copy("aaa"))
    println(test.copy(b = "bbb"))
  }
}
