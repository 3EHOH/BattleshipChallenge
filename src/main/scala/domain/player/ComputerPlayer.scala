package domain.player

import domain.board.Coordinate
import domain.ship.Orientation.Orientation
import domain.ship.Ship

class ComputerPlayer(name: String) extends Player(name) {

  override def fireMissile(): Unit = {
    //override the fireMissile
  }

  override def placeShip(ship: Ship,  coordinate: Coordinate, orientation: Orientation): Unit = {
    //place a ship at x,y coordinates  if isCoordinatesOccupied is false at that point and at the
  }

}
