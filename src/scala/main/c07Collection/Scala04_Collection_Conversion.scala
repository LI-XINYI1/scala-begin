package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 12:48
 * @description
 */
object Scala04_Collection_Conversion {
  def main(args: Array[String]): Unit = {
    //TODO 集合的转化

    val list = List(1,2,3,4)
    val list_kv = List(("a",1))

    val array: Array[Int] = list.toArray
    val set: Set[Int] = list.toSet
    //list.toMap//list没有键值对概念，无法变Map
    list_kv.toMap

    println(list)
    println(array)
    println(set)



    val set2 = Set(1,2,3,4)

    val array2: Array[Int] = set.toArray
    val list2: List[Int] = set.toList
    //set2.toMap


    val map = Map(("a", 1), ("b", 2))

    val array3: Array[(String, Int)] = map.toArray
    val list3: List[(String, Int)] = map.toList
    val sety3: Set[(String, Int)] = map.toSet
  }
}
