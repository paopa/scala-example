package per.pao.example.syntax.basic.literals

/**
 * 目前了解 literals 的概念
 * 大概是指的是指說可以直接寫一個常數值在程式碼裡，編譯器會根據程式寫的常數對應到該對應的型態。
 */
object Test {

  def hexTest(): Unit = {
    val hexNum = 0x1afL
    println(hexNum)
  }

  /**
   * scala 2.11 後 octal literals 已被移除。
   * 但可以使用 scala.math.BigInt 轉換 octal
   *
   * @see scala.math.BigInt
   */
  def octalTest(): Unit = {
    //    val num = 035 // had removed
    val num = BigInt("35", 8)
    println(num)
  }

  /**
   * string literals
   */
  def stringTest(): Unit = {
    val msg = "Hello \"World\" "
    println(msg)
    val msg1 = """Hello "World" """
    println(msg1)
    var xxx = """Hello "DDDDD" """
    println(xxx)
  }

  def sayHi(s: Symbol): Any = "Hi " + s.name

  /**
   * symbol are deprecated in Scala 2.13
   */
  def symbolTest(): Unit = {
    val s = 'World
    println(s.name)
    println(sayHi(s))
  }

  def main(args: Array[String]): Unit = {
    //    hexTest()
    //    octalTest()
//        stringTest()
    symbolTest()
  }
}
