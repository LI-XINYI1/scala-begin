package scala.main.c07Collection

import scala.collection.mutable

/**
 * @author Lisa
 * @time 2023/6/26 - 21:46
 * @description
 */
object Scala16_Collection_queue{
  def main(args: Array[String]): Unit = {

    //TODO queue
    val que = new mutable.Queue[String]()

    que.enqueue("a", "b", "c")

    println (que.dequeue())
    println (que.dequeue())
    println(que.dequeue())


  }
}
