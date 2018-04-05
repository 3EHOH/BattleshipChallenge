package domain.player

import domain.board.{Board, Coordinate}
import domain.ship.Orientation.Orientation
import domain.ship.{Fleet, Ship}

//abstract class over trait because base behavior must have constructor parameters

abstract class Player(name: String) {

  protected val playerName: String = name
  protected var fleet: Fleet = new Fleet()
  protected val playerBoard: Board = new Board()
  protected val opponentBoard: Board = new Board() //track what currentPlayer has hit or missed


  protected def fireMissile(missileCoordinate: Coordinate): Unit
  //left abstract because both computer and human will implement, but differently

  protected def receiveMissileFire(missileCoordinate: Coordinate): Unit = {
  // check if coordinate on playerBoard is occupied by ship and call declareIsHitOrMiss
  }

  protected def declareIsHitOrMiss(isHitOrMiss: Boolean): Boolean = {
    //return a Boolean, or could be any binary, since it's an either-or scenario
  }

  protected def placeShips(ships: List[Ship]): Board = {
    //iterate over a list of ships and call placeShip for each individual one
  }

  protected def placeShip(ship: Ship,  coordinate: Coordinate, orientation: Orientation): Unit
  //left abstract because both computer and human will implement, but differently

  protected def isWinner(): Boolean = {
  //declare is winner to end game
  }

}
