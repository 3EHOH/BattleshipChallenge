package domain.board

import domain.ship.Orientation.Orientation

class Coordinate(xCoord: Int, yCoord: Int) {

  val xCoordinate : Int = xCoord
  val yCoordinate : Int = yCoord

  def getNextCoordinate(orientation: Orientation): Coordinate ={
    //simplify iterating
  }

  def equals(coordinate: Coordinate): Coordinate ={
    //simplify checking
  }
}
