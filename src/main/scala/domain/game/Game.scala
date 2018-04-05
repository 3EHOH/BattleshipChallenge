package domain.game

import domain.player._

class Game {

  val player1: Player
  val player2: Player


  def playGame(): Unit = {
    //initialize board, players, loop via takeTurn and check isGameOver
  }

  def takeTurn(players: Set[Player]): Player = {
    //iterate between players
  }

  def isGameOver(player: Player): Boolean = {
    //check whether player 1 or 2 isWinner
  }

  def generatePlayers(playerOneType: String, playerTwoType: String): List[Player] = {
    //call either createHumanPlayer or createComputerPlayer based on input
  }

  def createHumanPlayer(): HumanPlayer = {
  // call this to create a human player
  }

  def createComputerPlayer(): ComputerPlayer = {
  // call this to create a computer player
  }

}
