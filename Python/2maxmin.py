arr = [5, 3, 9, 1, 7, 4, 8, 6, 2]

# Find the second largest number
largest = None
second_largest = None

for num in arr:
    if largest is None or num > largest:
        second_largest = largest
        largest = num
    elif second_largest is None or num > second_largest:
        second_largest = num

print("The second largest number is:", second_largest)

# Find the second smallest number
smallest = None
second_smallest = None

for num in arr:
    if smallest is None or num < smallest:
        second_smallest = smallest
        smallest = num
    elif second_smallest is None or num < second_smallest:
        second_smallest = num

print("The second smallest number is:", second_smallest)