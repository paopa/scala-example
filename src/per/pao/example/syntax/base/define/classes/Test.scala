package per.pao.example.syntax.base.define.classes

object Test {

  def classATest: Unit = {
    val a = new A()
    println(a.id)
    a.work
  }

  def classBTest: Unit = {
    val b: B = new B
    b setName "TEST!!~"
    println(b.getName)
  }

  def main(args: Array[String]): Unit = {
    classATest
    classBTest
  }

  class A {
    val id = "1"
    val name = "WANG"

    def work = println("working...")
  }

  class B {
    private var name: String = _

    def setName(name: String) = this.name = name

    def getName: String = this.name
  }

}