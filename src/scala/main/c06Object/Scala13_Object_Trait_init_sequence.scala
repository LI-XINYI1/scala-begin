package scala.main.c06Object

/**
 * @author Lisa
 * @time 2023/6/21 - 17:11
 * @description
 */
object Scala13_Object_Trait_init_sequence {
  def main(array: Array[String]): Unit = {
    // TODO 特质的执行顺序
    // 1. 将trait理解为abstract class，trait的初始化顺序应当【优先于】当前类
    // 2. 如果类同时有父类和特质，父类的初始化优先
    // 3. 如果类同时有多个特质：从左到右依次
    //    (parent >) trait (左到右) > current clas
    // 4. 如果父类和子类同时有trait
    //    parent trait > parent class > current trait > current class
    // *. 同一个构建过程中，初始化只会执行一次！！！

    val user = new User() //output: 111 222 444 333  //mytrait 111只执行一次

  }

  trait MyTrait{
    println("111")
  }
  trait MyTrait4{
    println("444")
  }
  class Parent extends MyTrait{
    println("222")
  }
  class User extends Parent with MyTrait with MyTrait4{
    println("333")
  }


}
