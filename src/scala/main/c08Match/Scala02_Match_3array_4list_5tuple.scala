package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/26 - 21:58
 * @description
 */
object Scala02_Match_3array_4list_5tuple {
  def main(args: Array[String]): Unit = {
    //TODO 模式匹配 - 规则匹配
    //TODO 3.匹配数组
    for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello", 90))) { // 对 一个数组集合进行遍历

      val result = arr match {
        case Array(0) => "0" //匹配 Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的 x, y
        case Array(0, _ *) => "以 0 开头的数组" //匹配以0 开头和数组
        case _ => "something else"
      }
      println("result = " + result + " ||| " + arr.mkString(" "))
    }


    //TODO 4,匹配列表
    //list 是一个存放List 集合的数组
    //匹配 List(88) 这样的只含有一个元素的列表,并原值返回.应该怎么写 ???
    for (list <- Array(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 0, 0),
      List(88))) {
      val result = list match {
        case List(0) => "0" //匹配 List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的 List
        case List(0, _*) => "0 ..."
        case obj: List[Int] => "oritinal value is " + obj
        case _ => "something else"
      }
      println(result)
    }


    //另一种方式
    //val list: List[Int] = List(1, 2, 5, 6, 7)
    val list: List[Int] = List(1, 2)
    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }
    //output: 1-2-List(5, 6, 7)
    //output: 1-2-List() 空list



    //TODO 5.匹配元组tuple
    //对一个元组集合进行遍历
    for (tuple <- Array(
      (0, 1),
      (1, 0),
      (1, 1),
      (1, 0, 2))) {
        val result = tuple match {
          case (0, _) => "0 ..." //是第一个元素是 0 的元组
          case (y, 0) => "" + y + "0" // 匹配后一个元素是 0 的对偶元组
          case (a, b) => "" + a + " " + b
          case _ => "something else" //默认
        }
    println(result)
    }
  }
}
