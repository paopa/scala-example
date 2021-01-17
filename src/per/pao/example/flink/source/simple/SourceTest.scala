package per.pao.example.flink.source.simple

import org.apache.flink.streaming.api.scala._

case class SensorReading(id: String, timestamp: Long, temperature: Double)

object SourceTest {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment;
    //1. 自定義 collection
    val stream1 = env.fromCollection(List(
      SensorReading("sensor_1", 123, 2.2),
      SensorReading("sensor_2", 456, 2.3),
      SensorReading("sensor_3", 789, 2.4),
      SensorReading("sensor_4", 246, 2.5)
    ))

    //2. from file
    val stream2 = env.readTextFile("")

    //    stream1.print("stream1").setParallelism(4)
    stream2.print("stream1").setParallelism(4)

    env.execute()
  }

}
