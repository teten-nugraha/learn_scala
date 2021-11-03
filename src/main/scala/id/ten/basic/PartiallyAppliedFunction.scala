package id.ten.basic

import java.util
import java.util.Date

/**
 * @author : TetenNugraha
 * @created : 11/3/2021, Wednesday
 * */
object PartiallyAppliedFunction {

  def log(date: Date, message: String) =
    println(date + " "+message)

  def main(args: Array[String]): Unit = {

    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _:Int, _:Int)
    println(f(100,200))

    val date  =new Date
    val newLog = log(date, _:String)

    newLog("The Message 1")
  }

}
