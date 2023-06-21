package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 16:06
 */
object Scala11_Object_Abstract {
  def main(array: Array[String]): Unit = {
    /*TODO 抽象
    抽象方法：不完整的方法 - 只有声明，没有实习
    抽象类：不完整的类  - 类中包含方法，如果方法不完整，那么类也不完整
          类不完整，无法直接构建对象;
          子类继承后，补充完整，再构建
    */
    // val user = new User()  //abstract class cannot be initialized
    val childUser = new ChildUser()



    /*
    一个类如果有抽象方法，那么这个类式抽象类
    如果一个类式抽象类，这个类不一定有抽象方法；

    如果父类的方法为抽象abstract，子类的方法如果重写，只需要补充完整即可
    如果父类的方法为完整方法，     子类的方法如果重写，需要增加特殊关键字overwrite
     */

    /*TODO 抽象属性
    如果类的属性只有声明，没有初始化， -- 抽象属性
    属性是类的一部分，部分不完整，整体也不完整 - 类应该为抽象类
    如果想构建类，需要通过子类构建，并且将不完整属性补充完整
    */
    /* TODO 抽象属性的本质
    1. 编译器再编译时，抽象属性不会编译为属性，而是属性对应的set,get两个抽象方法
    2. 子类再编译时，就是实现了属性的 get，set方法
    3. 本质上，属性的抽象 还是 方法的抽象
    4， 完整的属性在scala有重写overwrite的概念，本质上还是方法的重写】
        可变变量（var）是不能被重写的

     -- scala类的方法和属性都有overwrite概念
     -- java类的 方法      有overwrite概念，属性没有
     */
    val user = new ChildUser()
    println(user.name)
  }

  abstract class User{

    //TODO 抽象属性
    var name: String

    //TODO 完整属性的子类重写[val] (var不能被重写)
    val age: Int = 30

    //TODO 抽象方法：不完整的方法（只有声明，没有实现）
    def test():Unit
  }
  class ChildUser extends User{
    var name: String = "zhangsan"
    override val age : Int = 40
    override def test(): Unit = {}
  }


}
