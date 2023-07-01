package scala.main.c06Object

/**
 * @author Lisa
 * @time 2023/6/21 - 16:55
 * @description
 */
object Scala12_Object_object{
  def main(array: Array[String]): Unit = {
    /*TODO 面向对象编程 - object
    object 声明的是 类， 也同时是伴生对象
    apply方法可以用于构建对象，不仅，还可以被编译器动态识别，因此可以省略
     */
    val user1 = new User() //TODO 执行类的构造方法constructor，完成对象的初始化操作
    println("*************************")
    val user2 = User //TODO 直接访问类名，其实访问的不是类，而是类的伴生对象 - 把伴生对象赋值给user2
    println("*************************")
    val user3 = User.apply() //TODO apply方法用于构建对象;
    println("*************************")
    val user4 = User() //TODO apply方法用于应用场景比较多，所以编译器可以动态识别，调用时可省略

  }
  class User{
    println("user")
  }
  object User {
    def apply():User ={
      println("user apply...")
      new User()
    }
  }
}
