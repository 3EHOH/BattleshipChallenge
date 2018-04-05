import domain.game.Game

class Main {
  def main(args: Array[String]): Unit = {

    val battleship: Game = new Game()
    battleship.playGame()
  }
}
