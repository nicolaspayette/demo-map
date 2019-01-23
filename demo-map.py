def f(x):
    return x + 1
xs = [0, 5, 8, 3, 2, 1]

# For loop version
result = []
for x in xs:
    result.append(f(x))
print(result)

# List comprehension version
print([f(x) for x in xs])

# Map version
print(list(map(f, xs)))
