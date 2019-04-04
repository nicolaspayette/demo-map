import collection.mutable.ListBuffer

val xs = List(0, 5, 8, 3, 2, 1)
val ys = List(9, 4, 1, 6, 7, 8)

// Using a for loop:
val result = new ListBuffer[Int]()
for ((x, y) <- xs.zip(ys)) result += x + y
println(result)

// Using map:
println(xs.zip(ys).map { case (x, y) => x + y })

// Using for/yield:
println(for ((x, y) <- xs.zip(ys)) yield x + y)
