This repo is for a code challenge that posed three questions. Let's resolve the first two in this README before diving 
into the larger third question.


Question 1:  

Write a function in your favorite programming language that takes, as input, a sorted array, and returns an 
array with the same numbers, uniformly randomized.

Answer:

```
def randomize(inputArray: Array[Int]): Array[Int] = {
	val r = scala.util.Random
	val maxRandomInt = inputArray.length
	var indexesUsed = Set[Int]()
	var outputArray = Array[Int]()
 	
	for(element <- inputArray){  
		var currentIndex: Int = r.nextInt(maxRandomInt)
    
		while(indexesUsed(currentIndex)){
			currentIndex = r.nextInt(maxRandomInt)
		}
      
		indexesUsed += currentIndex
		outputArray = outputArray :+ inputArray(currentIndex)
	}
	return outputArray
}
```

Question 2: 

You have a SQL database with the following two tables:

```
question
+------------------+--------------+
| Field            | Type         |
+------------------+--------------+
| id               | bigint(20)   |
| testid           | bigint(20)   |
| content          | varchar(255) |
| created          | datetime     |
+------------------+--------------+

answer
+------------------+--------------+
| Field            | Type         |
+------------------+--------------+
| id               | bigint(20)   |
| questionid       | bigint(20)   |
| content          | varchar(255) |
| iscorrect        | tinyint      |
| created          | datetime     |
+------------------+--------------+
```

The answer table's `questionid` column references to which question the answer belongs (foreign key). The answer table's 
`iscorrect` column is a 0/1 value representing whether the answer is a correct answer for the question. Write a query to 
find the questions with more than one correct answer.

Answer, tested using MySQL syntax:
```
select * from question 
where id 
in (
	select questionid 
	from answer 
	where iscorrect = 1 
	group by questionid 
	having count(*) > 1
);
```

Question 3:

Define an object-oriented architecture for playing the game Battleship using classes and member variables and functions. 
Consider any design patterns that might be useful. No logic, just definitions.

That is the code contained within the `/src/` directory of this project. Let's give a high-level overview of that code.

I have defined these classes:

- `Board` is composed of a 2D array of `Squares` instances.

- `Square` is composed of `Coordinates`, and has `Option`al `Ship` and `MissileAttempt` instances.

- `Coordinate` is integer x, y values.

- `Fleet` is a List of `Ship` instances. It is generated with a full list of ships at the beginning of a game, and 
is decremented until it `isDecimated`.

- `Ship` has a `size`, `hitCount`, `bowCoordinate`, and `orientation`. It is an abstract class that is extended
by the `Battleship`, `Carrier`, `Cruiser`, `Destroyer`, and `Submarine` subclasses. A ship has `isAtLocation`, `isHit`, 
and `isSunk` functionality.

- `MissileAttempt` is an abstract class that is extended by the `MissileHit` and `MissileMiss` subclasses, which return
a Boolean value as to whether a MissileAttempt was successful.

- `Player` is an abstract class that is extended by the `HumanPlayer` and `ComputerPlayer` subclasses. A `Player` has a
a `name`, a `Fleet`, and two `Boards` - their own, where they `placeShips`, and an `opponentBoard` where the player tracks the result
of their own `fireMissile` calls against their opponent. When a `Player`'s `Board` is fired upon, they record `receiveMissileFire`,
 and `declareHitOrMiss`. When a `Player`'s `Fleet` `isDecimated`, their opponent `isWinner`.

- `Game` begins the game, alternates between players, and ends when one wins.