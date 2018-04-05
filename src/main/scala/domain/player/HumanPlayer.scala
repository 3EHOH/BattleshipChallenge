package domain.player

import domain.board.Coordinate
import domain.ship.Orientation.Orientation
import domain.ship.Ship

class HumanPlayer(name: String) extends Player(name) {


  override def fireMissile(coordinate: Coordinate): Unit = {

  }

  override def placeShip(ship: Ship, coordinate: Coordinate, orientation: Orientation): Unit = {
    //place a ship in a Square at x,y coordinates  if isCoordinatesOccupied is false at that point and at the
  }


}
