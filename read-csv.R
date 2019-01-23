library(tidyverse)
list.files(pattern = "*.csv$") %>% map(read_csv) %>% bind_rows()
