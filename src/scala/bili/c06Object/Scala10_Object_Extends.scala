package scala.bili.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 15:21
 */
object Scala10_Object_Extends {
  def main(array: Array[String]): Unit = {
    /*TODO 面向对象编程 - 继承
    scala的继承和java是一致的
    1. 存在父子类
    2. 主要目的是为了复用功能和数学
    3. scala中类的继承和java的继承是一样的，也是【单继承】，不能多继承（歧义）
              --由于多继承产生的歧义，成为【钻石问题】
    4. 构造对象时，!!!!父类对象优先于子类!!!!'
    5.如果父类的constructor存在参数，需要【显示地】调用父类的构造方法+参数
     */
    val s = new Student(20) //output: person \n student
    //原因： 初始化student时，先初始化extend的父类person

    /*
    5.如果父类的constructor存在参数，需要【显示地】调用父类的构造方法+参数
    6. constructor构造方法存在访问权限，可以设定为私有的
          -- 注意：不代表class是私有的，private class XX() 表示class私有不是constructor
          需要在参数列表（主构造函数）前增加private关键字： class ClassName private {}
       如果类构造方法私有化private，如何构建对象
       1、辅助构造方法
       2. 采用伴生对象，可以访问伴生类中的private内容
    */
    val a = Animal.apply("dog")
    val a2 = Animal("cat")

  }

  class Animal private(var name:String){
    println(name + "animal")
  }
  object Animal{
    def apply(name:String): Animal = new Animal(name)
  }



  class Person(age: Int){
    var name : String = _
    println("person")
  }

  class Student(age:Int) extends Person(age){
    println("studnet")
  }

  class Teacher(age: Int) extends Person(30) {  //(age)可省略
    println("teacher")
  }
}
