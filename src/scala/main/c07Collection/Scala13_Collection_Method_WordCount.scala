package scala.main.c07Collection

import scala.io.{BufferedSource, Source}

/**
 * @author Lisa
 * @time 2023/6/26 - 17:36
 * @description
 */
object Scala13_Collection_Method_WordCount {
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

    //2. 判断需要得到的结果
    //3. 感觉预想的结果，【缺什么补什么】
    //  3.1. 缺少单词，获取单词
    //        将每一行数据中的单词分解（拆分）出来，扁平化操作
    val wordList = dataList.flatMap(
      line => {
        line.split(" ")
      }
    )
    //println(wordList)//List(hello, world, world, with, scala, scala, and,

    //  3.2. 缺少数量，补充数量
    //      map方法可以将数据按照指定的规则转换为其他的数据。这里的转换可以是 类型 / 数值
    val wordOneList = wordList.map(
      word => {
        (word,1)
      }
    )
    //println(wordOneList) //List((hello,1), (world,1), (world,1), (with,1), (scala,1), ...

    //4. 统计数据前，将数据按照规则聚合在一起
    //  将数据按照指定规则进行分组：相同的单词方舟一起
    //  groupBy方法会将数据集中的每一条数据加分组标记，相同标记的数据会放置在一起
    //  groupBy方法返回结果是分组后的Map集合（k-分组标记，v-相同标记的数据集合）
    val wordGroup: Map[String,List[(String,Int)]] = wordOneList.groupBy(
      kv => {
        kv._1
      }
    )
    //println(wordGroup) //Map(world -> List((world,1), (world,1)),

    //5. 将聚合后的数据统计
    //   集合的长度就是单词个数
    val wordCount: Map[String,Int] = wordGroup.mapValues(
      tuple => {
        tuple.size
      }
    )

    //6. 将统计结果按照数量排序，取前三名
    //  注意：分组后结果为Map类型，Map类型没有顺序，所以无法排序
    println(wordCount)       //Map(world -> 2, spark -> 4, scala -> 3, with -> 1, hello -> 3, and -> 2)
    println(wordCount.toList)//List((world,2), (spark,4), (scala,3), (with,1), (hello,3), (and,2))
    // !!! Map to List, 转化为List（(k,v)）
    //      先转化Map为List
    val wordCountSort: List[(String,Int)] = wordCount.toList.sortBy(
      kv => {
        kv._2
      }
    )(Ordering.Int.reverse)

    val top3 = wordCountSort.take(3)

    //6. 将结果打印纸控制台上
    println(top3)
  }
}
