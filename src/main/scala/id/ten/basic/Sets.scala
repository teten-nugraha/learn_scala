package id.ten.basic

/**
 * @author : TetenNugraha
 * @created : 11/8/2021, Monday
 * */
object Sets {

  val mylist: Set[Int] = Set(1,2,3,4,5,5,5,5)
  val mylist2: Set[Int] = Set(1,2,9,7,1,2,3)
  val names: Set[String]  = Set("Una","App","Abu")

  def main(args: Array[String]): Unit = {

    println(mylist + 3)
    println(names)
    println(names("Apps"))
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.intersect(mylist2))

    for(name <- names) {
      print(name)
    }
  }
  
}
