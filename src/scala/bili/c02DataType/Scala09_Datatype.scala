package scala.bili.c02DataType

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/17 - 15:57
 */

object Scala09_Datatype {

  def main(args: Array[String]): Unit = {

    //TODO 0. java数据类型 - 两大类
    //1. 基本数据类型 （不是面向对象）
    //2. 引用数据类型 （面向对象）

    //TODO 1. SCALA是一个完全面向对象的语言，没有基本数据类型的概念
    //所有基本数据类型在scala中有专门的类
    val b : Byte = 10
    val s : Short = 10
    val age : Int = 10
    val age1 : Long = 10
    val age2 : Float = 10
    val age3 : Double = 10
    val age4 : Char = 10
    val age5 : Boolean = true

    // TODO 2. SCALA数据类型也分为2大类
    // 一切数据都是对象， 都是Any的子类

    // 1. 任意的值类型 - AnyVal ~ java基本数据类型
    // Unit 表示方法只有返回值，只有一个对象 :()
    // StringOps : 和字符串相关的一个类型
    println(test())

    // 2. 任意的引用类型 - AnyRef
    // 所有java类、scala集合、scala类都是引用类型
    // 引用类型取值为空时，一般赋值为null，但null本身也应有类型Null， 也表示对象
    val name : Null = null

    // 3. Nothing
    // 异常处理，无法返回任何东西

    // TODO 3. Any
    //val ierror : Int = null   //null不能赋值给AnyVal
    val s2 : String = null //null可以赋值给AnyRef

    val i1 : Int  = 10
    val s1 : String = "abc"

    val a1 :AnyVal = i1
    val b1 : AnyRef = s1
    val c1 : Any = a1


    // TODO 4. IMPLICIT Conversion

    /** Byte 和 Int 两个类型间没有任何关系，本来不应该能够转换
     * scala底层对类型进行了转换，所以代码上看不出来，叫implicit conversion
     * In java:
     *  String s = "123"
     *  Integer i = Integer.parseInt(s)
     *  转换：byte -> short -> int ; char -> int  (char不能和byte,short,int等转)
    */
    val b2 : Byte = 10
    val i2 : Int = b2

    // TODO 5. 显示转换 - 强制转函数（高精度->低精度）
    val i3 : Int = b.toInt
    // 所有类型都提供toString，可以直接转换为字符串
    val s3 : String = "Hello" + i3
    // str 可以强制转成shuzhi toFloat, toShort. toDouble, toByte
    val i4 : Int = s3.toInt

    // TODO 6. char
    // 常量const是可以在编译时计算的，不涉及运行时的类型转换
    // （在out里的s9_datatype.class里，直接就是c4 = 'B'）
    val c4: Char = ('A' + 1)  //idea有标红，但可以正确运行 'B' - 自动类型提升
    println(c4)
    // 这个a是变量，a+1在编译时计算，报错
    // val a: Char = 'A'
    // val c4error: Char = (a+1)
    // println(c4error)
  }

  def test() : Unit = {}

  def testNothing() : Nothing = {
    throw new Exception()  //异常
  }
}
