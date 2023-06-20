package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 10:55
 */
object Scala11_Function_Recursion {
  def main(args: Array[String]): Unit = {

    //TODO 递归的基本原则：函数自己调用自己

    /* TODO StackOverFlowError 栈溢出
      Java在执行方法调用时，会将方法进行压栈处理；方法执行完，会有弹栈处理；
      如果方法没执行完，调用其他方法，那么方法栈空间会下压
      如果越压越多，栈空间不够，发生溢出操作
     */
    def test(): Unit = {
      test()
      println("test...")
    }

    test()

    //TODO 递归函数应有跳出递归的逻辑
    //TODO 递归函数传递参数时需要有规律
    //TODO 递归函数【不能省略返回类型】； Scala中泛型的返回值类型不能省略
    //example. 阶乘
    def test1(num: Int): Int = {
      if(num<=1){
        1
      } else{
        num * test1(num-1)
      }
    }

    test1(5)

    /*
    栈（5M）
    栈帧（1kb）：往栈空间里压的方法的执行运存大小
     */
    // TODO java的栈内层大小有限制，不可能无限压栈
    // 如果压栈的次数超过阈值，就会出现错误，即使有跳出逻辑也可能出错
    // Scala采用特出语法优化递归操作：【尾(伪)递归】

    //TODO 尾递归
    //Scala采用while循环实现尾递归(不是真正的递归)
    //把递归放在最后一行：下一个函数对本函数运行没有影响
    def test2(): Unit = {
      println("test...")
      test2()
    }



    /* TODO 栈内层溢出: 没有足够内存分配栈空间（内存）  VS 栈溢出(stackOverflow)
    java中的内层，堆内层，方法区内存只有一个，但栈内层可以有多个
    一个线程 就是一个 独立栈内存
     */
  }
}
