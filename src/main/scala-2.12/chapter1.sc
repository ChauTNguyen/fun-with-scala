//val x = "Hello, World"
//val r1 = x.reverse
//val r2 = x.reverse

val x = new StringBuilder("Hello")
val y = x.append(", World")
val r1 = y.toString
val r2 = y.toString

case class Player(name: String, score: Int)

def printWinner(p: Player): Unit =
  println(p.name + " is the winner!")

//def declareWinner(p1: Player, p2: Player): Unit =
//  if (p1.score > p2.score) printWinner(p1)
//  else printWinner(p2)

def winner(p1: Player, p2: Player): Player =
  if (p1.score > p2.score) p1 else p2

def declareWinner(p1: Player, p2: Player): Unit =
  printWinner(winner(p1, p2))

val players = List(Player("Sue", 7),
                   Player("Bob", 8),
                   Player("Joe", 4))

val theWinner = players.reduceLeft(winner)

declareWinner(theWinner, Player("Lanni", 3))

object MyModule {
  def abs(i: Int): Int =
    if (i < 0) -i
    else i

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}

def factorial(n: Int): Int = {
  @annotation.tailrec
  def go(i: Int, acc: Int): Int =
    if (i <= 0) acc
    else go(i - 1, acc * i)

  1 + go(n, 1)
}

factorial(3)
factorial(2)
factorial(9)

factorial(500)
factorial(502)
factorial(20)

// Exercise 1
def fib(n: Int): Int =
  if (n == 0) 0
  else if (n == 1) 1
  else fib(n - 1) + fib(n - 2)

fib(3)

val lessThan = new Function2[Int, Int, Boolean] {
  def apply(a: Int, b: Int) = a < b
}

lessThan.apply(3, 4)

def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def go(n: Int): Boolean = {
    if (n < as.length && n + 1 < as.length) {
      if (gt(as(n + 1), as(n))) go(n + 1)
      else false
    } else {
      true
    }
  }

  go(0)
}

def greaterThanInt(x: Int, y: Int): Boolean = x > y
isSorted(Array(2, 3), greaterThanInt)
isSorted(Array(3, 2), greaterThanInt)

