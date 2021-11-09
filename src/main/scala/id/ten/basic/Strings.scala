package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/4/2021, Thursday
 * */
object Strings {

  val num1 = 75
  val num2 = 100.24

  val str1 : String = "Ini adalah string"
  val str2 : String = "hello"

  def main(args: Array[String]): Unit = {

    println(str1)
    println(str1.length)
    println(str1.concat(str2))

    println("%d -- %f -- %s".format(num1, num2, str2))
  }

}
