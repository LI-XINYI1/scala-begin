package scala.main.c02DataType

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/5 - 23:57
 */

object Scala01_Var {

  def main(args: Array[String]): Unit = {
    /**
     * 变量：引用； Scala中声明变量需要采用特殊方式
     * Java => 变量类型 变量名称 = 变量值
     *          String  name  = "daima“
     // TODO 1. 声明变量
     *  Scala
     *    1. var, val
     *    2. var/val 变量名 ： 变量类型 = 值
     *    3. scala中变量鄙俗 ！！显示地！！ 初始化
    */

    // TODO 3. var --- val
    // var 可变变量 （var存储的地址可以改变）
    var name : String = "daima"
    // val 不可变变量 （val存储的地址不可变，但地址指向的instance可能可以变）
    val email : String = "daima@111.com"

    name = "shuxue"
    // email = " waibibabu @ 111.com"

    // TODO 2. 使用（访问）变量
    println(name)
    println(email)

    /** TODO 4.scala原则1： 至简原则
     * 类型推导： 声明变量时，类型可以省略，编译器可以自动推导 【多态 object不能自动声明，要手动】
     * 变量声明时必须有初始值
     * 强数据类型语言： 确定类型后不能修改
     *
     * TODO 5.命名 - 标识符
     * （1）以字母或者下划线开头，后接字母、数字、下划线
     * （2）以操作符开头，且只包含操作符（+ - * / # !等） --不要$ (java编译后 eg : = $colon)
     * （3）用反引号`....`包括的任意字符串，即使是 Scala 关键字（39 个）也可以
     * （4）数字不能开头，不能有-，避免'"$开头, 避免[]{}()
     */


  }
}
