import java.io.PrintWriter
import scala.io.Source
import java.io.BufferedWriter
import java.io.FileWriter

object Files {

  def main(args: Array[String]): Unit ={
    val path = """C:\Users\mtorbinski\Desktop\text.txt"""
    val writer = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
    writer.println("Just some random text.")
    writer.println("Some more random text.")
    writer.close()

    val textFromFile = Source.fromFile(path, "UTF-8")

    val lineIterator =  textFromFile.getLines()

    for(line <- lineIterator)
      println(line)

    textFromFile.close()
  }

}
