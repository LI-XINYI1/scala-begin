package scala.main.c05Func

import scala.main.c06Object.Scala05_Object_Access.User

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 22:37
 */
object Scala13_Function_Object_Access {
  def main(args: Array[String]): Unit = {
    //不同包，调用user
    val user = new User()
    //println(user.name) //private
    //println(user.age) //pivate[] 不同包
    //println(user.email) //protected:不同类，不父子类
    println(user.address) //公共

  }
}
