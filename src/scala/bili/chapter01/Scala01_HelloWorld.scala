package scala.bili.chapter01

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/5 - 23:57
 */
object Scala01_HelloWorld {

  /*
  package : 包
  object :  声明对象（单例）
            scala是完全面向对象的语言，但java中的静态语法不是面向对象的
            scala没有静态语法
            scala采用新的关键字object模拟静态语法， 通过对象名称实现静态操作
            如果使用object关键字声明一个对象，那么编译时同时也会编译出对应class文件

            object关键字声明的对象的类型
              - Scala01_HelloWorld$.class
            编译后的class文件
              - Scala01_HelloWorld.class  单例对象名称，同时也是类名

  def : 声明方法的关键字

  main :  scala语言程序入口方法
  main(...) : 小括号内-方法参数列表，可无，多个参数隔逗号

  args:Array[String]  : 方法参数
      java =>  String[] arg     => java是强类型语言，编译时明确类型。类型提前声明 （开发时类型不那么重要）
      scala => arg : String[]   => scala基于java开发，也是强类型语言。但参数名称更重要。 名称 : 类型

  Array[String] : 参数类型
      scala是完全面向对象的语言，数组也是对象，有自己的类型 : Array
      scala中 中括号[]中的String表示泛型

  def main : Unit
      scala语言中，方法的声明也符合scala的规则
        方法名 （参数列表） ：方法类型   （和参数一样，名称前，类型后）
      scala是完全面向对象的语言，（万物皆对象），
        方法的返回值也是对象，也应该有相应的类型！！！！！！！！！！！！！！！！！！！
            java中有void关键字，表示没有返回值，但是“没有返回值”本身也是返回，需要类型 --- Unit类型

  = : 赋值 将代码块逻辑赋值给一个方法名

  {} ： 方法体
      System,=.out.println() : java代码
        - scala 基于java开啊，java code可以在scala code中直接使用
        - scala 简化  println


   */

  def main(args: Array[String]): Unit = {
    System.out.println("Hello Java") // java
    println("Hello Scala") // scala
  }
}
