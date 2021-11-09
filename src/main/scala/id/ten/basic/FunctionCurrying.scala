package id.ten.basic

/**
 * Currying is the technique of transforming a function
 * that takes multiple arguments into a function
 * that takes a single argument
 *
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object FunctionCurrying {

  def add(x: Int, y:Int) = x + y

  def add2(x: Int) = (y: Int) => x + y

  def add3(x: Int) (y: Int) = x+y

  def main(args: Array[String]): Unit = {

    println(add(20, 10))

    println(add2(20)(10))

    val sum40 = add2(40)
    println(sum40(50))

    val sum50 = add3(50)_
    println(sum50(400))
  }

}
