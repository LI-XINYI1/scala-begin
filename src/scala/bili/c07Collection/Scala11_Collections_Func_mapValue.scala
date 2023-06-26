package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 16:33
 * @description
 */
object Scala11_Collections_Func_mapValue {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //map方法可以将数据集中每一条数据转换成新的数据，放置在新集合中
    val dataMap: Map[String,Int] = Map(
      ("a",1),("b",2),("c",3)
    )
    //map方法执行前，集合的数据类型是可以明确知道的，推断出键值对，所以可以._1,._2
    // Map集合中的每一条数据就是KV键值对, KV键值对就是元组tuple（对偶）
    val newlist = dataMap.map(
      (kv:(String,Int)) => {
//        val k = kv._1
//        val v = kv._2
//        (k, v*2)
        (kv._1, kv._2*2)
      }
    )

    // TODO mapValues
    //当KV类型数据转换是，如果K不变，只是对V进行转换
    //mapValues方法需要传递一个参数，参数类型为函数类型：Int => W
    //  Int：数据集中KV类型数据的V
    //  W  : 对v处理后的结果
    val newMap = dataMap.mapValues(_*2)
    println(newMap)

  }
}
