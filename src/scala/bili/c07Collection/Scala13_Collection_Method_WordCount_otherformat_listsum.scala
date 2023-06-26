package scala.bili.c07Collection

import scala.io.{BufferedSource, Source}

/**
 * @author Lisa
 * @time 2023/6/26 - 20:39
 * @description
 */
object Scala13_Collection_Method_WordCount_otherformat_listsum {
  def main(args: Array[String]): Unit = {
    // TODO 用功能函数实现word count 词频统计: 按功能分析
    //函数式编程 -> 迭代
    //实现需求时，使用多个函数组合在一起完成操作
    //前一个函数的结果会作为下一个函数的输入

    val list = List(
      ("Hello World Scala Spark",4),
      ("Hello Scala Spark",3),
      ("Hello Spark",2),
      ("Hello",1),
    )

    //将现有的数据转换成熟悉的格式
    list.map(
      kv => {
        (kv._1 + " ") * kv._2  //加“ ”： 因为split是用空格分割的
      }
    ).flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .foreach(println)



    //思路二：扁平化 （word, countnum）就是想要的形式
    list.flatMap(
      kv => {
        val line = kv._1
        val cnt = kv._2
        line.split(" ").map(
          word => {
            (word,cnt)
          }
        )
      }     //(Hello,10) (Spark, 9) (Scala, 7)
    ).groupBy(
      kv => {
        kv._1   //(Hello,List((Hello,4), (Hello,3), (Hello,2), (Hello,1))) (Spark, List((Spark, 4), (Spark, 3), (Spark, 2)))
      }
    ).mapValues(
      list => {
        list.map(_._2).sum
      }
    ).foreach(println)

    //理解sum计算
    val list_trysum = ("Hello",List(("Hello",4), ("Hello",3), ("Hello",2), ("Hello",1)))
    val sum = list.map(
      kv => kv._2
    ).sum
    println(sum)


    //list的简单计算
    val list1 = List(1,2,3,4)
    list1.sum
    list1.max
    list1.min
    list1.product

  }
}
