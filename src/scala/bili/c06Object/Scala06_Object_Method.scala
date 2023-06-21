package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 22:44
 */
object Scala06_Object_Method {
  def main(args: Array[String]): Unit = {
    /* TODO 方法
    类的方法 === 类中声明的函数
    方法的生命周期是和 1类 、2对象 有关
    类中的函数遵循方法的约束：函数不能重名，方法可以【重载，重写】
    访问的访问权限和属性的访问权限一致
    */
    new User().test()  //class user test...
    User.test()        //object user test...

    //简化：无参数，（）可省略; . （object）也可以省
    new User().test
    User test

    // TODO 对象构建后，可以直接使用的方法
    //1. object类中的方法可以使用
    val user = new User()
    //2. scala中的方法可以使用
    val user1 : User = new User()
    val user2 : User = new User()
    //NOTICE:
    //    方法method -   反编译后调用名称不变
    //    函数function - 反编译后调用其他东西
    println(user1.eq(user2)) //function ->反编译-> java ==
    println(user1.equals(user2)) //method: user.equals,反编译后没有变
    println(user.isInstanceOf[User])  //function ->反编译-> java isInstanceOf
    val obj:Object = user.asInstanceOf[Object] //function ->反编译-> java 强制类型转换
    println(obj)  //把user定义为object用
  }

  //伴生类
  class User {
    def test(): Unit = {
      println("class user test...")
    }
  }

  //伴生对象:
  object User {
    def test(): Unit = {
      println("object user test...")
    }
  }
}
