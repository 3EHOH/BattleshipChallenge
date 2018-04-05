package domain.ship

import domain.board.Coordinate

case class Carrier(dir: Orientation.Value, coord: Coordinate) extends Ship(dir, 5, coord)

