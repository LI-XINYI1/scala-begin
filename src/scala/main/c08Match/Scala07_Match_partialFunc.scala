package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/27 - 10:02
 * @description
 */
object Scala07_Match_partialFunc {

  def main(args: Array[String]): Unit = {
    /*
    TODO partial function偏函数
    全函数： 功能函数会对对象数据集中的所有数据进行处理
    偏函数： 功能函数会对对象数据集中【满足条件的】数据进行处理
     */

    val list = List(1,2,"3",4)

    //功能：数字加一，字符串不要
    // 1. 全函数方法
    val newlist1 = list.filter(_.isInstanceOf[Int]).map{
      case i: Int => i+1
    }
    //2.偏函数方法: 本质是模式匹配, collect关键字
    val newlist2 = list.collect{ case i: Int => i+1  }
    println(newlist2)
  }
}
