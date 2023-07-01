package scala.main.c07Collection

import scala.collection.mutable.ListBuffer

/**
 * @author Lisa
 * @time 2023/6/26 - 15:31
 * @description
 */
object Scala09_Collections_Func_map {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）

    /*TODO map方法 将数据集中的每一条数据进行转换处理，获得转换后的新数据集
    scala提供了可以进行自动转换的操作，具体转换由开发人员提供
    功能函数：实现特定的功能，但功能的逻辑不确定
    List => map(logic) => List
     */
    val list1 = List(1,2,3,4)
    val list2 = ListBuffer(1,2,3,4)
    println(list1.map(_ * 3))

    //map方法需要传递一个参数，、
    // 这个参数类型为函数类型： Int => B
    //    Int表示数据集中的每一条数据，B表示处理后的结果（任意类型
   def mapFaction(num: Int): Int = {
      num*2
    }
    val newList1 = list1.map(mapFaction)
    val newList2 = list2.map(mapFaction)
    // 功能函数在使用时，都采用匿名函数，同时简化函数操作
    //TODO 当匿名函数只有一个参数，且每个参数都进行处理是，可以用下划线_
    list1.map( _ * 2)  //_代替num：每一条数据

  }
}
