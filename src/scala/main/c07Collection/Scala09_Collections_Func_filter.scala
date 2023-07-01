package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 15:58
 * @description
 */
object Scala09_Collections_Func_filter {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //TODO filter
    //按照指定的条件，将数据进行筛选过滤
    //条件成立true，数据保留；否则false，数据删除
    //filter方法需要传递一个参数，类型为函数类型：Int => Boolean
    //  Int：数据集中的每一条数据
    //  Boolean：执行后返回的结果
    val list = List(1,2,3,4)
    val newList = list.filter(num => false)
    println(newList)


    //TODO 保留数据组的奇数
    val newList1 = list.filter(_ % 2 != 0)
    println(newList1)
  }
}
