package per.pao.example.flink.transform.base

import org.apache.flink.streaming.api.functions.source.SourceFunction

class Source extends SourceFunction[A] {

  var running: Boolean = true;

  override def run(ctx: SourceFunction.SourceContext[A]): Unit = {
    var currentIndex = 1.to(10).map(i => ("sensor_" + i, 0))
    while (running) {
      currentIndex = currentIndex.map(i => (i._1, i._2 + 1))
      val currentTime = System.currentTimeMillis / 1000
      currentIndex.foreach(i => ctx.collect(A(i._1, currentTime, i._2)))
      Thread.sleep(500)
    }
  }

  override def cancel(): Unit = {
    running = false
  }
}