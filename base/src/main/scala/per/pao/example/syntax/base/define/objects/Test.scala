package per.pao.example.syntax.base.define.objects

/**
 * scala 並沒有像 java 一樣有 static members，
 * 所以需利用 Singleton object (只會有一個 object)，來達到 static 的效果
 */
object Test {
  def main(args: Array[String]): Unit = {
    val a = A
    val b = A
    a.add(100)
    println(a.getAmt)
    b.add(200)
    println(b.getAmt)
  }

  implicit object A {
    private var sum: Int = _

    def add(amt: Int) = this.sum += amt

    def getAmt: Int = this.sum
  }

}