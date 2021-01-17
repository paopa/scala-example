package per.pao.example.flink.wordcount

import org.apache.flink.streaming.api.scala._

object StreamingWordCount {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
//    env.disableOperatorChaining()

    val stream = env.socketTextStream("localhost", 7777)

    val wordCount = stream.flatMap(_.split(" ")).startNewChain()
      .map((_, 1))
      .keyBy(0)
      .sum(1)

    wordCount.print().setParallelism(1)
    env.execute()
  }

}
