package per.pao.example.syntax.base.loop

import scala.util.control.Breaks
import scala.util.control.Breaks._

object WhileTest {
  def main(args: Array[String]): Unit = {
    var i = 0

    //    while (i < 5) {
    //      println(i)
    //      i = i + 1
    //    }

    //    do {
    //      println(i)
    //      i = i + 1
    //    } while (i < 5)

    // break
    //    breakable {
    //      while (i < 5) {
    //        if (i == 3) {
    //          break
    //        }
    //        println(i)
    //        i = i + 1
    //      }
    //    }

    // continue
    //    while (i < 5) {
    //      breakable {
    //        if (i == 3) {
    //          break
    //        }
    //        println(i)
    //      }
    //      i = i + 1
    //    }

//    val break = new Breaks
//    val continue = new Breaks

//    break.breakable {
//      while (i < 10) {
//        continue.breakable {
//          if (i % 2 == 0) {
//            continue break
//          } else if (i == 7) {
//            break break
//          }
//          println(i)
//        }
//        i = i + 1
//      }
//    }

    for (i <- 0 to 10) {
      breakable {
        if (i % 2 != 0) {
          break()
        }
        println(i)
      }
    }
  }
}
