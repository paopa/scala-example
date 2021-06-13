package per.pao.example.syntax.base.`match`.expression

object Test {

  def getNumber(num: Int): String = {
    num match {
      case 1 => "one"
      case 2 => "two"
      case _ => ""
    }
  }

  def getNumberV2(num: Int): String = {
    num match {
      case 1 | 3 | 5 => "odd"
      case 2 | 4 | 6 => "evens"
      case _ => "null"
    }
  }

  def variableTest(): Unit = {
    val i = 2
    val x = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "null"
    }
    println(x)
  }

  def getMultiType(x: Any): String = {
    x match {
      case true => "truth"
      case 'a' | 'A' => "this is a"
      case x :: xs => "List"
      case Nil => "empty List"
      case _ => "null"
    }
  }

  def getMultiMatchType(x: Any): String = {
    x match {
      case List(0, _, _) => "List has three element first is 0"
      case List(1, _*) => "List element size is dynamic"
      case (a, b) => s"Tuple2 $a and $b"
      case s: String => s"this is string: $s"
      case i: Int => s"this is int: $i"
      case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
      case _ => "null"
    }
  }

  def main(args: Array[String]): Unit = {
    println(getNumber(2))
    println(getNumberV2(3))

    variableTest()

    println(getMultiType(List()))
    println(getMultiType(List(1, 2, 3)))
    println(getMultiType(true))

    println(getMultiMatchType(List(0, 2, 3)))
    println(getMultiMatchType(List(1, 2, 3,4,5)))
    println(getMultiMatchType((2,4)))
    println(getMultiMatchType(5))
    println(getMultiMatchType(Array(1,2,6)))

  }
}
