//package scala.bili.c06Object
package scala
package bili
package c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/20 - 12:13
 */

object Scala01_Object_Package {

  def main(args: Array[String]): Unit = {

    // 面向对象编程
    // scala基于java开发的，基本的面向对象的语法相同
    // 但scala是【完全面向对象】的，所以很多java语法不适用。注意区分！！！

    // TODO scala：学习 语法顺序 -- 按代码开发顺序

    // TODO Package
    /* TODO package in java
      用法：包名的规则
          域名的反写 + 项目名称 + 模块名称 +程序的分类名称
          com.atguigu . gmall . user . util(service, bean)
      用途：1. 分类管理
           2. 区分类 （同名不同包）
           3. 包权限
           4. 包的路径应该和源码的存放路径相同
      分析：1. 声明一个user，含义不明确，最好见名知意，类名起得准确一点
           2. 如果可以对类名进行区分，那么其实包没有那么重要
           3. 权限不好用
           4. 包语法在执行过程中，只要从classpath环境变量中可以查找到，就应该可以
              所以和源码的物理路径没有任何关系
     */
     /* TODO package in Scala   -- 比java更丰富
        1. package 关键字可以多次声明;  。 java表示从属关系
        2. 可以给包设定作用域，体现上下级关系
        3. 将包也当做对象  package object,
           包对象中声明的属性和方法，在当前包和他的子包都可以直接使用
        4. scala中包名和物理途径无关
      */
    testPackageObject()
  }
}
