package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 13:11
 * @description
 */
object Scala07_Collection_Test {
  def main(args: Array[String]): Unit = {
    //TODO 大写首字母
    println(firstToUpper("lisi"))
    println(firstToUpper(null))
    println(firstToUpper("")) //.StringIndexOutOfBoundsException
  }
  def firstToUpper(str:String): String = {
    //包装成option
    val opt = Option(str)
    if(opt.isEmpty){
      opt.getOrElse("")
    }else{  //解决空指针问题！！！！！！
      val value: String = opt.get
      if(value.trim.length == 0){ //解决字符串长度问题！！！
        ""
      } else if (value.trim.length == 1){
        value.substring(0,1).toUpperCase()
      } else{
        str.substring(0,1).toUpperCase() + str.substring(1)
      }
    }

  }
}
