package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 16:40
 * @description
 */
object Scala12_Collections_Func_sortBy_2 {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //TODO 排序
    val user1 = new User()
    user1.age = 20
    val user2 = new User()
    user2.age = 30
    val user3 = new User()
    user3.age = 40

    val list: List[User] = List(user1,user2,user3)

    //sortBy方法对数据集中的每一条数据加标记，然后排序
    // user.age就是B-排序标记/规则
    val newList = list.sortBy(user=>user.age)(Ordering.Int.reverse)
    println(newList)

    //完整写法
    val newlist_complete = list.sortBy(
      (user: User) => {
        user.age
      }
    )
  }
  class User {
    var age: Int = _

    override def toString: String = {
      s"User[${age}]"
    }
  }
}
