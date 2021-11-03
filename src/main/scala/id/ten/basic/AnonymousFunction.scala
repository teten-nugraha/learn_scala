package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object AnonymousFunction {

  object Math {
    def +(x: Int = 45, y: Int = 2):Int = {
      x+y
    }

    def **(x: Int) = x*x
  }

  def print(x: Int, y: Int): Unit = {
    println(x+y)
  }

  def main(args: Array[String]): Unit = {
    print(100,200)
    println(Math.+(90,10))
    println(Math.**(3))

    // anonymous function

    var add = (x: Int, y: Int) => x + y
    println(add(300,100))
  }

}
