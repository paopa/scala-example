package per.pao.example.syntax.basic.define.method

/**
 * def to declare a method
 *
 * def methodName(parameter: type,...): returnType ={
 * // method implement ...
 * return value
 * }
 *
 * ** NOTE **
 * scala method parameter is declare via val
 * so is immutable
 *
 * scala 編譯器的 type inference，可以推測變數的型別及方法回傳的型態，所以可以讓程式碼更加簡潔。
 */
object MethodTest {

  def basicMethodTest(num1: Int, nm2: Int): Int = {
    return num1 + nm2
  }

  def skipReturnTest(i: Int, i1: Int): Int = i + i1

  def immutableTest(i: Int): Unit = {
    //    i = 2;
  }

  // 無參數時 () 可省略，會像是在 declare variable
  def msg(i: Int) = "hello world" + i

  def msg(): Unit = println("Hello world")

  def sum(nums: Int*):Int = nums.reduceLeft((sum, num) => sum + num)

  def main(args: Array[String]): Unit = {
//    println(basicMethodTest(1, 2))
//    println(skipReturnTest(1, 2))
//    immutableTest(1)
//    println(msg(100))
//    msg()
    println(sum(1, 2, 3, 4, 5))
  }

}