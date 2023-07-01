package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/27 - 9:55
 * @description
 */
object Scala06_Match_caseClass {
  def main(args: Array[String]): Unit = {

    //TODO 模式匹配 - 匹配对象

    //普通的对象无法在模式匹配中使用：
    //  需要通过对象获取其属性 TODO unapply方法

    //TODO case class() 样例类
    //scala提供简单方式实现匹配过程
    //在class前加关键字：case； 并传递参数，用于匹配属性
    //1. 样例类的构造参数会自动作为类的属性，default不能改名，用val声明
    //      如果想改变，用var声明
    //2. 样例类是一个普通类，只不过可以应用在模式匹配中用于匹配对象
    //3. 样例类声明很简单，但编译后会自动产生大量方法，由编译器完成
    //4. 样例类自动实现 可序列接口（构建、迭代、euaqls、copy、hashCode
    //5. 样例类存在伴生对象companion object，存在apply，unapply
    val user = thirdPart()
    user match{
      case User("zhangsan", 30) => println("thsi is correct user")
      case _ => println("this is NOT what we want")
    }

  }

  case class User(name: String, var age:Int)

  def thirdPart() = {
    User("zhangsan", 30)
  }

  object TestMatchUnapply {
    def main(args: Array[String]): Unit = {
      val user: User = User("zhangsan", 11)
      val result = user match {
        case User("zhangsan", 11) => "yes"
        case _ => "no"
      }
      println(result)
    }
  }
}
