package scala.bili.c07Collection

import scala.collection.mutable

/**
 * @author Lisa
 * @time 2023/6/26 - 12:07
 * @description
 */
object Scala05_Collection_Map_mutable {
  def main(args: Array[String]): Unit = {
    //TODO 集合-Map映射
    //构建可变Map集合
    val map = mutable.Map("b"->2,"c"->3)

    //TODO 增删改查
    map.put("b",4)  //改

    map.update("a",9) //增

    map.remove("c") //删
    //map.clear() //全删

    println(map.mkString(", "))
    map.foreach(println)

    val iterator_key: Iterator[String] = map.keysIterator
    val iterator_val: Iterator[Int] = map.valuesIterator


    //TODO Option: 按照key获取value
    //获取的结果类型为Option类型，表示选项类型
    //这个类型只有两个对象可以选择
    // Some: 有值  获取真是结果
    // None：无值  获取发生错误  -- 避免空指针异常
    val maybeInt: Option[Int] = map.get("a")
    val maybeNone: Option[Int] = map.get("d")

//    if(maybeNone.isEmpty){
//      println("没有结果")
//    }else{
//      println("获取结果")
//    }
    println(maybeNone.getOrElse(0))

    println(maybeInt.get)  //Option.get!!!!!!!!!!


    //Map集合为了操作方便，也提供蕾西getOrElse的方法
    val result = map.getOrElse("d",0)
  }
}
