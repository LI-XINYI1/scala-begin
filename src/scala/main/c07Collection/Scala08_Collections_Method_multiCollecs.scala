package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 15:12
 * @description
 */
object Scala08_Collections_Method_multiCollecs {
  def main(args: Array[String]): Unit = {
    //TODO 集合通用方法
    val list1 = List(1,2,3,4)
    val list2 = List(4,5,6,7,8)

    val set1 = Set(1,2,3,4,5)
    val set2 = Set(4,5,6,7,8)

    println(list1.intersect(list2)) //交集
    println(list1.union(list2)) //并集
    println(list1.diff(list2)) //差集

    //拉链：将两个数据集拉在一起
    //基本原则是， 将两个数据集中！！相同的位置！！的数据拉在一起，形成对偶元素
    //如果长度不同： 以最少的为准
    println(list1.zip(list2))
    println(set1.zip(set2))  //无顺序


    /*TODO map方法 将数据集中的每一条数据进行转换处理，获得转换后的新数据集
    scala提供了可以进行自动转换的操作，具体转换由开发人员提供
    功能函数：实现特定的功能，但功能的逻辑不确定
    List => map(logic) => List
     */
    println(list1.map(_ * 3))
  }
}
