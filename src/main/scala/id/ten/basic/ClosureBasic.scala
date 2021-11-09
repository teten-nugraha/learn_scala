package id.ten.basic

/**
 * A closure is a function which uses on eor more variables
 * declared outside this function
 *
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object ClosureBasic {

  var number = 10
  val add = (x: Int) => {
    number = x + number
    number
  }

  def main(args: Array[String]): Unit = {
    number = 100
    println(add(20))
    println(number)
  }

}
