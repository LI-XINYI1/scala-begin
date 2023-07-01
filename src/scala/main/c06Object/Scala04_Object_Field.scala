package scala.main.c06Object

import scala.beans.BeanProperty

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 17:06
 */
object Scala04_Object_Field {
  def main(array: Array[String]): Unit = {
    /* TODO 属性 : 类中的变量   【属性的底层是方法 - set，get调用】
    1. scala中给类声明属性 === 给类声明变量
    2. 变量使用var,val声明
    3. 变量类型如果可以推断出来，那么可以省略
    4. 变量必须【显示】的初始化  、
          Java中属性可以默认初始化，所以属性赋值可以不写
          scala中属性必须明确初始化
          可以采用【下划线】进行赋值，表示由系统进行【默认初始化】，只能对var属性用
    */
    val user = new User()

    val usergean = new UserBean();
    usergean.getName();

  }

  //使用val声明类的属性，在编译时，会给属性增加final关键字
  //类的属性在编译时，都是PRIVATE权限
  // --【虽然private，但仍然可以访问--访问的是该属性的get，set方法（在底层）】
  //   类的属性在编译时，会同时生成公共的get, set方法（名字不是set，get开头）
  //      当访问属性时，等同于调用对象的属性的get方法
  //      当给属性赋值时，等同于调用对象的属性的set方法
  class User{
    var name: String = "zhangsan"
    val age:Int = 30
    var height : Int = _
    val email = "zhangsan@gmail.com"
  }

  /*
  java中Bean对象有Bean开发规范
      属性私有化，提供公共的set，get方法，方法以set，get开头
  scala 中对象属性不遵循Bean规范，这样，和其他框架集成的时候，会出现很多问题
   为了和其他框架相互集成，scala提供一个注解，解决Bean规范的问题

   增加@BeanProperty 注解的属性不能声明private使用
   */
  class UserBean {
    @BeanProperty var name: String = "zhangsan"
    private var age: Int = 30   //priavte age无法被main中访问 -- set,get也被private了
    var height: Int = _
    val email = "zhangsan@gmail.com"
  }


  // TODO 权限  [test/TestAccess]
}
