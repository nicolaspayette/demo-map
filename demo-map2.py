xs = [0, 5, 8, 3, 2, 1]
ys = [9, 4, 1, 6, 7, 8]

# For loop version
result = []
for x, y in zip(xs, ys):
    result.append(x + y)
print(result)

# List comprehension version
print([x + y for x, y in zip(xs, ys)])

# Map version
import operator
print(list(map(operator.add, xs, ys)))
