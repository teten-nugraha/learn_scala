package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object MatchExpression {

  def main(args: Array[String]): Unit = {

    val age  = 50

    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 50 => println(age)
    }

    val i = 7

    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }

}
