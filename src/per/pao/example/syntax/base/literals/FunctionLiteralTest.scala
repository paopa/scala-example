package per.pao.example.syntax.base.literals

/**
 * function literal 由於沒有 function name 所以又稱作
 * 匿名函式(anonymous function)、或是 lambda expressions
 */
object FunctionLiteralTest {

  def test1(): Unit = {
    val x = (num1: Int, num2: Int) => num1 + num2
    println(x(1, 2))
  }

  /**
   * 使用 underscore 進行簡化
   */
  def test2(): Unit = {
    //    val sum = (_: Int) + (_: Int)
    val sum: (Int, Int) => Int = _ + _
    println(sum(1, 2))
  }

  def test3(): Unit = {
    val sayHello = (name: String) => "Hello " + name
    println(sayHello("xxx"))

    val sayHello2 = "Hello " + (_: String)
    println(sayHello2("xxx2"))

    val sayHello3 = "Hello " + _
    println(sayHello3("xxx3"))
    println(sayHello3("xxx22"))
  }

  def forLoopTest(): Unit = {
    1.to(5).foreach((num: Int) => print(num + " "))
    print("\n")
    (1 to 5).foreach(print)
    print("\n")
  }

  /**
   * 這個範例 val variable 替換成 def function
   * 就結果而言也是一樣，但可以看另一個範例
   *
   * @see [[defAndValTest]]
   */
  def functionalTest(): Unit = {
    val plus = (_: Int) + (_: Int)
    val times = (_: Int) * (_: Int)
    val minus = (_: Int) - (_: Int)
    val divided = (_: Int) / (_: Int)

    def countResult(num1: Int, num2: Int, counter: (Int, Int) => Int): Int = counter(num1, num2)

    println(countResult(1, 2, plus))
    println(countResult(1, 2, times))
    println(countResult(1, 2, minus))
    println(countResult(1, 2, divided))
  }

  def defAndValTest(): Unit = {
    val printMsg1 = scala.util.Random.nextInt()

    def printMsg2 = scala.util.Random.nextInt()

    /**
     * 由此可知 def function 每次調用生成一個新的 random
     * 而 val 一但使用就只調用一次
     */
    println("val " + printMsg1)
    println("def " + printMsg2)
    println("val " + printMsg1)
    println("def " + printMsg2)
  }

  /**
   * val 只會定義一次，所以用 val 但並沒有實作內容就會 throw error
   *
   * @see [[lazyValTest]]
   */
  def noImplementFunctionTest(): Unit = {
    try {
      val test: Int = ???
    } catch {
      case x: Error => x.printStackTrace()
    }

    def test2: Int = ???

    println("def function no implement won't throws error")
  }


  /**
   * keyword lazy 代表真的需要使用時
   * 才會產生
   */
  def lazyValTest(): Unit = {
    println("lazy val")
    lazy val test1: Int = ???

    println("val")
    val test2: Int = ???
  }

  def noImplementFunctionTest2(): Unit = {
    var counter = new Counter()
    counter.count
  }

  def main(args: Array[String]): Unit = {
    //    test1()
    //    test2()
    //    test3()
    //    forLoopTest()
    //    functionalTest()
    //    defAndValTest()
    //    noImplementFunctionTest()
    //    lazyValTest()
    noImplementFunctionTest2()
  }
}

class Counter extends ACounter{
  override def count: Int = ???
}

abstract class ACounter {
  def count: Int
}
