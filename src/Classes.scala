object Classes {
  def main(args: Array[String]): Unit ={
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} seys ${whiskers.getSound}")

    println(whiskers.toString())

    val spike = new Dog("Spike", "Woof", "Grrrrr")
    spike.setName("Spike")
    println(spike.toString())

    val fang = new Wolf("Fang")
    fang.moveSpeed   = 36.0
    println(fang.move)

  } // end of Main


  class Animal(var name: String , var sound: String){
    this.setName(name)

    val id = Animal.NewIdNum

    def getName() :String = name
    def getSound() :String = sound

    def setName(name: String): Unit ={
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No name"

    }

    def setSound(sound: String): Unit ={
      this.sound = sound
    }

    def this(name: String){
      this("No name", "No sound")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound")
    }

    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }
  }

  object Animal{
    private var idNumber = 0
    private def NewIdNum = { idNumber += 1; idNumber}
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound){
    def this(name: String, sound: String){
      this("No name", sound, "No growl")
      this.setName(name)
    }
    def this(name: String){
      this("No name", "No sound", "No growl")
      this.setName(name)
    }
    def this(){
      this("No name", "No Sound", "No growl")
    }

    override def toString(): String = {
      return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  }
  abstract class Mammal(val name: String){
    var moveSpeed: Double

    def move : String
  }

  class Wolf(name: String) extends  Mammal(name){
    var moveSpeed = 35.0

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
  }

} //end of Classes
