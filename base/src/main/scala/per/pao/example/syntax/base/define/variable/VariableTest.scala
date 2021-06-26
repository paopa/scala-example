package per.pao.example.syntax.base.define.variable

/**
 * val similar to final in java
 *
 * var 可以改變及重新指派新的 reference
 */
object VariableTest {

  def valTest(): Unit = {
    val num = 5;
    //    num = 10;
  }

  def varTest(): Unit = {
    var num = 5;
    num = 10;
    println(num)
  }

  def main(args: Array[String]): Unit = {
    //    valTest();
    varTest();
  }

}
