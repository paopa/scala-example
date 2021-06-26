package per.pao.example.syntax.base.compare

object Test {

  val s1 = new String("123")
  val s2 = new String("123")
  val s3 = null
  val s4 = null

  // compare referenced address
  def eq(): Unit = {
    println("eq s1 s2 " + (s1 eq s2))
    println("eq s1 s3 " + (s1 eq s3))
    println("eq s1 s3 " + (s4 eq s3))
  }

  // compare via equals method
  def equals(): Unit = {
    println("equals s1 s2 " + (s1 equals s2))
    println("equals s1 s2 " + (s1 equals s3))
//    println("equals s1 s2 " + (s4 equals s3))
  }


  def doubleEqualsSign(): Unit = {
    println("== s1 s2 " + (s1 == s2))
    println("== s1 s2 " + (s1 == s3))
    println("== s1 s2 " + (s4 == s3))
  }

  def main(args: Array[String]): Unit = {
    println("--- eq test ---")
    eq()
    println("--- equals test ---")
    equals()
    println("--- == test ---")
    doubleEqualsSign()
  }

}