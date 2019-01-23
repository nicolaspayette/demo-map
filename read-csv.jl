using DataFrames, CSV
vcat([CSV.read(f) for f = readdir() if endswith(f, ".csv")]...)
