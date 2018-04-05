package domain.ship

import domain.board.Coordinate

//abstract class over trait because base behavior must have constructor parameters

abstract class Ship(dir: Orientation.Value, length: Int, coord: Coordinate) {

  protected val size = length
  protected var hitCount = 0
  protected val orientation = dir
  protected val bowCoordinate : Coordinate = coord

  protected def isSunk(): Boolean = {
    //compare size to number of hits
  }

  protected def isHit(): Boolean = {
    //call isAtLocation
  }

  protected def isAtLocation(): Boolean = {
    //check the bowCoordinate, size, and orientation
  }

}
