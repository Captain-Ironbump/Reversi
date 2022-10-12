object Reversi {
  def main(args: Array[String]): Unit = {
    println("Welcome to Reversi!")
    println(mesh)
  }

  val reversiWidth = 3
  val reversiNum = 3

  val eol = sys.props("line.separator")
  def bar(cellWidth: Int = reversiWidth, cellNum: Int = reversiNum) =
    ("+" + "-" * cellWidth) * cellNum + "+" + eol
  def cells(cellWidth: Int = reversiWidth, cellNum: Int = reversiNum) =
    ("|"+ " " * cellWidth) * cellNum + "|" + eol
  val mesh = (bar() + cells()) * 3 + bar()
}

