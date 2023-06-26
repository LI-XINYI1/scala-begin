package scala.bili.c07Collection

import scala.collection.mutable

/**
 * @author Lisa
 * @time 2023/6/26 - 11:57
 * @description
 */
object Scala03_Collection_Set_mutable {
  def main(args: Array[String]): Unit = {
    //可变Set集合，用包名进行区分
    val set1 = mutable.Set(1,2,3,4,5,6)
    val set2 = mutable.Set(1,2,3,4)

    //TODO 增删改查
    //set集合没有append,insert -- 没有顺序的概念
    set2.add(5)
    //set集合没有位置概念，修改只是对数据状态
    set2.update(5,false)
    set2(5) = true  //会被编译成上面的样子，简写

    set2.remove(2)



  }
}
