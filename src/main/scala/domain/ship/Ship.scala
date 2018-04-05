package domain.ship

import domain.board.Coordinate

//abstract class over trait because base behavior must have constructor parameters

abstract class Ship(dir: Orientation.Value, length: Int, coord: Coordinate) {

  val size = length
  private var hitCount = 0
  private val orientation = dir
  private val bowCoordinate : Coordinate = coord

  def isSunk(): Boolean = {
    //compare size to number of hits
  }

  def isHit(): Boolean = {
    //call isAtLocation
  }

  def isAtLocation(): Boolean = {
    //check the bowCoordinate, size, and orientation
  }

}
