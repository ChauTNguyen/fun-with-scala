package gettingstarted

class ex1 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(i: Int, prev: Int, curr: Int): Int = {
      if (i == 0) prev
      else go(i - 1, curr, curr + prev)
    }

    go(n, 0, 1)
  }

  def recursiveFib(n: Int): Int =
    if (n == 0) 0
    else if (n == 1) 1
    else recursiveFib(n - 1) + recursiveFib(n - 2)
}
