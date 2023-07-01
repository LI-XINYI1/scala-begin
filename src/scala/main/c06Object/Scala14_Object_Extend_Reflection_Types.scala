package scala.main.c06Object

import java.lang.reflect.Field

/**
 * @author Lisa
 * @time 2023/6/24 - 15:17
 * @description
 */
object Scala14_Object_Extend_Reflection_Types {
  def main(args:Array[String]):Unit = {
    /* TODO 比较两个对象 - 反射
    有类型信息了，再得到方法、属性。。。。
    java: String.class => 类型信息 => Class => 方法区
    scala: classOf[User] => 类型信息 => Class => 方法区
     */
    val userClass : Class[User] = classOf[User]
    userClass.getFields
    print(userClass)

    /* TODO 用反射改变val String
    String类型的字符串表示【不可变】字符串
    String没有提供任何改变其内容的方法，但可以通过【反射】修改
     */
    val name: String = " a b "

    val stringClass: Class[String] = classOf[String]
    //获取字符串底层的数组   "value": private byte[] 定义在java.lang.String里的储存地址
    val field: Field = stringClass.getDeclaredField("value")
    //绕过正常验证机制，拿到private的值
    field.setAccessible(true)
    //取出数组的值
    val charArray = field.get(name).asInstanceOf[Array[Char]]
    charArray.update(2,'c')

    println("!!! "+name)


    //TODO 枚举类
    println(Color.RED)
    println(Color.RED.id)


    //TODO type定义新类型
    type MyHashMap = java.util.HashMap[String,String]
    print(new HashMap())
  }


  class User {
    var id: Int = 100

  }


  // TODO 枚举类
  // id CANNOT duplicate
  object Color extends Enumeration{
    val RED = Value(1,"red")
    val BLUE = Value(2,"blue")
  }

  // TODO 应用类
  object AppTest extends App{
    println("app")
  }

  //TODO type定义新类型
  class HashMap{

  }
}
