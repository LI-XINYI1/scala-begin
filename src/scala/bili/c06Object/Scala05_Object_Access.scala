package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 22:29
 */
object Scala05_Object_Access {

  // TODO 访问权限
  /* Scala 有四种不同权限 - 和java一致
  1. private:   私有的，   同类
  1. private[包名]: 包私有，同类，同包(子包也能用)
  3. protected: 受保护权限，同类，   ，子类
  4. (default):    公共，  同类，同包，子类，所以类
   */

  class User{
    private var name: String = "siyou"
    private[c06Object] var age: String = "baosiyou"
    protected var email: String = "baohu"
    var address: String = "gongkai"  //default

    def test(): Unit = {
      val user = new User()
      println(this.name)
      println(this.age)
      println(this.email)
      println(this.address)
    }
  }

  class Emp{
    def test(): Unit = {
      val user = new User()
      //println(user.name) //private
      println(user.age) //同包
      //println(user.email) //protected:不同类，不父子类
      println(user.address) //公共
    }
  }

  //父子类
  class Student extends User {
    def test1(): Unit = {
      val user = new User()
      //println(user.name) //private
      println(user.age) //同包
      //println(user.email) //protected:父子类
      println(user.address) //公共
    }
  }
}


//子包
package subchapter06{

  import scala.bili.c06Object.Scala05_Object_Access.User

  class SubClass {
    def test(): Unit = {
      val user = new User()
      //println(user.name) //private
      println(user.age) //同包,子包也可以用
      //println(user.email) //protected:不同类，不父子类
      println(user.address) //公共
    }
  }

}