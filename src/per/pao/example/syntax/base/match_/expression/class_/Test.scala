package per.pao.example.syntax.base.match_.expression.class_

object Test {
  def main(args: Array[String]): Unit = {
    println("--- compare value ---")
    println(checkStudent(Student("1", "david", "")))
    println("--- compare class type ---")
    println(checkPeople(Teacher()))
  }

  def checkStudent(student: Student): String = student match {
    case Student("1", "david", "") => "student1"
    case Student("2", "gao", "") => "student2"
    case Student("3", "kevin", "") => "student3"
    case _ => ""
  }

  def checkPeople(people: People): String = people match {
    case Employee() => "is employee"
    case Kid() => "is kid"
    case Teacher() => "is teacher"
    case _ => ""
  }
}

class People

case class Teacher() extends People

case class Employee() extends People

case class Kid() extends People

case class Student(id: String, name: String, tel: String) {
  def echoMsg(): Unit = println("Hi")
}
