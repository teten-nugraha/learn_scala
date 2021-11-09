package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/9/2021, Tuesday
 * */
object Maps {

  val myMap: Map[Int, String] = Map(
    801->"max",
    802 -> "Coba",
    803 -> "XXX"
  )

  def main(args: Array[String]): Unit = {
    println(myMap)
    println(801)
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach { key=>
      println("key "+key)
      println("value "+myMap(key))
    }
  }

}
