package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 11:51
 * @description
 */
object Scala03_Collection_Set {
  def main(args: Array[String]): Unit = {
    //TODO 集合 - Set集： 无需，数据不可重复

    //TODO 构建
    //set是一个trait，不能直接构建，defualt不可变；
    //集合一般用伴生对象apply方法
    val set1 = Set(1,2,3,4,5,6,7)

    // 不可变集合的基本操作都是采用 ！！特殊符号！！
    val set2 = set1 + 10  //产生新的，set1不变

    println(set1)
    println(set2)
  }
}
