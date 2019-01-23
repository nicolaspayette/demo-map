f <- function(x) { x + 1 }
xs <- c(0, 5, 8, 3, 2, 1)

# For loop version
result <- c()
for (x in xs) {
  result <- c(result, f(x))
}
print(result)

# Base version, using sapply
print(sapply(xs, f))

# Using purrr::map
library(purrr)
xs %>% map_dbl(f) %>% print
