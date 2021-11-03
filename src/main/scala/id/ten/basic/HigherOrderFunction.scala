package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object HigherOrderFunction {

  def math(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]): Unit = {

    val result = math(50, 20, 10, (x,y) => x min y)
    val result2 = math(50, 20, 10, _+_)
    println(result2)
  }

}
