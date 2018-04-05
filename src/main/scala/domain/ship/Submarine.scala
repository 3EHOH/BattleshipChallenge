package domain.ship

import domain.board.Coordinate

case class Submarine(dir: Orientation.Value, coord: Coordinate) extends Ship(dir, 3, coord)
