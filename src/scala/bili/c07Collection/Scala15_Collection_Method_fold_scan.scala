package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 21:33
 * @description
 */
object Scala15_Collection_Method_fold_scan {
  def main(args: Array[String]): Unit = {
    /*TODO 计算2
    reduce方法用于将数据集中数据进行两两聚合；
    TODO fold
    fold方法将数据集和外部的数据进行聚合， 也是两两
    fold方法存在函数curry，两个参数列表
    1. 计算初始值
    2. 参数类型为函数类型，表示计算逻辑 (A1,A1)=>A1
        A1表示两两计算的数据类型，表示计算结果类型要一致
     */
    val list = List(1,2,3,4)
    val i:Int = list.fold(5)(_ - _)
    //fold底层是foldLeft
    val j:Int = list.foldLeft(5)(_ - _)
    //TODO foldRight的底层实现：
    //reversed.foldLeft(z)(x,y) => op(y,x))
    // 1,2,3,4  + z=5  =>  5,4,3,2,1
    // (1 (2 (3 (4 5))))  初始值放在集合的右边，从右边加括号
    val k:Int = list.foldRight(5)(_ - _)
    println(i) //-5
    println(j) //-5
    println(k) //5


    //TODO scan扫描
    //可以将fold,foldLeft,foldRight的执行过程记录下来
    println(list.scan(5)(_ - _) )
    println(list.scanLeft(5)(_ - _))  //List(5, 4, 2, -1, -5)
    println(list.scanRight(5)(_ - _)) //List(3, -2, 4, -1, 5)
  }
}
