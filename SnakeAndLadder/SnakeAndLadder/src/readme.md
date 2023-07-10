Board
---------------
+ snakes: List<Snakes>
+ ladders: List<Ladders>
+ size: int
+ dices: List<Dice>
-----------------------
+ Board(): board:Board
+ setSize(size: int): board:Board
+ setupSnake(List<Snakes>): board:Board
+ setupLadders(List<Ladders>): board:Board
+ validateNewLocation(point: int): point: int
------------------------------------------


GameManager | UI
---------------------
+ board: Board
+ players: Queue<Player>
+ singleton: GameManager
+ winnerCounter: int
---------------------
+ getInstance(): singleton: GameManager
-----------------------


Player
--------------------
+ position: int
+ color: int
+ winningPosition: int
+ hasWon: boolean
---------------------
+ rollTheDices(): int
+ move()



Dice
--------------
- side: int
----------------
+ roll(): num:int
----------------

Snake
------------------------
+ head: int
+ tail: int
-----------------------

Ladder
------------------------
+ top: int
+ bottom: int
-----------------------

