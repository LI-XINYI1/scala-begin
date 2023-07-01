package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 0:54
 * @description
 */
object Scala02_Collection_Seq {
  def main(array: Array[String]): Unit = {
    // TODO 集合-Seq序列
    //有序：插入顺序
    //可重复

    //TODO 构建
    //seq集合需要指定泛型T
    //    构建类型type JavaHashMap = java.util.HashMap[String,String]
    // !!! Seq 是一个 TRAIT, 无法直接构建对象  val seq = new Seq[Int]()错误
    //     1. 一般采用伴生对象companion object的apply方法
    //     2. 底层采用的是List集合，也可用List构建
    val seq: Seq[Int]  = Seq.apply(1,2,3,4)
    val seq1: Seq[Int] = Seq(5,6,7,8)
    val list1  = List.apply(1,2,4,3)
    val list2 = List.apply(5,6,7,8)

    //TODO ::向集合中天极爱数据，从右向左计算
    //List() 空集合 == Nil
    val list6 = 1::2::3::4::List()  //List().::(4).::(3)..... ::表示添加在前
    val list7 = 1::2::3::4::Nil     //output: 1,2,3,4
    println(list6)


    //TODO 基本操作
    //Seq, list集合默认default使用时是不可变immutable的
    //所以常用数据操作方法都是 ！！特殊符号！！
    list1 .:+(5)
    list1 .+:(6)
    list1.++:(list2)
    val list3 = list1 :+ 5 //产生新集合
    val list4 = 5 +: list1//产生新集合

    val list5 = list1.updated(0,6) //updateD, 产生新的
    //list1.update(0,100) //update,更改原来的（Array）， list没有update

    println(list3)
    println(list3 eq list4) //false

    println(list1(0)) //索引
    println(list1.mkString("."))
    list1.foreach(println)


    val list8 = 9::list2::list1 //list2整体当做数据
    val list9 = 9::list2:::list1 //list2的元素加入list9
    println(list8.mkString(", "))
    println(list9.mkString(", "))
    println(list8.length) //6
    println(list9.length) //9
  }
}
