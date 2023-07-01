package scala.main.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 11:37
 */
object Scala07_Object_Instance {
  def main(args: Array[String]): Unit = {
    /* TODO 实例化 - 对象
    1. 通过new构建对象
    2. 反射 构建对象
    3. clone
    4. 反序列化
    5. ！！！scala使用object关键字构建【单例对象】
    6. !!! scala有一个方法可以构建对象，实际上采用的是new，但编译器可以【动态识别】
          apply方法可以省略： 动态识别 -- 即使不写，编译器也知道  （语法糖syntax candy）
          集合对象基本都采用apply构建
     */
    println(Scala07_Object_Instance)

    val user = User.apply()
    println(user)
  }

  class User{}
  object User{
    def apply(): User = new User()
  }
}
