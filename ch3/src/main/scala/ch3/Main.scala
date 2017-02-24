package ch3

object Main {
  def main(args: Array[String]): Unit = {
    def compare(result: Int, expected: Int) = {
      println(s"$result == $expected ; ${result == expected}")
    }


    //    def and(x1: Int, x2: Int) = {
    //      val (w1, w2, theta) = (0.5, 0.5, 0.7)
    //      val tmp = x1 * w1 + x2 * w2
    //      if (tmp <= theta) 0
    //      else 1
    //    }
    //
    //    println(" -- AND -- ")
    //    compare(and(0, 0), 0)
    //    compare(and(1, 0), 0)
    //    compare(and(0, 1), 0)
    //    compare(and(1, 1), 1)
    //    println()

    def and(xs: Double*) = {
      val ws = List(0.5, 0.5)
      val b = -0.7
      val tmp = xs.zip(ws).map({ case (x, w) => x * w }).sum + b

      if (tmp <= 0) 0
      else 1
    }

    println(" -- AND -- ")
    compare(and(0, 0), 0)
    compare(and(1, 0), 0)
    compare(and(0, 1), 0)
    compare(and(1, 1), 1)
    println()


    def nand(xs: Double*) = {
      val ws = List(-0.5, -0.5)
      val b = 0.7
      val tmp = xs.zip(ws).map({ case (x, w) => x * w }).sum + b

      if (tmp <= 0) 0
      else 1
    }

    println(" -- NAND -- ")
    compare(nand(0, 0), 1)
    compare(nand(1, 0), 1)
    compare(nand(0, 1), 1)
    compare(nand(1, 1), 0)
    println()

    def or(xs: Double*) = {
      val ws = List(0.5, 0.5)
      val b = -0.2
      val tmp = xs.zip(ws).map({ case (x, w) => x * w }).sum + b

      if (tmp <= 0) 0
      else 1
    }

    println(" -- OR -- ")
    compare(or(0, 0), 0)
    compare(or(1, 0), 1)
    compare(or(0, 1), 1)
    compare(or(1, 1), 1)
    println()

    def xor(xs: Double*) = {
      val s1 = nand(xs: _*)
      val s2 = or(xs: _*)
      and(s1, s2)
    }

    println(" -- xor -- ")
    compare(xor(0, 0), 0)
    compare(xor(1, 0), 1)
    compare(xor(0, 1), 1)
    compare(xor(1, 1), 0)
    println()
  }
}
