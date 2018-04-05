package domain.board

import domain.ship.Ship

class Board {

  //set the size of the board
  private val xDimensions = 10
  private val yDimensions = 10
  var board = Array.ofDim[Square](xDimensions, yDimensions)

  def isCoordinatesOccupied(coordinate: Coordinate): Boolean = {
    //check if coordinates are occupied
  }

  def isHitOrMiss(coordinate: Coordinate): Boolean = {
    //so that a player can track hit/miss on opponentsBoard
  }

  def initializeBoard(board: Board): Board = {
    // set every coordinate to no ship and no fire attempts
  }

  def updateBoard(coordinate: Coordinate, hitShip: Option[Ship]): Board = {
    // call after a fired missile
  }

  def printBoard(board: Board): Unit = {
    //display board - would need additional logic elsewhere to support all the operations around display
  }

}
