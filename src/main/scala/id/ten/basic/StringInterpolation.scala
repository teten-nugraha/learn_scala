package id.ten.basic

object StringInterpolation {

  def main(args: Array[String]): Unit = {
    val name: String = "mark"
    val age:Int = 18

    println(name + " is "+age+" years old")
    println(s"$name is $age years old")
  }

}
