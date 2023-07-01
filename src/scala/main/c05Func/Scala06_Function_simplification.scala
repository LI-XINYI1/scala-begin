package scala.main.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 14:00
 */
object Scala06_Function_simplification {
  def main(args: Array[String]): Unit = {

    // 函数式编程语言 - 噩梦版
    /**
     * Scala作者martin为了开发人员更便捷地开发程序，简化很多代码
     * 如果编译器可以动态识别的语法，那么开发人员不需要编码，课省略
     * 体现【至间原则】
     */
    def test() : String = {
      return "zhangsan"
    }

    // TODO 1.如果函数体中的逻辑代码需要返回，课省略return关键字
    //        scala中所有表达式可以直接将满足条件的最后一行代码逻辑的结果作为返回值
    def test1(): String = {
      "lisi"
      "zhangsan"
    }

    // TODO 2. 如果逻辑代码只有一行，可省略大括号
    def test2() : String =  "zhangsan"

    //TODO 3. 如果能从通过返回值推断出返回值类型，可以省略返回值类型
    def test3() = "zhangsan"

    // TODO 4. 函数的参数列表中没有声明参数，小括号可省略
    // 如果省略参数列表的小括号，那么调用时也不能添加
    def test4 = "zhangsan"
    // println(test4())
    println(test4)

    //因为省略了很多语法内容，变量声明和函数声明很像，必须用关键字区分

    // TODO 5. 如果逻辑代码中有return，但是函数声明为Unit，则return不起作用
    // TODO 6. 如果省略Unit，等号需要同时省去
    // 此时如果想要省略Unit，那么会发生错误
    // 如果既省略Unit，又不希望发生错误，需要将等号同时删除
    def test5(): Unit = {
      return "zhangsan"
    }
    println(test5()) //output ()

    def test6() {  //不加等号 - 肯定没有返回值； 默认这个函数就是用来执行的
      return "zhangsan"
    }
    println(test6())


    // TODO 7. 匿名函数： 函数名不重要时，def和函数名可以省略
    // 1. def和函数名 省略
    // 2. 返回值类型也省略 - 逻辑代码自动推断
    // 3. 等号需要增加大于号表示关联
    () => {
      return "zhangsan"
    }

    //注意不能嵌套使用
    // eg. println( _ + "result") 不行
      //以下可以：
      // tesr(println(_))   -- 至简原则最短形式
      //      ===  test(println)  --不是至简原则，恰好有println默认函数
      // _.substring(0,1) // 放在外层用
  }

}
