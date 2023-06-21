package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 11:37
 */
object Scala08_Object_Instance_Method {
  def main(args: Array[String]): Unit = {
    // TODO 实例化 - 对象的构造方法
    //1. java中类的构造方法默认由JVM提供的：无参，公共的
    val user = new User()
    println()
    //2. scala中类的构造方法默认由JVM提供的：无参，公共的，小括号（）可以省略
    val user1 = new User()
    println()
    //3. 如果开发人员给类提供了构造方法（任意），JVM不会提供默认的构造方法
    //4. new构建对象时，应该执行构造方法
    //5. java中：构造方法和类的名称是一样的；
    //   scala中：构造方法和类名称！！！没有关系！！！
    user.User() //调用名为User（）的普通方法
    println()
    //6. scala是完全面函数式编程语言，万物皆函数，！！【声明类等同于声明函数】！！
    //    声明类的同时，所声明的函数其实就是【构造函数constructor】(new User()),
    //                new时，函数就会执行
    //7. scala的构造函数主要功能就是类的实例化（类主题内容的执行） ！！！！！
    //8. 构造方法可以传递参数
    val userarg = new UserArg("zhangsan");
    println()


    /* TODO 构造方法的重载
    scala中的构造方法氛围2大类：
    1. TODO 主构造方法  primary constructor：负责类的初始化
    2. TODO 辅助构造方法auxiliary constructor ：
       类初始化后，完成类的辅助功能，属性赋值...
                 辅助方法必须直接/间接地调用住构造方法
                 采用this关键字声明
          辅助 - 可重载   ； 主 - 无重载概念
     */
    val user3 = new User("fuzhu-zhangsan")
    println()
    /*执行顺序
          先执行主构造方法，再“间接调用”辅助构造方法this
      output：
          111  construct User instance...
          4444                                   //类初始化部分
          construct user with name: fuzhu-zhangsan
          2222                                   //this辅助部分
     */

    // TODO 【辅助构造方法】的重载OVERLOAD
    val user4 =  new User("fuzhu-zhangsan", 10 )
    /* 执行顺序
          先执行主构造方法，再“间接调用”辅助构造方法this,this如果调用其他overwrite this，也要按顺序
      output：
        111  construct User instance...
        4444                                    //类初始化部分
        construct user with name: fuzhu-zhangsan
        2222                                    //this(name)辅助部分
        overwrite this() constructor
        3333                                //this(name,age)OVERWRITE辅助部分
     */


    /*TODO 构造方法为什么要传参数？？？
      接受外部数据 给 内部数据
      scala为了开发方便，可以在构造参数前增加var，val，让参数作为类的属性存在
      eg. class classname(var);
      !!! def this(var xxx) 不可以，这是函数！！！
     */
  }


  //无参数时，可省略（）
  class User {
    // 大括号{}里的，都是【构造函数体】
    // 同时也是         【类的主体】
    println("111  construct User instance...")


    // TODO 【辅助构造方法】
    def this(name:String){
      this()
      println("construct user with name: "+name)
      println("2222")
    }

    // TODO 【辅助构造方法】的重载OVERLOAD
    def this(name: String, age:Int) {
      this(name)  //调用上面的this(name)
      println("overwrite this() constructor")
      println("3333")
    }

    println("4444")

    //这不是构造方法， 只是恰好和类同名的普通方法
    def User(): Unit = {
      println("user instance method testtest ...")
    }
  }

  class UserArg(var name:String){
    println("construct UserArg instance..." + name)
  }

}
