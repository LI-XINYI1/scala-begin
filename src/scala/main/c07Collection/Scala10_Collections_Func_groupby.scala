package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 16:17
 * @description
 */
object Scala10_Collections_Func_groupby {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //TODO groupby
    //groupby可以将数据集中的每一条数据安装指定的规则进行分组
    //groupby方法需要传递一个参数，参数类型为函数类型：Int => K
    //  Int：数据集中每一条数据
    //  K： 数据分组的标记，执行操作后，相同的标记会放在一起，标记没有固定写法
    //groupby方法的执行结果会返回Map集合
    //Map集合中的Key表示分组标记，Value表示相同标记的数据集合
    val list = List(1,2,3,4,5,6,7)
    val groupMap: Map[String,List[Int]] = list.groupBy(
      num => {
        if (num%2 == 0){
          "even"
        }else{
          "odd"
        }
      }
    )
  val groupMap2 = list.groupBy(_ % 2)
  println(groupMap2) //Map(1 -> List(1, 3, 5, 7), 0 -> List(2, 4, 6))
  }
}
