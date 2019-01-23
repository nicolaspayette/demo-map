import collection.mutable.ListBuffer

val xs = List(0, 5, 8, 3, 2, 1)
val f = (x: Int) => x + 1

// Using a for loop:
val result = new ListBuffer[Int]()
for (x <- xs) result += f(x)
println(result)

// Using map:
println(xs.map(f))

// Using for/yield
println(for (x <- xs) yield f(x))
