package scala.bili.c03Operator

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/17 - 16:29
 */
object Scala01_Operator {
  def main(args: Array[String]): Unit = {

    //TODO 双等号
    //java中双等号 -- 比较值（基本数据类型-值， 引用数据类型 - 内存地址）
    //scala中双等号 - 非空equals
    //scala比较对象的内层地址 --需要eq方法

    val name1 : String = null
    val name2 = "123"
    //println(name1 == name2) // 报错！！！！

    val name3 = new String("123") //两个不同的new String instances
    val name4 = new String("123") //地址肯定不同

    println(name3 == name4)  // true
    println(name3.equals(name4)) //true
    println(name3.eq(name4)) //false


    // TODO ++运算符
    val name : String = "zhangsan"
    // scala 没有 ++ --； 可以 += 代替

    // TODO 计算
    //（1）对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法 时，只保留整数部分而舍弃小数部分。 var r1: Int = 10 / 3 // 3 println("r1=" + r1)
    var r2: Double = 10 / 3 // 3.0 println("r2=" + r2)
    var r3: Double = 10.0 / 3 // 3.3333
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f")) // 含义：保留小数点 2位，使用四舍五入
    //（2）对一个数取模 a%b，和Java 的取模规则一样。
    var r4 = 10 % 3 // 1
    println("r4=" + r4)


    // TODO 逻辑运算与或
    // TODO 判断字符串是否非空 - java TestOper - 空指针


    // TODO 位运算符
    /**
     * 二进制运算符
     * byte => 8 bits
     * HashMap 底层结构存放
     *    存储容量必须为2的N次方，扩容时必2倍
     *    key => key.hashcode => hash => index
     *    index = hash(key.hashCode)) & (length - 1)
     * Kafka 数据放置在topic的partition中
     *    key => 取余 => partition
     *
     * 位计算 - 范围固定
     *  5... & 4 => (0, , , ,4)  只能存进两格，性能浪费
     *  5... & 长度-1  => 所有数都用到
     */

    // TODO 运算符本质
    // 在 Scala 中其实是没有运算符的，所有运算符都是方法。
    // 1）当调用对象的方法时，点.可以省略
    // 2）如果函数参数只有一个，或者没有参数，()可以省略
  }
}
