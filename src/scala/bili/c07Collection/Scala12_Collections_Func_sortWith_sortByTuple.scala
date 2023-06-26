package scala.bili.c07Collection

/**
 * @author Lisa
 * @time 2023/6/26 - 16:40
 * @description
 */
object Scala12_Collections_Func_sortWith_sortByTuple {
  def main(args: Array[String]): Unit = {

    //TODO 功能函数（方法）
    //TODO 排序
    val user1 = new User()
    user1.age = 20
    user1.money = 1000
    val user2 = new User()
    user2.age = 30
    user2.money = 1500
    val user3 = new User()
    user3.age = 40
    user3.money = 2000
    val user4= new User()
    user4.age = 20
    user4.money = 3000

    val list: List[User] = List(user1,user2,user3,user4)

    //TODO 先按照年龄顺序排序，相同年龄按金额排序
    //sortBy方法对数据集中的每一条数据加标记，然后排序
    //尝试两次sortBy， 但第二个sortby会覆盖第一次的，变成按money排序
    //val newList = list.sortBy(user=>user.age).sortBy(user=>user.money)

    /*TODO sortBy方法只是告诉集合排序的维度，但是具体数据的排序过程由集合本身完成
           sortWith方法来完成两个数据的大小判断，让集合根据判断结果进行排序
      sortWith方法需要传递一个参数，类型为函数类型：(User,User) => Boolean
        User: 集合中用于比较的两个User对象
        Boolean：预计的排序结构的判断值：true-预想的结果，false-不是预想的结果
     */
    val newlist = list.sortWith(
      (user1, user2) => {
        //年龄的升序(小->大)
        //年龄的降序(大->小)
        if(user1.age > user2.age){
          true
        }else if(user1.age == user2.age){
          user1.money < user2.money
        }else{
          false
        }
      }
    )
    println(newlist) //List(User[40, 2000], User[30, 1500], User[20, 1000], User[20, 3000])

    /* TODO Tuple排序
    如果scala的排序规则如下：
    先按第一个数据排序
    如果数据相同，再按第二个数据排序，
    如果数据相同，再按第三个数据排序，以此类推

     默认情况下，sortBy为升序排列,用第二个参数（柯里化：(Ordering.Tuple2(Ordering.Int,Ordering.Int.reverse))
     */
    val newlist_tuplesort = list.sortBy(
      user => {
        (user.age, user.money)
      }
    )(Ordering.Tuple2(Ordering.Int,Ordering.Int.reverse))
    println(newlist_tuplesort) //List(User[20, 3000], User[20, 1000], User[30, 1500], User[40, 2000])


  }
  class User {
    var age: Int = _
    var money: Int = _

    override def toString: String = {
      s"User[${age}, ${money}]"
    }
  }
}
