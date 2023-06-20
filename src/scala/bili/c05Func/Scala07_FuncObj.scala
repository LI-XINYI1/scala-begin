package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 14:28
 */

object Scala07_FuncObj {
    def main(args: Array[String]) : Unit = {

      /*
        Scala是完全面向对象的语言    -> 万物皆对象
        Scala是完全面向函数式编程语言 -> 万物皆函数

        函数也是对象
        对象也是函数
       */

      // TODO 0. 函数也是对象
      /*
        Java: 类 + 对象instance
        class User{
          private String name;
        }
        User user = new User()

        Scala: 构建/声明了一个函数，等同于声明了一个函数对象
        def test(){}
       */
      def test0(): Unit = {

      }
      //如果函数声明时，参数列表没有参数，调用时可以省略小括号
      println(test0)  //() 打印test方法(function)的执行结果
      //如果不想让函数执行，只是想访问这个函数本身 -> 采用特殊符号_进行转换
      println( test0 _ ) // scala.bili.chapter05.Scala07_Function_Hell$$$Lambda$20/0x0000000800caf778@7225790e



      // TODO  1. 函数是对象
      // 1. 对象有类型
      // 2. 对象可以赋值给其他人使用
      def test(): Unit = {
        println("test...")
      }
      def test1(age: Int): String = {
        age.toString
      }

      // 将函数对象test赋值给f （对象）
      // 此时，f可以通过编译器自动腿断了西，函数对象的类型称之为函数类型
      // Functionx[Unit]:
      //    函数列表中参数个数： 类型中的x
      //    无参数列表
      //    Unit: 无返回值
      val f: Function0[Unit] = test _
      val f_0: () => Unit = test _

      // [函数参数类型，返回类型]
      val f1: Function1[Int, String] = test1 _
      val f1_0: (Int) => String = test1 _   //当声明val类型时，已经确认为函数object，就可以不加_, = test1

      // TODO 1.1. 【函数对象】的参数最多只能有22个  Function22 （max）
      //  - 【函数】的参数无限制  def test(arg1,arg2 ...., arg22, arg23, .....)


      // TODO 1.2. 为了使用方便，函数类型可以用另外一种声明方式
      // 这里的函数类型为： Int => String  参数列表的参数类型 => 返回值类型
      val f1_1 = test1 _

      def test2 (name: String, age:Int): Unit = {}

      val f2 = test2 _ // (String, Int) => Int  小括号内一个参数可以省略↑




      // TODO 2. 函数类型的使用
      // 将函数对象赋值给一个变量，那么这个变量其实就是函数
      // 既然这个变量就是函数，所以这个变量可以传参后执行
      f() //加（），表示调用这个函数
      //f //执行没有参数列表的【函数对象】【不可以省略括号】；执行函数可以




    }
}
