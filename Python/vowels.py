#!/bin/bash

# Define the dimensions of the matrix
rows=3
columns=5

# Nested loop to generate the matrix
for ((i=1; i<=rows; i++)); do
    for ((j=1; j<=columns; j++)); do
        echo -n "[$i,$j] "
    done
    echo
done

