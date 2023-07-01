package scala.main.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 11:26
 */
object Scala04_Function {
  def main(args : Array[String]) : Unit = {

    // TODO 函数式编程语言
    // 函数的应用：声明 + 使用
    // 函数是功能的封装 —> 功能已经按照特定规则封装了，重点在使用
    def headerUpper( s: String) :String = {
      return s.substring(0,1).toUpperCase() + s.substring(1)
    }
    val newString : String = headerUpper("zhangsan")
    println(newString)

    //函数式编程的侧重点是：
    // 函数名，输入参数，返回结果
    // TODO 函数声明

    // TODO 1. 无参，无返回值
    def func1() : Unit = { println("func1...")}
    //调用函数时，需要指明函数名称及传递的参数
    //如果函数参数列表中没有声明任何参数，可以省略小括号
    func1()
    func1

    // TODO 2. 无参，有返回值
    def func2() : String = { return "func2 : zhangsan"}
    //函数存在返回值，一般会接收
    val result2 = func2()
    println(result2)

    // TODO 3. 有参，无返回值
    def func3( name : String) : Unit = { println("func3: Name : " +name)}
    func3("zhangsan")
    // 如果函数参数只有一个，也不能省略小括号；方法可以省略作为运算符使用
    //func3 "zhangsan" //报错
    val r = 1 .+ (1) //方法  - 所有运算符都是 （自定义在类里？）
    val r1 = 1 + 1

    // TODO 4. 有参，有返回值
    def func4( name : String) : Unit = { return "func3: Name : " +name}
    val result4 = func4("lisi")

    // TODO 5. 多参，无返回值
    def func5 (name: String, age:Int) : Unit = {
      println("Name : " + name + "Age : " +age)
    }
    //函数调用时，传参的值和参数一一匹配
    // 类型、格式、顺序  匹配
    func5("zhangsan",20)

    // TODO 6. 多参，有返回值
    def func6(name: String, age: Int): String = {
      return s"Name : ${name} Age : ${age}"
    }
    val result6 = func6("zhangsan", 30)
    println(result6)
  }
}
