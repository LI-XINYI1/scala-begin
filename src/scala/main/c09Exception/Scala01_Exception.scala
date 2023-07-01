package scala.main.c09Exception

/**
 * @author Lisa
 * @time 2023/7/1 - 16:19
 * @description
 */
object Scala01_Exception {

  def main(args: Array[String]): Unit = {
    /*
    TODO 异常

    java中的异常Exception（ != 错误Error）：
      两大类：【编译期异常（提示性异常）】 + 【运行期异常】
    Exception是【类】，所有异常都有【对象】，所有对象都是在【运行时】构建的
    异常是为了提供程序的健壮性robustness
    所谓的编译期异常其实就是根据异常的解决程度难易，提示给开发人员
          （运行期异常，eg找不到文件，无法通过代码解决）
    如果提示了异常，但没有处理（try，catch），需要将异常抛出去，throws给上级解决

    异常存在范围概念，捕捉异常也存在范围概念

    scala的异常处理： 和java相似，但有区别
    1. scala的异常【没有分类】，所以没有throws关键字
    2. scala的异常处理类似于模式匹配中的【类型匹配】
        捕捉异常是，无需考虑异常范围。但是如果先捕捉范围大的异常，其他异常就捕捉不到，没有意义
     */
    try{
      val i=0
      val j=10/i
    } catch{
      case ex: ArithmeticException => {
        println("Arithmetic exception: "+ ex.getMessage)
      }
      case ex: Exception => {
        println("Exception: "+ ex.getMessage)
      }
    }

    //要在java调用scala时
    @throws[Exception]
    def test() = {
      throw new Exception()
    }

  }
}
