package scala.bili.c07Collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author Lisa
 * @time 2023/6/25 - 15:32
 * @description
 */
object Scala01_Collection_ArrayBuffer {
  def main(array: Array[String]): Unit = {

    //TODO 集合 - mutable可变数组
    val array = new ArrayBuffer[Int]()
    val arr1 = Array(5,6,7)

    // TODO 增加
    val unit: Unit  = array.append(1,2,3,4)
    val unit1: Unit = array.appendAll(arr1)
    array.insert(0,9)

    // TODO 删除
    array.remove(0) //from index
    array.remove(0,2) // from index, remove #Num of elements

    // TODO 改
    array.update(3,6)
    val newArr = array.updated(0,1000) //.updated()会创建新的集合

    // TODO 查
    array.mkString(",")
    array.foreach(println)
    array.apply(0)

    // TODO scala中！！！自定义的集合类型！！！ 打印后可以直接出现数据
    println(array)
    println(newArr)


    // TODO mutable可变数组和immutable的转化
    val mutableA = ArrayBuffer(1,2,3,4)
    val immutableA = Array(5,6,7,8)

    val buffer: mutable.Buffer[Int] = immutableA.toBuffer
    val arrayIm: Array[Int] = mutableA.toArray
  }
}
