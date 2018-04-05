package domain.ship

import domain.board.Coordinate

case class Cruiser(dir: Orientation.Value, coord: Coordinate) extends Ship(dir, 3, coord)

