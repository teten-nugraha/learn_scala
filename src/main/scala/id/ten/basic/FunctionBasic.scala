package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object FunctionBasic {

  object Math {
    def add (x: Int, y: Int) : Int = {
      return x + y
    }

    def square(x: Int) = x*x
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def substract(x: Int, y: Int): Int = {
    return x - y
  }

  def multiply(x: Int, y: Int): Int = {
    return x * y
  }

  def divide(x: Int, y: Int): Int = {
    return x / y
  }

  def main(args: Array[String]): Unit = {

    println(Math.add(33,11))
    println(add(1,2))
    println(substract(1,2))
    println(multiply(1,2))
    println(divide(1,2))

  }
}
