package scala.bili.c07Collection

import scala.collection.mutable.ListBuffer

/**
 * @author Lisa
 * @time 2023/6/26 - 15:36
 * @description
 */
object Scala09_Collections_Func_flat {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    val list = List(
      List(1,2), List(3,4)
    )
    println(list.size)

    //TODO 扁平化
    //将集合中的整体数据拆分成个体来使用的功能
    //flatten方法将数据集按照默认的规则进行扁平化
    // TODO flatten
    val newList: List[Int] = list.flatten
    println(newList)  //List(1, 2, 3, 4)
    println(newList.size)

    val list2 = List(
      "Hello ", "Goodbye"
    )
    //flatten方法会将字符串当做char数组，扁平化后，就是一个个char
    val newList2 = list2.flatten
    println(newList2) //List(H, e, l, l, o,  , G, o, o, d, b, y, e)


    // TODO flatMap
    //自定义的扁平化规则
    //flatMap需要传递一个参数，类型为函数类型：String => GenTraversableOnce
    //    String 数据集中的一条数据
    //    GenTraversableOnce 集合类型的顶层通用类型，意味着任何集合都可以此次使用
    val newList3 = list2.flatMap(
      str => {
        str.split(" ")
      }
    )
    val newList3_simp = list2.flatMap(_.split(" "))
    println(newList3) //List(Hello, Goodbye)

  }
}
