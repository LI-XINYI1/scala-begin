package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 16:32
 */

object Scala08_Function_closure {

  def main(args: Array[String]): Unit = {


    // TODO 如果一个函数使用了外部的变量，但是改变了这个变量的生命周期
    //      将这个变量包含到当前函数的作用域内，形成闭合的效果（环境）
    //      这个环境称之为【闭包环境】  （函数式编程重要概念）

    def outer(x: Int) = {
      def inner(y: Int) = {
        x+y
      }
      inner _
    }

    // 压栈
    // outer执行完后，弹栈，回收内存
    val inner = outer(10)
    // 调用inner，压栈； 但outer不能没/弹，还需要x值
    val result = inner(20)
    println(result)


    /*
    闭包的版本，不同scala版本不一致
    v2.12前，闭包使用匿名函数类
    v2.12后，闭包使用改变函数的声明完成的

    总结：闭包的场景
    1. 内部函数使用了外部数据，改变数据的生命周期
    2. 将函数作为对象使用，改变函数本身的生命周期
    3. 所以匿名函数都有闭包
    4. 内部函数返回到外部使用也有闭包

     */

  }
}
