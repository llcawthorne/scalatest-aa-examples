package property

object MathUtils {

  /**
    * return a value that is increased over the input parameter
    * by a random value
    */
  def increaseRandomly(i: Int) = {
    val randomNum = getRandomIntFrom1To100()

    i + randomNum.toLong
  }

  private def getRandomIntFrom1To100(): Int = scala.util.Random.nextInt(100) + 1

}