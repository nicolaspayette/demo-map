xs = [0, 5, 8, 3, 2, 1]
ys = [9, 4, 1, 6, 7, 8]

# For loop version:
result = []
for (x, y) = zip(xs, ys)
  push!(result, x + y)
end
println(result)

# List comprehension version:
[x + y for (x, y) = zip(xs, ys)] |> println

# Map version:
map(+, xs, ys) |> println

# Broadcast version:
xs .+ ys |> println
