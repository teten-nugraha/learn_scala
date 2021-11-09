package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/8/2021, Monday
 * */
object Lists {

  val mylist: List[Int] = List(1,2,3,4,5)
  val names: List[String]  = List("Una","App","Abu")

  def main(args: Array[String]): Unit = {
    for(name <- names){
      println(name)
    }

    for(x <- 0 to mylist.size-1){
      println(x+1)
    }

    println(0 :: mylist)
    println(mylist)
    println(names)
    println(mylist.head)
    println(names.tail)
    println(mylist.reverse)

    names.foreach(coba)

  }

  def coba(value:String): Unit = {
    println("value dari list ini adalah "+value)
  }

}
