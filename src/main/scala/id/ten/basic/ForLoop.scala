package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/2/2021, Tuesday
 * */
object ForLoop {

  def main(args: Array[String]): Unit = {

    for(i <- 1.to(5)) {
      println("i using to "+i)
    }

    for(x <- 1 until(6)) {
      println("x using until "+x)
    }

    val lst = List(1,2,3,4,5,6,7,8,9)

    for(y <- lst) {
      println("y using lst "+y)
    }

    val result = for { i <- lst; if i < 6} yield {
      i*i
    }

    println("result = "+result)
  }
}
