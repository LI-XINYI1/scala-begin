package scala.main.c06Object

/**
 * @author Lisa
 * @time 2023/6/21 - 17:11
 * @description
 */
object Scala13_Object_Trait {
  def main(array: Array[String]): Unit = {
    /*TODO 接口interface
    scala没有接口的概念

    TODO 特质的本质是interface（反编译java实现）
    【特质trait】: scala可以将多个对象中相同的特征从对象中剥离出来，行程一个独立的语法结构
         如果一个对象符合这个特征（特质），那么可以将特质混入到这个对象

     //TODO 向类中混入特质的2中方式
     1. 如果存在父类：with
     2. 如果没有父类：extends
            如果需要混入多个特质，那么第一个采用extends，后面都with
       TODO 把trait理解为interface和trait的结合体

     trait可以继承类；
          在java反编译里，trait == internface， extend在class上 （Notes.md-107）
     */
    val cat = new Cat()
    println()
    cat.run()


    /*
    1. java中所有接口在scala中使用，都是当初特质用
    2. 特质的用法：再构建对象时，将新的功能混入（添加）到对象中
    TODO 开发程序一般要遵循相应的开发原则（规则）： OpenClosePrinciple
         开发程序代码时，应该对功能的扩展开发 open
                      应该对功能的修改关闭 close
     */
    val user = new User() with Update
    user.insertUser()
    user.updateUser()

  }

  //TODO 特质
  trait Run extends Exception{
    def run(): Unit
    println("trait")
  }
  class Cat extends Run{
    override def run(): Unit = {println("cat run")}
    println("cat")
  }

  trait Update{
    def updateUser(): Unit = {
      println("update user...")
    }
  }
  class User{
    def insertUser():Unit = {
      println("insert user...")
    }
  }
}
