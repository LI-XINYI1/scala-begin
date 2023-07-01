package scala.main.c07Collection

import scala.collection.mutable

/**
 * @author Lisa
 * @time 2023/6/26 - 21:49
 * @description
 */
object Scala17_Collection_parallel{
  def main(args: Array[String]): Unit = {


    //TODO 并行计算 - 同时计算，多个线程
    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }
    val result2 = (0 to 100).par.map { case _ =>
      Thread.currentThread.getName
    }
    println(result1)
    println(result2)
  }
}
