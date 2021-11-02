package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/2/2021, Tuesday
 * */
object Looping {

  def main(args: Array[String]): Unit = {
    var x = 0

    while(x < 10) {
      println(x+1)
      x +=1
    }

    var y = 0
    do {
      println("y = "+y)
      y += 1
    }while(y <= 10)
  }
}
