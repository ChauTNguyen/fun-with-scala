package gettingstarted

class ex3 {
  def partial1[A,B,C](a: A, f: (A,B) => C): B => C
    = f(a, _)
  def partial1Long[A,B,C](a: A, f: (A,B) => C): B => C
    = (b: B) => f(a, b)
}
