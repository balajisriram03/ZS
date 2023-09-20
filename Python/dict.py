numbers = [123, 456, 789, 999, 192, 919, 834, 567,91]

# Loop through the list of numbers and remove the ones that contain the digit 9
for num in numbers[:]:  # use a copy of the list to avoid skipping elements
    contains_9 = False
    for digit in str(num):
        if digit == '9':
            contains_9 = True
            break
    if contains_9:
        numbers.remove(num)

print(numbers)