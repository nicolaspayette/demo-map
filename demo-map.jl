f(x) = x + 1
xs = [0, 5, 8, 3, 2, 1]

# For loop version:
result = []
for x = xs
  push!(result, f(x))
end
println(result)

# List comprehension version:
[f(x) for x = xs] |> println

# Map version:
map(f, xs) |> println

# Broadcast version:
f.(xs) |> println
