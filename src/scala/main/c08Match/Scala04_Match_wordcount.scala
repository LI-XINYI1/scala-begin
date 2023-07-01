package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/27 - 8:06
 * @description
 */
object Scala04_Match_wordcount {
  def main(args: Array[String]): Unit = {

    //TODO wordcount
    val list = List(
      ("Hello World Scala Spark", 4),
      ("Hello Scala Spark", 3),
      ("Hello Spark", 2),
      ("Hello", 1),
    )

    //将现有的数据转换成熟悉的格式
    list.map {
      case (str, cnt) => {
        (str + " ") * cnt
      }
    }.flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
      .foreach(println)



    //TODo 将集合中数据全部加一
    val list2: List[Any] = List(1,2,3,"4",5,7)
    list2.map{
      //Any类型无法直接 + 1
      case i: Int => i+1
      case s: String => s + 1
      }.foreach(println)

  }
}
