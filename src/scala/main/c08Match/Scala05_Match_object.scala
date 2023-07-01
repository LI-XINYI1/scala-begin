package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/27 - 9:44
 * @description
 */
object Scala05_Match_object {
  def main(args: Array[String]): Unit = {

    //TODO 模式匹配 - 匹配对象
    //匹配对象的所有属性是否完全相同
    //普通的对象无法在模式匹配中使用：
    //  因为对象的匹配其实就是属性的匹配
    //  需要通过对象获取其属性 TODO unapply方法
    val user = thirdPart()
    user match{
      case User("zhangsan", 30) => println("thsi is correct user")
      case _ => println("this is NOT what we want")
    }

  }

  //TODO case class() 样例类
  //scala提供简单方式实现匹配过程
  //在class前加关键字：case； 并传递参数，用于匹配属性

  case class User1()

  class User{
    var age: Int = _
    var name:String = _
  }

  object User {
    def apply(name: String, age: Int): User = {
      val user = new User()
      user.age = age
      user.name = name
      user
    }

    //TODO unapply
    def unapply(user: User): Option[(String, Int)] = {
      if (user == null) None
      else Some(user.name, user.age)
    }
  }

  def thirdPart(): Unit = {
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
