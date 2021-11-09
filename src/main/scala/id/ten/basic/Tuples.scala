package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/9/2021, Tuesday
 * */
object Tuples {

  val mytuple  = (1,2,"Hello", true)
  val mytuple2 = new Tuple2(1,"hello")
  val mytuple3 = new Tuple3(true, 1, false)

  def main(args: Array[String]): Unit = {
    println(mytuple._3)

    mytuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom" -> true)
  }

}
