package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/27 - 0:45
 * @description
 */
object Scala03_Match_tuple_assignment {
  def main(args: Array[String]): Unit = {

    //TODO 模式匹配的简化 - 解构赋值
    val t = (1,"zhangsan", 30)
    val (id, name, age) = (1,"zhangsan", 30)




    val dataMap = Map(
      (("a",1),123),(("b",2),435),(("c",3),234)
    )
    //TODO 转换数据结构，再进行分组
    //((str,int),int) to (str,(int,int))
    // toList: 防止相同key，值被覆盖

    //老办法
//    dataMap.toList.map(
//      t => {
//        (t._1._1,(t._1._2,t._2))
//      }
//    ).foreach(println)

    //TODO 小括号在匿名函数中表示参数列表，无法直接作为模式匹配的元组规则 直接这样报错((strletter,num),cnt)
    //      map的参数列表中只有一个参数，那么会发生错误
    //      如果想要使用模式匹配来匹配元组，需要使用关键字case明确告诉编译器
    //      map的（） 变成 {}
    dataMap.toList.map {
      case ((strletter, num), cnt) => {
        (strletter, (num, cnt))
      }
    }.foreach(println)
  }
}
