package scala.main.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 15:36
 */

// 伴生类
class Scala03_Object_Class{

}

// 伴生对象
object Scala03_Object_Class {

  def main(args:Array[String]): Unit = {

    /* TODO 类
     scala 和java的class语法大同小异
     1. scala源码中所有声明的类都可以使公共的
     2. 使用object关键字也可以声明类，但是同时会产生另外一个对象的类
        主要目的是为了模拟静态语法

       TODO 对象名称（类名），方法
     使用object关键字可以编译成2个文件，欧冠了
     一般情况下，将java中的【成员】方法和属性声明 在 object声明类中
     一般情况下，将java中的【静态】方法和属性声明 在 object声明另外一个类（$）类中
      TODO 将object声明的类称之为   伴生类companion，
           将object声明的对象称之为 伴生对象companion object
     伴生类 & 对象 可以存在在同一个源码文件里
     IDEA工具会动态识别伴生类 & 对象

      TODO 成员方法 vs 静态方法 : test/TestThread.class
     */

  }
}
