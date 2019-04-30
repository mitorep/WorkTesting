object Traits {
  def main(args: Array[String]): Unit = {

    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  } //end of main

  trait Flayable {
    def fly :String
  }

  trait BulletProof{
    def hitByBullet: String

    def ricochet(startSpeed : Double) : String = {
      "The bullet ricochets at speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  class Superhero(val name: String) extends Flayable with BulletProof{
    def fly = "%s flys through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }
}// end of Traits