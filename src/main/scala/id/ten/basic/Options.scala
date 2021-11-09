package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/9/2021, Tuesday
 * */
object Options {

  def main(args: Array[String]): Unit = {

    val capitals = Map("France" -> "Paris", "Japan"->"Tokyo")

    println(show(capitals.get("France")))
    println(show(capitals.get("India")))

    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println(a.getOrElse(0))
    println(b.getOrElse(10))
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
