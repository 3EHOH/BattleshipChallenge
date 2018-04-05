package domain.ship

class Fleet {

  var fleet = generateFleet()

  def generateFleet() : List[Ship] = {
  // generate a list with an instance of each ship clas
  }

  def getFleetSize(fleet: List[Ship]): Int = {
  //return the current size of the fleet
  }

  def removeSunkShipFromFleet(ship: Ship): Unit = {
    //remove the sunk ship from the fleet
  }

  def isFleetDecimated(): Boolean = {
    //call the getFleetSize and if == 0 return true
  }
}
