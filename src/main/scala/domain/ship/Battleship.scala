package domain.ship

import domain.board.Coordinate

case class Battleship(dir: Orientation.Value, coord: Coordinate) extends Ship(dir, 4, coord)