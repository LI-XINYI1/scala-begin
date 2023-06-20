package scala.bili.c05Func

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 16:47
 */
object Scala09_Function_abstract {

  def main(array: Array[String]): Unit = {

    //TODO 函数式编程语言 - 控制抽象
    //抽象： 不完整
    //抽象类：不完整的类 - 抽象方法；不完整的方法
    def test( f: ()=>Unit): Unit = {
      f()
    }
    /*
    抽象： 函数类型只有返回，没有输入的场合
     调用时，不使用（）
     传值时， 需要进行控制
     */
    def testAbs(f: => Unit): Unit = {
      f
    }


    //调用完整函数
    // TODO 完整的参数传递，是将函数对象作为参数进行传递
    test(
      () => {
        println("test")
      }
    )

    // TODO 控制抽象: 将代码作为函数进行传递
    //      自定义语法时，可以采用控制抽象；代码是传递的，逻辑是变化的
    testAbs(
      println("test abstract")
    )


    // TODO 循环中断的代码  -  体现控制抽象
    // breakble 是个函数 def breakalbe( op: => Unit)
    // 如果参数跨越多行，可以将小括号改成大括号
    breakable{
      for (i <- 1 to 5) {
        if (i == 3) {
          break()
        }
        println("i=" + i)
      }
    }



    // TODO 控制抽象可以实习自定义语法
    def mywhile(cond : => Boolean)( op : => Unit): Unit = {
      if(cond){
        op
        mywhile(cond)(op)
      }
    }
//    val age = 30
//    mywhile(age == 30){
//      println("age = 30")
//    }



  }
}
