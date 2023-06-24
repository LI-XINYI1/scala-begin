package scala.bili.c06Object

/**
 * @author Lisa
 * @time 2023/6/24 - 15:17
 * @description
 */
object Scala14_Object_Extend_isInstanceOf {
  def main(args:Array[String]):Unit = {
    /* TODO 面向对象编程 - 比较两个对象
    1. scala 和 java，很少两个objects内存，多进行内容属性的比较
    2. scala ==   是 非空equals判断 （这里equals默认内存比较）
        所以比较对象需要重写、自定义equals方法
     */
    val user1 = new User()
    user1.id = 1001
    val user2 = new User()
    user2.id = 1001
  }
  class User {
    var id: Int = _

    override def equals(other: Any): Boolean = {
      // 重写equals时： 先判断类型是否相同
      //              如果不同，转换类型
      //TODO  obj1.isInstanceOf[ obj2]  判断类型
      if(other.isInstanceOf[User]){
        //TODO  obj1.asInstanceOf[ obj2]  转换类型
        val otherUser = other.asInstanceOf[User]
        this.id == otherUser.id
      } else{
        false
      }
    }
  }
}
