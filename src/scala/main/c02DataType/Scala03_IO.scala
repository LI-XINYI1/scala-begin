package scala.main.c02DataType


import java.io.PrintWriter
import scala.io.{BufferedSource, Source}

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/16
 */

object Scala03_IO {

  def main(args: Array[String]): Unit = {

    //TODO IO

    // 1. INPUT
    // 1.1. 从控制台获取输入的数值
    val age : Int = scala.io.StdIn.readInt() //readDouble()  readShort()
    println(age)
    // 1.2. 从文件中获取数据
    // scala中获取文件中的数据，需要用特殊object
    val source : BufferedSource = Source.fromFile("D:\\javaPrj\\scala\\scala-begin\\data\\word.txt")
    val iter: Iterator[String] = source.getLines()  //迭代器：java
    while ( iter.hasNext){
      println(iter.next())
    }
    source.close()

    // 2. OUTPUT
    // scala输出用的就是java中的操作
    val out = new PrintWriter("D:\\\\javaPrj\\\\scala\\\\scala-begin\\\\data\\\\test.txt")
    out.println("test")
    out.flush()

    out.close

  }
}
