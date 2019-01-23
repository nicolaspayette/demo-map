xs <- c(0, 5, 8, 3, 2, 1)
ys <- c(9, 4, 1, 6, 7, 8)

# For loop version
result <- c()
for (i in seq_along(xs)) {
  result <- c(result, xs[i] + ys[i])
}
print(result)

# Base version, using mapply
print(mapply(`+`, xs, ys))

# Using purrr::map
library(purrr)
xs %>% map2_dbl(ys, `+`) %>% print

# Using dplyr:
library(dplyr)
tibble(x = xs, y = ys) %>% transmute(x + y) %>% .[[1]]
