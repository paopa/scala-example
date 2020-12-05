package per.pao.example.syntax.basic

object SequenceTest {

  val seq: Seq[Seq[Int]] = Seq(
    Seq(1, 2),
    Seq(3, 4, 5),
    Seq(6, 7, 8, 9)
  )

  def main(args: Array[String]): Unit = {
    val third: Seq[Int] = seq.apply(2)
    println(third)
    val three: Seq[Int] = third.take(3)
    println(three)
    println(this.seq)
  }

}
