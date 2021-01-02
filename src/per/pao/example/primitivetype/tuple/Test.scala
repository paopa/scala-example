package per.pao.example.primitivetype.tuple

/**
 * tuple is immutable, can storage element that is different type
 *
 * tuple 是根據 element 數量， 目前最多只能儲存 22
 */
object Test {

  def test: Unit = {
    val nums = (1, "a", 2D, 3L)
    println(nums)
  }

  def getElement: Unit = {
    val nums = (1, "asd", 3D, 2L, BigInt("4", 10))
    println(nums)
    println(nums._1)
  }

  def errorTest: Unit = {
    //    val nums =
    //      (1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
    //        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
    //            1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
  }

  def test2: Unit = {
    println(1 -> "Jack")
    val (id, name) = 1 -> "jack"
    println((id, name))
  }

  def filterFindTupleTest: Unit = {
    val list = List("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)

    def findName(name: String, list: List[(String, Int)]): String =
      list.filter(e => e._1 == name).head._1

    println(findName("c", list))
  }

  def mapSumTupleTest: Unit = {
    val list = List('a' -> 1, 'b' -> 2, 'c' -> 3, 'd' -> 4, 'e' -> 5)

    println(list.map(_._2).sum)
    println(list.map(e => e._2).sum)
  }

  def foldTest: Unit = {
    val nums = List('a' -> 1, 'b' -> 2, 'c' -> 3, 'd' -> 4, 'e' -> 5)
    println(nums.foldLeft(0)((sum, tup) => sum + tup._2))
  }

  def main(args: Array[String]): Unit = {
    //    test
    //    getElement
    //    errorTest
    //    test2
    //    filterFindTupleTest
    //    mapSumTupleTest
    foldTest
  }
}
