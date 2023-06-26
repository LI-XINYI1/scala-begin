package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 14:44
 * @description
 */
object Scala08_Collections_Method {
  def main(args: Array[String]): Unit = {
    //TODO 集合通用方法
    // 以下方法都产生新的集合！！！！！！！ 不可变immutable list！！！
    val list = List(1,2,3,4)

    println(list.length)
    println(list.size)
    println(list.isEmpty)
    println(list.contains(2))
    println(list.reverse)
    println(list.distinct)
    println(list.mkString(", "))
    list.foreach(println)

    println(list(0))
    println(list.head) //head是方法
    println(list.last)   //最后一个  4

    println(list.tail)   //除了第一个head以外的数据  List(2, 3, 4)
    println(list.tails)  //tails迭代器 <iterator>
    println(list.init)   //除了最后一个 List(1,2,3)
    println(list.inits)  //inits迭代器

    println(list.take(2)) //从左获取指定个数 List(1,2)
    println(list.takeRight(2)) //从右获取指定个数 List(3,4)

    println(list.drop(1))        //List(2, 3, 4)
    println(list.dropRight(3))   //List(1)

    println(list.splitAt(2)) //切分，在第二个元素后（从1开始）  (List(1, 2),List(3, 4))

    //滑动: 每连续的两天数据
    //sliding方法可以将集合中的一部分固定数量的数据作为整体进行数据处理
    //处理完后，作为整体的操作（滑动窗口）会向后滑动。整体的数量不变
    val sliding: Iterator[List[Int]] = list.sliding(2)
    val sliding2: Iterator[List[Int]] = list.sliding(2,2) //步长为2
    while(sliding.hasNext){
      println(sliding.next())
    }
    // 滑动-初始：多个tail
    println(list.tail.take(2))
    println(list.tail.tail.take(2))
    println(list.tail.tail.tail.take(2))
    // 滑动-进阶：tails迭代器
    val tails: Iterator[List[Int]] = list.tails
    while(tails.hasNext){
      println(tails.next().take(2))
    }


  }
}
