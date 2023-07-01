package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 21:08
 * @description
 */
object Scala14_Collection_Method_reduce {
  def main(args: Array[String]): Unit = {
    /*TODO 计算
     集合不可能将所有计算全部封装，
     有些计算需要我们自己指定，然后集合帮我们执行
     将计算逻辑作为参数，传递给集合，由集合完成计算
     TODO 必须是两两计算
          两两计算后，继续进行两两计算，迭代操作
          所以数据参与计算后，得到总结果
     */
    val list = List(1,2,3,4,5)

    //  TODO reduce:
    // reduce方法实现自定义的聚合计算
    // 传递一个参数-参数类型为函数类型 （A1, A1） => A1
    //    A1 表示两两计算是，数据类型和计算结果的类型保持一致，返回值也是A1
    val result = list.reduce(
      (x:Int, y: Int) => {
        println( x + "+" + y)
        x+y
      }
    )
    val rlt_smp = list.reduce(_ + _)
    println(result)

    //reduce的底层操作就是reduceLeft
    val rlt0: Int = list.reduce(_ - _ )
    val rlt1: Int = list.reduceLeft(_ - _ )
    //  TODO reduceRight的底层实现
    // reversed.reduceLeft[B](x,y) => op(y,x))
    // 1,2,3,4,5
    // reverse to 5,4,3,2,1
    //(5,4) => 4-5 = -1;   3 - (-1) = 4 ....
    // (1 - (2 - (3 - (4 - 5))))
    val rlt2: Int = list.reduceRight(_ - _)
    println(rlt0)
    println(rlt1)
    println(rlt2)


    /*TODO 如何区分reduceLeft， reduceRight
    加括号：
    rLeft：从左边加括号  （（（1 - 2）- 3）-4）
    rRight: 从右边加括号  （1 -（2 -（3 - 4）））
     */
  }
}
