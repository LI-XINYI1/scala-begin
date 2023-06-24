package scala.bili.c06Object

/**
 * @author Lisa
 * @time 2023/6/21 - 17:45
 * @description
 */
object Scala13_Object_Trait_execute_sequence {
  def main(array: Array[String]): Unit = {
    /* TODO 特质的执行顺序
    类混入特质时，也存在钻石问题 - scala采用一种特殊的方式来解决
    1. 为什么混入特质：
          增加约束， 功能的补充和叠加
    2. 如果混入多个相同的功能，需要一个【执行顺序】，否则出现问题

    TODO scala如何解决钻石问题：功能叠加
    scala将多个功能混入在一起，按照特定顺序进行叠加调用
    这里的特定执行顺序是：初始化顺序的反向操作
     */

    val operation = new Operation()
    operation.op1  //output: 3 2 1
    /* 解释：
    要初始化operation，先从左到右初始化traits
    step1. 初始化op2
       要先初始化op2的继承类op1
    step2. 初始化operation的Op2右边的trait op3
       op3 extend op2，但发现已经初始化过了，在同一个构建过程中不会重复初始化
     所以：初始化顺序：1,2,3
          执行顺序 = 反向初始化（用户从最外层一层层得调用super（上一级）） = 3,2,1
     */

    //TODO 跳过一层层找，改变执行顺序
    // super[上层trait名字].方法名
  }

  trait op1 {
    def op1(){
      println("1")
    }
  }

  trait op2 extends op1{
    override def op1(): Unit = {
      println("2")
      super.op1() //super表示上一级  （~~不是父类~~
    }
  }

  trait op3 extends op2{
    override def op1():Unit =  {
      println("3")
      super.op1()
      //TODO 跳过一层层找，改变执行顺序
      // super[上层trait名字].方法名
      //super[op2].op1()
    }
  }

  class Operation extends op2 with op3{ // 重复功能

  }


}
