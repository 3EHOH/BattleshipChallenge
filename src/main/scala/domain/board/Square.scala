package domain.board

import domain.missilelaunch.MissileAttempt
import domain.ship.Ship

class Square(xCoord: Int, yCoord: Int) {

  val coordinates: Coordinate = new Coordinate(xCoord, yCoord)
  private val maybeShip: Option[Ship]
  private var maybeMissileAttempt: Option[MissileAttempt]

  def hasShip(ship: Ship): Boolean = {
    //return if coordinate has ship
  }

  def hasMissileAttempt(missileAttempt: MissileAttempt): Boolean = {
    //return if coordinate has missile attempt
  }
}
