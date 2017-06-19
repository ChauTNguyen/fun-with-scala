package gettingstarted

class ex2 {
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
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
}
