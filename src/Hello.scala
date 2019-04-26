object Hello extends App{
  println("Hello, World!")

  for(i <- 1 to 13) (println(i))

  def add(a: Int, b:Int) = a+b

  val addd = (a: Int, b: Int) => a+b

  println(add(1,8))
  println(addd(9, 9))

  val f: (Any) => String = {
    case i: Int => (i / 2.toDouble).toString
    case d: Double => (d * 2).toString
    case _ => "Other"
  }
  println(f(2))

  val misc = List("adam", "alvin", "scott")
  misc.map({case s: String => println(f(s))})

  val misce = List(1, 2, 3)
  misce.map({case i: Int => println(f(i))})

  val tic = List(2,4,6,19,7)
  val cel = tic.filter({case i: Int => i % 2 == 0})
  println(cel)

  val tice = List(2,4,6,19,7)
  val ticel = tice.map({case s: Int => s > 4})
  println(ticel)

  val add1 = (a: Int) => a + 1
  val add2 = (a: Int) => a + 2

  val test1 = (add1 compose add2)(10)
  println(test1)

  val test2 = (add1 andThen add2)(20)
  println(test2)
}
