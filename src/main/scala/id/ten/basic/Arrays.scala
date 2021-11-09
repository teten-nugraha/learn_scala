package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/8/2021, Monday
 * */
object Arrays {

  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);

  def main(args: Array[String]): Unit = {
    myarray(0) = 20
    myarray(1) = 20
    myarray(2) = 20
    myarray(3) = 20
    println(myarray)
    for(x <- myarray) {
      println(x)
    }

    for(i <- 0 to (myarray.length-1)){
      println(myarray(i))
    }
  }

}
