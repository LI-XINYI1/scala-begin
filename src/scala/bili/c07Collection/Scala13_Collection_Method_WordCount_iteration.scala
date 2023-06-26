package scala.bili.c07Collection

import scala.io.{BufferedSource, Source}

/**
 * @author Lisa
 * @time 2023/6/26 - 20:26
 * @description
 */
object Scala13_Collection_Method_WordCount_iteration {
  def main(args: Array[String]): Unit = {
    // TODO 用功能函数实现word count 词频统计: 按功能分析
    //函数式编程 -> 迭代
    //实现需求时，使用多个函数组合在一起完成操作
    //前一个函数的结果会作为下一个函数的输入

    //1. 从文件中获取数据
    val source: BufferedSource = Source.fromFile("D:\\javaPrj\\scala\\scala-begin\\data\\wordlist.txt")
    //    读取文件时，将文件的每一行读出来，放置在集合中 - 集合的泛型是String
    val iter: Iterator[String] = source.getLines()  //迭代器：java\
    val dataList: List[String] = iter.toList
    source.close()

    //全部迭代
    val top3 = dataList.flatMap(
      line => {
        line.split(" ")
      }
    )
    .map(
      word => {
        (word,1)
      }
    )
    .groupBy(
      kv => {
        kv._1
      }
    )
      .mapValues(
      tuple => {
        tuple.size
      }
    )
    .toList.sortBy(
      kv => {
        kv._2
      }
    )(Ordering.Int.reverse)
    .take(3)

    //6. 将结果打印纸控制台上
    println(top3)


    //全部迭代 - 简化
    //长得好像python dataframe的操作啊，数据后面加一大堆花活
    dataList
      .flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .foreach(println)



  }
}
