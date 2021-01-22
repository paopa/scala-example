package per.pao.example.syntax.base.loop

/**
 * 1.循序取得 collection 元素
 * 2.需要有 index 取得 collection 元素
 * 3.需要多個計數器時
 * 4.迴圈需要產生一組新個 collection 物件
 */
object Test {

  def mock() = Array("a", "b", "c", "dd")

  def mock2 = Array("a1" -> "a", "a2" -> "b", "a3" -> "c")

  def test1() = {
    //    for (value <- mock()) println(value)

    //    for (value <- mock()) {
    //      val x = value toUpperCase;
    //      println(x)
    //    }

    //    mock().foreach(println)

    //    1.to(5).foreach(println)

    //    (1 to 5).foreach(println)

    mock().withFilter(_ != "a").foreach(println)
  }

  def test2(): Unit = {
    //    for (i <- 0 until mock().length) {
    //      println(s"$i is ${mock()(i)}")
    //    }

    //    for (i <- 0 until (mock2 length) if mock2(i)._2 != "b") {
    //      println(mock2(i))
    //    }

    //    for ((element, index) <- mock2.zip(Stream from 5)) {
    //      println(s"$index is $element")
    //    }

    //    for ((element, index) <- mock2 zipWithIndex) {
    //      println(s"$index is $element")
    //    }

    //    val days = Array(("Sunday", 0), ("Monday", 1))
    //    days.zipWithIndex
    //      .foreach { day => println(s"${day._1._1} is ${day._1._2} , index is ${day._2}") }
  }

  def test3(): Unit = {
    //    for (i <- 1 to 3; j <- -2 to -1; k <- 8 to 10) {
    //      println(s" i=$i, j=$j, k=$k ")
    //    }

    //    for {
    //      i <- -3 to 0
    //      j <- 1 to 3
    //      if i != 2 && j != 2
    //    } println(s"i = $i , j = $j")

    //    val x = for(name <- mock) yield println(name toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    //    test1
    //    test2
    test3
  }
}
