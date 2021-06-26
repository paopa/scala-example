package pers.paopa.flink.transform.base

import org.apache.flink.streaming.api.scala._

object Test {

  def flatMapTest(stream: DataStream[A]): DataStream[String] =
    stream.flatMap(x => x.id.split("s"))

  def filterTest(stream: DataStream[A]): DataStream[A] =
    stream.filter(x => x.id.endsWith("1"))

  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val stream = env.readTextFile("")

    val dataStream = stream.map(x => {
      val array = x.split(",")
      A(array(0).trim, array(1).trim.toLong, array(2).trim.toDouble)
    })

    //keyBy
    //    val streamMap = dataStream.keyBy(0).sum(2)
    //    val streamMap = dataStream.keyBy(_.id).sum("num")

    // reduce
    val streamMap = dataStream.keyBy(_.id)
      .reduce((x, y) => A(x.id, x.timestamp + 1, y.num + 10))

    streamMap.print()

    env.execute("transform test")
  }
}
