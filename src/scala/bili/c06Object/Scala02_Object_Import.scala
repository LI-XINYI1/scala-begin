package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 14:54
 */
object Scala02_Object_Import {
  def main(args: Array[String]): Unit = {
    // TODO 面向对象编程
    /* Java
    导入 import
    用法：import ajva.util.*   *并不会把所有类导入
         import static java.util.XX.YY 静态导入
    用途：1. 导入类
         2. 静态导入
    分析：1. DateUtil
         2. 不方便，不好理解
     */

    // TODO Scala语言将java的语法进行扩展
    // 1. import 是可以导包
    import scala.bili.c05Func
    c05Func.testPackageC05()

    // 2. import 关键字可以在任何地方使用
    //    如果import在当前位置使用，那么其他位置不起作用 (这个大括号内)
    import java.util.Date
    val date = new Date()

    // 3.scala导入一个包中所有的类，采用下划线代替java的*

    // 4.可以将一个包中的多个类在同一行中导入
    import java.util.{List,ArrayList, Map, HashMap}

    // 5. 屏蔽类
    //    如果不同的包中有相同名称类，可以通过屏蔽方式进行编译
    import java.sql.{Date=>_, _} // =>_
    new Date()

    //6. 给类起别名
    import java.util.{HashMap => JavaHashMap}
    val map = new JavaHashMap()

    // 7. scala中import的规则
    // 以当前包为基准，导入指定子包中的类，如果找不到，再从顶级包中依次查找 ._root_.
    //println(new java.util.HashMap)
    println(new _root_.java.util.HashMap())

    //8. 有些内容无需导入
    //   java中java.lang包中无需导入
    //   scala中java.lang无需导入
    //   scala中 scala包无需导入
    //   scala中Predef（预先声明）对象的方法也无需导入， 类似静态导入

  }
}

//package java {
//  package util{
//    package HashMap{
//
//    }
//  }
//}