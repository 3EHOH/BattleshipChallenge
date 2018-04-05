package domain.ship

import domain.board.Coordinate

case class Destroyer(dir: Orientation.Value, coord: Coordinate) extends Ship(dir, 2, coord)