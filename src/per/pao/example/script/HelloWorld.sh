#!/bin/sh
exec scala "$0" "$@"
!#

object HelloWorld {
  def main(args:Array[String]): Unit = {
    print(args(0) + " ")
    print(args(1) + "\n")
  }
}

val args = Array("Hello","World!")
HelloWorld.main(args)

val msg="This is by shell"
println(msg)