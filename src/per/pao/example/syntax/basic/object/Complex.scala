package per.pao.example.syntax.basic.`object`

/**
 * case class 跟一般 class 無異，多實作了 toString() ,hashCode() ... method
 */
case class Complex(real: Int, imaginary: Int) {
  
  def add(a: Complex): Complex = Complex(real + a.real, imaginary + a.imaginary)

  def print(a: Complex, b: Complex): Unit = println(a + "||||" + b)
}
