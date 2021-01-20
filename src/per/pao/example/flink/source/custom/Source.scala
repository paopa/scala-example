package per.pao.example.flink.source.custom

import org.apache.flink.streaming.api.functions.source.SourceFunction
import org.apache.flink.streaming.api.scala._

import scala.util.Random

case class SensorReading(id: String, timestamp: Long, temperature: Double)

class Source extends SourceFunction[SensorReading] {

  // 定義一個 flag,表示 source 是否正常運行
  var running: Boolean = true;

  // 正常生成數據
  override def run(ctx: SourceFunction.SourceContext[SensorReading]): Unit = {
    // initialize a Random generator
    val rand = new Random

    // initial a sensor data
    var currentTemperature = 1.to(10).map(i => ("sensor" + i, 60 + rand.nextGaussian() * 20))

    // generate data flow
    while (running) {
      // 在前一次基礎上更新溫度
      currentTemperature = currentTemperature.map(i => (i._1, i._2 + rand.nextGaussian()))
      // 拿到當前時間
      val currentTime = System.currentTimeMillis / 1000
      currentTemperature.foreach(i => ctx.collect(SensorReading(i._1, currentTime, i._2)))

      Thread.sleep(500)
    }
  }

  // 取消數據生成
  override def cancel(): Unit = {
    running = false
  }

}

object Test {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val stream = env.addSource(new Source)

    stream.print().setParallelism(1)
    env.execute
  }
}
