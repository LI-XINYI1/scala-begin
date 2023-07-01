package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 16:40
 * @description
 */
object Scala12_Collections_Func_sortBy {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //TODO 排序sortBy
    val list = List(1,3,2,4,11,25,22)
    //sortBy方法表示将数据集中每一条数据按照指定规则进行排序
    //sortBy方法传递一个参数，参数类型为函数类型：Int => B
    //  Int：数据集的每一条数据
    //  B：  排序的标记(数字：小到大，字符串：按每一位比较的)
    //sortBy按照标记，对数据进行排序,默认升序
    val newlist_int = list.sortBy(
      num => num
    )
    val newlist_str = list.sortBy(
      num => num.toString
    )
    println(newlist_int) //List(1, 2, 3, 4, 11, 22, 25)
    println(newlist_str) //List(1, 11, 2, 22, 25, 3, 4)

    //TODO 降序sortBy-柯里化
    //sortBy默认升序，如果要降序，需要传递第二个参数列表
    //println(newlist_int.reverse) //底层两次排序，浪费时间
    //sortBy方法存在函数科利华，可以传递多个参数列表
    val newlist_rev = list.sortBy(num=>num.toString)(Ordering.String.reverse) //在排序过程中，反转规则
    println(newlist_rev)

  }
}
