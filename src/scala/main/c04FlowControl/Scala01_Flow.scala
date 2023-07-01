package scala.main.c04FlowControl

import scala.io.{BufferedSource, Source}
import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 0:35
 */
object Scala01_Flow {

  def main(args : Array[String]) : Unit = {

    // TODO 默认情况，顺序执行

    // TODO 分支流程
    // if关键字 - 单分支
    // else - 双分支
    // else if 多分支
    val age = 40
    // scala中表达式都有返回结果RETURN
    // 这里的返回结果其实就是满足条件的最后一个代码(最后一行)的执行结果
    // 结果类型：！！所有！！分支条件返回结果的！！通用类型！！
    //         结果取值是程序运行后获取的，所以可以明确结果
    //         scala是！！强类型！！语言，需要在！！编译时！！就明确类型
    //         result类型是 String + Unit => Any 共同祖先类型
    val result : Any = if (age == 30) {
      println("age equals to 30")
    } else if ( age <= 16){
      println("age lessthan 16")
      2
    } else {
      println("unkown age") //返回结果是Unit
      //1
      2 //返回结果是2
      "zhangsan" // 返回结果是"zhangsan"
    }

    // java 中 void没有返回值
    // scala 采用Unit类型代替void，只有一个对象，打印后为（）
    println("the result of if-elseif-else is : " + result)
    //println(result + 1) // type mismatch -- Any无法加数值运算

    // scala没有三元运算符  xxx ? a : b
    // 可以用if代替
    val result1 = if (age==30) "30" else "other"


    // TODO 循环控制
    // 1. for 循环
    // 2. 增强for循环  - java: for(Object obj : Array)
    //     in scala : for (obj : Object <- Array)
    //                    ( 循环变量      <- 数据集)
    val array = 1 to 5          //包含5right bound
    val array1 = 1 until 5 by 2    //不包含5; by 加步长
    val array2 = Range(1,5,2) //不包含5， 范围集合; (起始，结束-不包含，步长)
    for ( i : Int <- array) {  //用<- 避免多个 : 歧义
      println(i)
    }
    //如果循环变量的类型可以通过循环判断出来，那么类型可以省略

    // TODO 循环守卫 : 逻辑判断
    for ( i <- array if i != 3){
      println(i)
    }

    // TODO 循环嵌套 & 引入变量- 简约
    for (i <- Range(1,5); j <- Range(1,4); k = i-1) {
      println("i= "+i+" j= "+ j )
    }
    // for( i <- 1 to 4){
    //    for( j <- 1 to 4)
    //      val k = i - 1
    //      println(j)
    // }

    // TODO 循环返回值 ： Unit
    val result_for = for ( i <- 1 to 3){
      i
    }
    print("result of for loop is "+ result_for)

    // TODO 如果想要将集合中的数据进行处理后返回，采用关键字： yield
    val result_yield = for (i <- 1 to 3) yield{
      i * 2
    }
    print("result of for loop is " + result_yield)
    // TODO java yield关键字如何在scala中调用
    Thread.`yield`()


    // TODO while循环
    /*
      while(条件表达式){
        循环体  //判读后，再打印
      }
      do {
        循环体  //先打印，再判断；至少执行一次
      }while(条件表达式)
     */
    val source : BufferedSource = Source.fromFile("D:\\javaPrj\\scala\\scala-begin\\data\\word.txt")
    val iter : Iterator[String] = source.getLines()
    while (iter.hasNext){
      println(iter.next())
    }
    source.close()


    // TODO 循环控制
    //java: break - 中断，跳出； continue - 继续下一次循环
    //scala 没有continue,break; 因为不是面向对象的，可以用其他语法代替
    //  continue 用 if else 代替
    //  break 用 面向对象 代替 ，
    //    底层会抛出异常跳出for循环。Breaks.break(): Exception in thread "main" scala.util.control.BreakControl
    //    外层应该捕捉异常 Breaks.breakable
    Breaks.breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          println(" i = " + i)
        }
        if (i == 4) {
          //return //return直接退出了main方法，不可以用
          Breaks.break()
        }
      }
    }

    //  scala通过特殊语法操作，使得代码简单
    // java 静态static导入功能  import static Uer.*;
    // import scala.util.control.Breaks._
    // breakable{
    //    for(){
    //      break
    //    }
    // }


    println("main方法执行完毕")
  }
}
