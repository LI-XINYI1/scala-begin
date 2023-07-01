package scala.main.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 8:24
 */
object Scala03_Function {
  def main(args: Array[String]): Unit = {

    // TODO 函数式编程语言
    // 函数的本质 就是 java中的方法
    // 反编译： out/../scala - 右键 - decompose scala a to java
    // scala源码中，方法就是函数;
    // 编译后的字节码中，函数就是方法 （private static final 原名$!）

    // 函数编译成方法时，增加了修饰符： private static final
    //      private：域内可用
    //      static: object模拟静态语法
    //      final: 不能被重写
    // 函数编译成方法时，函数名发生变化 test$1，避免和方法名重复
    def test(): Unit = {
      println("Test ...")
    }

    test()
  }
}
