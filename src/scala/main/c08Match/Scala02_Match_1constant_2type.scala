package scala.main.c08Match

/**
 * @author Lisa
 * @time 2023/6/26 - 21:58
 * @description
 */
object Scala02_Match_1constant_2type {
  def main(args: Array[String]): Unit = {
    // TODO 模式匹配 - 规则匹配
    //TODO 1. 匹配常数
    def describe(x: Any) = {
      x match {
        case 10 => println("age is 10")
        case 20 => println("age is 20")
        case _ => {
          println("default, other value")
        }
      }
    }

    val result = describe(5)

    //TODO 2.匹配类型
    //1. 如果所以规则都不匹配，会查找下划线的分支
    //   如果想用下划线所代表的值，一般会给下划线起名字
    //TODO 泛型 _ 下划线
    //2. 类匹配是，不考虑！！！泛型！！！， Array除外
    //      因为Array的泛型不是真正的泛型
    //      真正的泛型只在编译时有效，而Array的泛型在运行时也有效
    //3. 如果case后直接写类型，并不表示类型匹配，而是对象匹配 case Int=>"Int"
    def describe2(x: Any) = {
      x match {
        case i: Int => println("Int value")
        case s: String => println("I am String")
        case c: Array[Int] => println("Array[Int]")
        case m: List[_] => println("List")  //_表示泛型
        case someThing => println( "something else " + someThing)
      }
    }

    val result_int = describe2(5)
    val result_str = describe2("String")
    val result_arr_str = describe2(Array("1", "3"))  //something else [Ljava.lang.String;@366e2eef

  }
}
