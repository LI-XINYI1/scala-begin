package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/26 - 21:58
 * @description
 */
object Scala01_Match {
  def main(args: Array[String]): Unit = {
    /* TODO 模式匹配
    匹配：匹配数据的规则
    模式：特定写法的规则 setXXX
    java： switch; scala: if平替
    scala基于switch的思路，增加了对数据进行数据校验的语法 - 模式匹配

    scala使用match管啊金子
    每一个规则用case进行声明，如果成功，执行case后续的逻辑代码
    代码执行完毕，匹配结束，不会有穿透现象（scala没有break）
    多个规则匹配不成功， default，下划线表示任意值

    细节：
    1. 逻辑代码只有一样，可以省略大括号；但需要明确执行完毕后自动跳出
    2. java的switch语法，case关键字和defualt关键字存在先后顺序
       scala没有defualt关键字，如果将_下划线分支放在最前面，会！！优先执行！！有顺序！！
    3. scala模式匹配的主要作用是按照指定规则对数据进行匹配
       如果数据没有任何匹配，报错：scala.MatchError
     */
    val age = 20
    age match{
      case 10 => println("age is 10")
      case 20 => println("age is 20")
      case _ => {
        println("default, other value")
      }
    }

    //赋值给result
    var a: Int = 10
    var b: Int = 20
    var operator: Char = 'd'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}
