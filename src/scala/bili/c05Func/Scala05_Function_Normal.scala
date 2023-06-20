package scala.bili.c05Func

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/19 - 13:41
 */
object Scala05_Function_Normal {

    def main(args:Array[String]) : Unit = {
      // TODO 函数式变成语言-普通版
      //参数的个数: 无限制，不推荐过多

      //TODO 1. 参数个数的简化 ： 可变参数*  ~ java中参数的...
      //某些情况下，func arg可能不需要传递，可能需要，可坑传递多个
      //可变参数因为不确定，底层实现时，采用不同的数组集合实现
      def func2( name:String*) : Unit = {
        println(name)
      }
      func2() // 空集合 List()
      func2("zhangsan ") //包装数组 WrappedArray(zhangsan)
      func2("zhangsan ","lisi","wangwu")


      // TODO 1.1. 可变参数位置: 参数列表最后一项
      // TODO 1.2. 可变参数数量： 一个参数列表 至多 一个可变参数
      def func3(password: String, name: String*): Unit = {
        println(name)
      }
      //def func3(name: String*, password: Object) : Unit = {} //放前面，无法区分



      // TODO 2. 默认参数值
      // 默认参数值：如果不传递，用default value
      // 一下两个问题：
      // 1. 参数传值为null时，并不是没有传值，只是传递了一个特殊值而已
      // 2. 在一个函数中，相同含义的多个变量，容易出现起歧义
      def test (name:String , password: String): Unit = {
        // scala实现不了参数赋值，函数的参数default VAL声明，借用newpassword传值
        var newpassward = password
        if (password == null){
          newpassward = "000000"
        }
        println(s"注册用户：${name}  密码: ${newpassward}")
      }

      test("lisi",null)
      test("lisi", "123123")


      // TODO scala语法中可以给参数设定default value，调用时不需传递
      // TODO 在参数声明时，进行初始化
      def test1 (name:String , password: String = "10000"): Unit = {
        println(s"注册用户：${name}  密码: ${password}")
      }
      test1("zhangsan")
      test1("zhangsan","123123") //覆盖default value


      // TODO 3.带名参数 ：改变参数顺序
      def test2(password: String = "10000", name: String): Unit = {
        println(s"注册用户：${name}  密码: ${password}")
      }
      test2( password = "", name = "zhangsan") //如不带名，无法判断是覆盖defualt还是付给name


    }
}
