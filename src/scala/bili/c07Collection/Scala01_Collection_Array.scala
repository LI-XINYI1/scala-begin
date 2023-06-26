package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/24 - 16:01
 * @description
 */
object Scala01_Collection_Array {
  def main(array: Array[String]): Unit = {

    /* TODO Scala集合综述
    scala是面向函数式的语言，学习集合时，更侧重集合本身的功能

    数据结构上，scala的集合分为三大类：
    1. Seq: 存储有序，数据可重复
    2. Set: 存储无序，数据不可重复
    3. Map: 存储无序，KEY不可重复, VALUE可以

    数据处理上，scala的集合分为两大类：
    1. 不可变集合  scala.collection.immutable
    2. 可变集合    scala.collection.mutable
    原始数据： 处理数据时，一般从数据源获取数据，但数据的数据源一般不可以随意改变。
                        如果必须变，也是新建并替换
    原始数据如果再很多地方使用：immutable
             使用后不再保存： mutable

    String & StringBuilder
    String:        不可变字符串， 类没有提供改变其内容的方法，如果有，也是创建新的并替换旧的
    StringBuilder: 可变字符串，   可以改变自身内容

     */

    /* TODO 集合 - 数组
    java中数组不算集合： java中的集合有自己的类型（数组中元素的类型） String[] strs = new String[3], Int[]
                      ...   对比  ArrayList<String>
    scala中数组也是对象： scala是完全面向对象的语言，万物皆对象
         数组的类型：Array[T]    T: 泛型
         Array本质是java的数组[]
     */

    //TODO 数组的基本操作： 创建
    val array = new Array[String](3)
    println(array)  //[Ljava.lang.String;@6537cf78

    // TODO  apply()初始化数组
    //集合在构建是希望同时增加数据（初始化时），而不是之后改（增加）
    //apply进行了new的操作
    val arrayInitApply: Array[Int] = Array.apply(1,2,3,4)
    //apply可以被编译器自动识别，可省略
    val arrayInit: Array[Int] = Array(1,2,3,4)

    // TODO 创建多维数组
    var myMatrix = Array.ofDim[Int](3,3)
    myMatrix.foreach(list => println(list.mkString(", ")))
    myMatrix.foreach(list => list.foreach(println))

    //TODO 创建 并 填充 指定数量的数组
    val arr4: Array[Int] = Array.range(0,10)
    val arr5: Array[Int] = Array.fill[Int](5)(-1)
    println(arr4.mkString(", "))
    println(arr5.mkString(", "))


    //TODO 数组的基本操作： 增删改查
    //Array没有 !!添加!! 和 !!删除!! 的能力，只能通过索引的方式修改数据
    //Array访问时的索引操作采用小括号（）

    //改
    array(0) = "zero"
    array(1) = "one"
    array(2) = "two"

    //查1: 索引
    println(array(0))
    //查2: 将数组中的数据生成字符串
    println(array.mkString(", "))
    //查3: 循环的方式
    for(str <- array){
      println(str)
    }
    //查4：用面向对象的方式实现循环操作
    //    foreach( funArg: String => Unit)方法的作用是将集合中的每一条数据进行处理
    //             处理逻辑不固定，由开发人员自己决定
    //             有一个参数，参数的类型是函数类型functional object： String => Unit
    def foreachFunction(str: String): Unit = {
      println("****" + str)
    }
    array.foreach(foreachFunction)
    //简化：函数作为参数使用时，参数名称很重要，函数名称不重要，可以省略
    //简化：至简原则！！！！！！
    array.foreach(
      str => println("****" + str)
      //println("****" + _)   //报错：参数简化成_时，不可以嵌套使用！！！
    )
    array.foreach(println(_))   //这样就不算嵌套使用
    array.foreach(println)


    // TODO Array其实是不可变数组immutable
    val arrayImmu = Array(1,2,3)

    //添加数据不会改变自身，会产生新的数组！！！！！！
    //用运算符方式调用集合对象的特殊符号方法
    //    如果用:结尾，运算规则为从右向左
    val arr1: Array[Int] = arrayImmu .+: (5)  //：结尾，  右到左，加在头
    val arr2: Array[Int] = arrayImmu .:+ (6)  //：非结尾，左到右，加在尾

    arrayImmu.foreach(println)
    println(arrayImmu eq arr1)  //false; 比较内存地址
    println(arrayImmu eq arr2)  //false;

    println(arr1.mkString(", ")) //5, 1, 2, 3
    println(arr2.mkString(", ")) //1, 2, 3, 6

    val arr3 = arr1 ++: arr2
    println(arr3.mkString(", ")) //5, 1, 2, 3, 1, 2, 3, 6


    //TODO 合并数组
    val arr6: Array[Int] = Array.concat(arr1,arr2)
    println(arr6.mkString(", "))
  }
}
