package scala.main.c06Object

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/21 - 15:15
 */
object Scala02_Object_Import_Object {
  def main(args: Array[String]): Unit = {

    //引入对象
    //println方法从来没有声明过，但是可以直接调用
    // Scala默认导入Predef，类似于静态导入
    // scala中使用objct声明的对象其实是模拟静态语法，但本质是一个对象
    // 所以这里其实就是导入对象
    println("zhangsan")
    Predef.println("wan zhang xie fa")

    val user = new User()
    // TODO 导入对象的所有内容
    // 这里的对象必须用val声明
    import user._
    test()
  }

  class User{
    def test(): Unit = {
      println("user...s")
    }
  }
}
