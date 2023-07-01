package scala.main.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 15:14
 */
object Scala07_FunctObj_asARG_asRET {

  def main (args: Array[String]) : Unit = {

    // TODO 1. 将函数对象作为变量赋值使用


    // TODO 2. 将函数对象作为参数使用
    def func():Unit = {
      println("test...")
    }

    //def test( f : Function0 => Unit ) : Unit = {}
    def test( f : ()=>Unit ) : Unit = {
      f()
    }

    val f = func _  //val f_0 : () => Unit = func
    test(f)


    // TODO 2.2. 规则定义好，但内层逻辑不确定（f未知，可灵活改变）
    // 将函数对象作为参数使用，类似于将逻辑进行传递，意味着逻辑可以不用写死了
    def test1 (f:(Int,Int) => Int): Unit = {
      val result = f(10,20) //f return type is Int
      println(result)
    }

    def sum(x:Int,y:Int):Int = {x+y}
    def diff(x:Int,y:Int):Int = {x-y}


    // TODO 2.3.下划线的省略
    // 将函数名称直接作为参数传递给另一个函数时， 不需要使用下划线_
    // 使用下划线的目的：不让函数执行，作为对象使用
    //               当明确知道函数不执行时，可省略下划线
    test1(sum _)
    test1(diff)


    // TODO 2.4.函数名称作为函数参数使用时 - 不重要
    //                    参数名称    -- 很重要
    // 如果函数名称不重要，传参时，可以省略函数名称

    // TODO 2.4.1.如果函数没有名称和def，那么是匿名函数，一般作为参数使用
    test1(
      (x:Int,y:Int) => {
        x+y
      }
    )

    // TODO 2.4.2. 匿名函数作为参数使用时，可以采用【至间原则】
    // 1. 匿名函数的逻辑代码只有一行，大括号可以省略
    test1(
      (x: Int, y: Int) => x + y
    )
    // 2. 匿名函数参数类型如果可以推导，参数类型省略
    test1(
      (x, y) =>  x + y
    )
    // 3. 匿名函数中如果参数列表的格式只有一个，小括号可以省略
    // 4. 如果匿名函数中参数按照【顺序】只执行【一次】的场合，可以使用下划线代替参数，省略参数名称和箭头
    //    第一个_表示第一个参数，以此类推   syntax sugar
    test1(
       _ + _
    )

    // practice: calculator
    def calc ( x : Int, f : (Int,Int) => Int, y : Int): Int = {
      f(x,y)
    }
    def +(x:Int, y:Int) = { x+y }
    def -(x:Int, y:Int) = { x-y }
    val result = calc(5,+,3)
    println(result)
    // 简化 - 匿名
    val result_simp = calc(5, _ + _, 3)




    // TODO 3. 将函数对象作为返回值使用
    // 函数的返回值类型一般情况下不声明 -- 自动推断
    def outer() = {
      def inner(): Unit = {
        println("inner...")
      }
      inner _
    }
    //此时，f_out就是一个函数对象，有函数类型 () => Unit
    val f_out = outer()
    //函数对象加（）表示执行
    f_out()
    outer()()

  }
}
