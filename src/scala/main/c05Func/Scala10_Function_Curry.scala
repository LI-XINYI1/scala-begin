package scala.main.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 10:45
 */
object Scala10_Function_Curry {

  def main(args: Array[String]): Unit = {

    //TODO 函数柯里化Curry
    def test( a: Int, b: Int): Unit = {
      for (i <- 1 to a) {
        println(i)
      }
      for (i <- 1 to b) {
        println(i)
      }
    }

    val a = 10  // 10 min 得到a执行结果
    val b = 20  // 60 min 得到a执行结果

    //函数的参数之间可能没有关系，
    //如果在传值时，同时传递，就有耦合性，而且增加等待时间
    test(a,b)

    // 所谓柯里化，就是为了将函数简化，将无关的参数进行分离；可以【设定多个参数列表】
    def test_curry (a: Int)(b: Int): Unit = {
      for (i <- 1 to a) {
        println(i)
      }
      for (i <- 1 to b) {
        println(i)
      }
    }
    val inToUnit: Int => Unit = test_curry(10) //传入a，等第二个值
    test_curry(10)(20)  //类似嵌套函数


  }
}
