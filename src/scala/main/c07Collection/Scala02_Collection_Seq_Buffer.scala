package scala.main.c07Collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @author Lisa
 * @time 2023/6/26 - 11:44
 * @description
 */
object Scala02_Collection_Seq_Buffer {

  def main(args: Array[String]): Unit = {
    // TODO 集合 - seq - 可变
    // scala中所有集合都有mutable和immutable两个版本
    // 1. Seq, List - 不可变
    // 2. ListBuffer - 可变
    val buffer1 = ListBuffer(1,2,3,4)
    val buffer2 = ListBuffer(5,6,7,8)

    buffer1.append(9)
    buffer1.appendAll(buffer2)
    buffer1.insert(0,0)

    buffer1.update(0,99)
    val buffer3: ListBuffer[Int] = buffer1.updated(9,88) //updated!!创建新集合

    buffer1.remove(0)

    println(buffer1)
    println(buffer3)


    // TODO mutable可变Seq和immutable的转化
    val list = List(1,2,3,4)

    val mutBuffer: mutable.Buffer[Int] = list.toBuffer
    val immtList: List[Int] = buffer1.toList
  }
}
