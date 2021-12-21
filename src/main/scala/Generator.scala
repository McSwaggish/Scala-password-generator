package pwGenerator

object Generator:
    def generatePW(length: Int): String =
        import scala.util.Random.nextInt

        val pw: Array[Char] = new Array[Char](length)

        val capLetters: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val noCLetters: String = "abcdefghijklmnopqrstuvwxyz"
        val digits:     String = "0123456789"
        val specChars:  String = "!\"#%&/()=?@${[]},.-;_:'*^|<>"

        val availableChars: String = capLetters + noCLetters + digits + specChars

        pw(0) = (capLetters + noCLetters).charAt( nextInt( (capLetters + noCLetters).length ))

        for i <- 1 until length do
            pw(i) = availableChars.charAt( nextInt( availableChars.length ))

        pw.mkString("")
