package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 8:07
 */
object Scala01_Function {

  def main(args: Array[String]) : Unit = {

    // TODO 函数式编程语言
    /**
     * 1. scala中函数并不是数学函数 -- 功能的封装
     *    java中 功能的封装  称作 方法
     * 2. java中方法在scala中就是函数，但是声明在类中的函数叫方法
     *    函数只在当前作用域有效，但是方法收到类的约束
     * 3. 函数就是功能的封装 -> 功能名称不能重复， 没有overwrite。overload概念
     *    方法属于类，可能存在类的重写、重载
     */
    val s = "zhangsan"
    val newString = s.substring(0,1).toUpperCase() + s.substring(1)
    println(newString)

    // TODO 函数声明和使用
    // 声明  => def 函数名 （参数列表） ： 返回值类型 = {函数体}
    // 使用  => 函数名（参数）

    // TODO 函数式变成语言
    // 函数 vs 方法
    // 1. 函数可以什么在任何位置，方法只能声明在类中
    def test() : Unit = {  // 函数
      println("test function ...")
    }
    // 如果函数名称和方法名称相同，default调用函数。如果没有函数，调用方法
    // 方法和对象相关， 函数独立使用
    test() //func函数： 独立使用
    this.test()  // method方法： this - 类的调用
  }

  def test(): Unit = {  //方法
    println("test method...")
  }
}
