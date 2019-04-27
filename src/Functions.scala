import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.math._

object Functions {
  def main(args: Array[String]): Unit = {

    def getSum(num1: Int = 1, num2 : Int = 1) : Int= {
      num1 + num2
    }

    println("5 + 4 = " + getSum(5, 4))

    def sayHi() : Unit = {
      println("Hi how are you")
    }
    sayHi()

    def getSuma(args : Int*) : Int = {
      var sum : Int = 0
      for(num <- args){
        sum += num
      }
      sum
    }
    println("Get Suma " + getSuma(1,2,3,4,5,6))

    def factorial(num: BigInt) : BigInt = {
      if(num <= 1)
        1
      else
        num * factorial(num-1)
    }
    println("Factorial of 5 = " + factorial(5))

    val favNums  = new Array[Int](20)
    val friends  = Array("Bob", "Tom")
    friends(0) = "Sue--"
    println(friends(0))

    val friends2 = ArrayBuffer[String]()
    friends2.insert(0, "Phil")
    friends2 += "Mark"
    friends2 ++= Array("Susy", "Paul")
    friends2.insert(1, "Mike", "Sally", "Sam")
    friends2.remove(1, 2)


    for (i <- 0 to friends2.length - 1)
      println(friends2(i))
    for(friend <- friends2)
      println(friend)

  }
}
