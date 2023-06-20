package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 11:19
 */
object Scala12_Function_Inert {

  def main(args: Array[String]): Unit = {
    //TODO 惰性函数
    //函数是否在调用时马上执行
    def test():String = {
      println("function...")
      "zhangsan"
    }

    val a = test()         //function...    a一直储存着，但是没有调用； 不应该马上执行
    println("---------")   //----------
    println(a)             // zhangsan

    // 惰性函数在调用时才执行
    lazy val la = test()
    println("---------")
    println(la)
    /* output结果:
        -----------
        function...
        zhangsan
     */
  }
}
