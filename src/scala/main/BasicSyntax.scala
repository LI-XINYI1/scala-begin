package scala.main

/**
 * @ClassName:
 * @Description:
 * @author: Lisa
 * @date: 2023/6/15 - 9:46
 */
object BasicSyntax {
  def main(args: Array[String]): Unit = {

    //3.3. List
    // List is IMMUTABLE:
    // when call a method on list, it CREATES AND RETURNS A NEW list with NEW value
    val List1 = List(1, 2, 3)
    val List2 = List(3, 4, 5)
    //1) concatenation
    val concatList = List1 ::: List2
    println(concatList)
    //2) cons :: prepend on right operand
    val prependList = 1 :: List2
    println(prependList)
    //2.2.) INITIALIZE new list with conos operator
    val newList = 1 :: 2 :: 3 :: Nil
    println(newList)
  }

  //3.4. tuples    ~~ JavaBean-like class in Java
  // 1) can contain different types of elements; immutable
  //   useful when returning multi objs form a mtd  ~~ JavaBean-like class in Java
  // 2) Tuple2[Int,String] in Scala
  val pair: (Int, String, Int, Int, Int, Int) = Tuple6(99, "a string in tuple", 1, 1, 1, 1)
  // 2) actual type of a tuple depends on num of eles and types
  // eg.Tuple6[Char,Char, String, Int, Int, String]                 ------------------------infinite Tuple_x, how do Scala define it
  println(pair._1) // 1-based ONE ONE ONE ONE ONE ONE ONE ONE ONE ONE
  println(pair._2)
  // 3) NO .apply on tuple
  //    .apply only returns same type,  => NO pair(0) in tuple


  //3.5. Sets & Maps

  // IMmutable set
  var petSet = Set("dob", "cat")
  //    return a new immutable set with element added
  petSet += "bird" //petSet = petSet + "bird"
  val mo = (petSet + "bird")
  println(petSet.contains("bird"))

  //Mutable set

  import scala.collection.mutable

  val movieSet = mutable.Set("hitch", "poltergeist")
  movieSet += "Shrek"
  println(movieSet) //No APPLY in set
  assert(Set(1, 2) equals Set(2, 1, 1))

  // IMmutable map
  val romanNumeral = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV"
  )
  println(romanNumeral(4))

  //MUtable map
  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island")
  treasureMap += (6 -> "Dig.")
  println(treasureMap(6)) // apply in map
}
