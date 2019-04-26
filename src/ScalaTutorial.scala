object ScalaTutorial {
  def main(args: Array[String]): Unit ={
    var i = 0

    while(i <= 10){
      println(i)
      i += 1
    }
    i = 0
    do {
      println(i)
      i += 1
    } while (i <= 10)

    i = 0
    for(i <-1 to 10)
      println(i)

    val randLetters = "ABCDEFGHIJKLMNOPRSTUVWXYZ"
    for(i <- 0 until randLetters.length){
      println(randLetters(i))
    }

  }
}
