import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.math._


object Maps {
  def main(args: Array[String]): Unit = {
    //val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

    val employees = Map(1 -> "Bob Smith",  2 -> "Sue Brown")
    /*if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))*/

    if(employees.contains(1))
      printf("Manager : %s\n", employees(1))

    val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sully Smith")
    printf("Cust 1 : %s\n", customers(100))

    customers(100) = "Tom Marks"

    printf("Cust 1 : %s\n", customers(100))

    customers(102) = "Megan Switft"

    for((k,v) <- customers)
      printf("%d : %s\n", k, v)

  }
}
