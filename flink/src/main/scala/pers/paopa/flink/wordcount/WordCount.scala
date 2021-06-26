package pers.paopa.flink.wordcount

import org.apache.flink.api.scala._

/**
 * batch processing word count
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    // 創建執行環境
    val env = ExecutionEnvironment.getExecutionEnvironment

    // 從文件中讀取數據
    val path = System.getProperty("user.dir") + "/flink/src/main/resources/hello.text"
    val inputDataSet = env.readTextFile(path)

    // word count process
    // 切分數據得到 word 再做分組聚合
    val wordCountDataSet = inputDataSet.flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(0)
      .sum(1)

    wordCountDataSet.print()
  }

}
