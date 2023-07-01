package scala.main.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 12:02
 * @description
 */
object Scala05_Collection_Map {
  def main(args: Array[String]): Unit = {
    // TODO 集合-Map映射
    //Map存储的是K-V键值对数据；无序的，K不重复
    //Map中的key关联到value
    //Map是一个trait，一般情况下，采用伴生对象的aply方法构建，default不可变

    //TODO 构建
    //scala中kv键值对可以采用特殊方式构建
    val kv = "a" -> 1
    val map = Map(kv,"b"->2,"c"->3)

    //TODO 用tuple构建Map
    val map_tupe = Map(("a", 1), ("b", 2))
    println(map)


    //TODO 增删改查
    //不可变map集合的数据基本操作还是特殊符号
    val maptest = Map("a"->1,"a"->2,"a"->3)
    println(maptest) //a->3; 等于被覆盖/update了



  }
}
