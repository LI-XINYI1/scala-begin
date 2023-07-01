package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 12:21
 * @description
 */
object Scala06_Collection_Tuple {
  def main(args: Array[String]): Unit = {
    /*TODO 集合-Tuple
    集合其实就是数据的容器，可以容纳数据
    如果想让无关的数据当做一个整体使用：
     1. 如果数据间有关系：生成Bean对象，对应属性  1,"zhangsan",30
     2. 如果数据类型、含义相同：使用集合 Set, Seq[Any], Array[Any]
     3. 【元组】：scala采用特殊方式将无关的数据（element）作为一个整体，组合在一起
        元组是特殊的集合，用小括号（）包含数据 声明
        元组是集合，有类型：TupleN[Classtype, ...]
        tuple有个数限制：22个 Tuple22；---  函数式编程，参数个数也是22
            tuple没有限制类型：可以集合套集合
    */
    //TODO 声明
    val t1: Tuple3[Int,String,Int] = (1,"zhangsan", 30)
    //tuple如果采用集合类型表示，可以简化
    val t2: (Int,String,Int) = (1,"zhangsan", 30)

    //TODO tuple访问
    //无法使用循环操作，因为数据间没有关系，不能采用相同的循环逻辑
    //如果想要访问其中的数据，可以采用顺序号  !!! 1开头的, max index = 元素个数
    println(t2._3)

    println(t2.productElement(0))  //用索引的方式，访问第0个（0开头的） output：1
    val it: Iterator[Any] = t2.productIterator
    while (it.hasNext) {
      print(it.next + " ")
    }


    //TODO 键值对对象
    //如果元组中元素的数量为2，称之为对偶元组/键值对对象
    val kvt1 = ("a",1)
    val kvt2 = ("b",2)

    val tupe: (String,Int) = "a"->1

    1->2->3->4 //(((1,2),3),4)

    //TODO Map集合的操作有了变化
    val map = Map(("a",1),("b",2))
    println(map)
    for(kv<-map){
      println(kv._1 + "=" + kv._2)
    }

  }


  // Bean对象，数据间有关系
  class User {
    var id: Int = _  //recap: _ sys default initiate value
    var name: String = _
    var age: Int = _
  }
}
