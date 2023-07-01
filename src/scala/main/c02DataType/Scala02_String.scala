package scala.main.c02DataType

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/16
 */

object Scala02_String {

  def main(args: Array[String]): Unit = {

    /** TODO 1.字符串
     * scala中没有字符串，使用的就是JAVA的STRING
     * scala String = java.lang.String
     */
    val name : String = "Lisa"
    val age: Int = 20
    //TODO 2.拼接
    println(name + " " + age )
    //2.2. %传递值拼接
    printf("name= %s age=%d\n",name,age)
    //2.3. 插值拼接;  必须加s
    println(s"name=${name}")
    println(s"name=${name.substring(0,3)}") //{}内可以加函数
    //println(s"{\"name\": \"${name}",\s"age\":${age}")  //插值不能拼接JSON字符串！！

    //2.4. 多行字符串， |默认顶格符,可改.stripMargin("其他")
    val multilineS =
      """
        | hello
        |scala
        |""".stripMargin
    println(multilineS)

    val multilineS2 =
      """
        #hello
        #scala#
        #""".stripMargin('#')
    println(multilineS2)

    val JSONstring =
      s"""
        |{"name":"${name}", "age":"${age+2}"}
        |""".stripMargin
    println(JSONstring)

    val SQLstring =
      s"""
         |select
         |  *
         |  from user
         |  join (
         |    select * from student
         |  )
         |  where id=1
         |""".stripMargin
    println(SQLstring)

    //String有乘法
    val dup = "zhangsan"
    val newDup = dup*2
    println(newDup)

  }
}
