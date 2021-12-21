package pwGenerator

object Main:
    def main(args: Array[String]): Unit =
        println(Generator.generatePW( scala.io.StdIn.readLine("> ").toInt ))