# n = int(input("Enter a number: "))

# if n == 1:
#     print("The number is neither prime nor composite.")
# else:
#     is_prime = True
#     for i in range(2, int(n ** 0.5) + 1):
#         if n % i == 0:
#             is_prime = False
#             break

#     if is_prime:
#         print("The number is prime.")
#     else:
#         print("The number is not prime.")

# def prime(num):
#   for j in range (2,num):
#     for i in range(2,j):
#       if j%i==0:
#         break
#     else:
#       print(j)
# print(prime(13))




# def prime(num):
#   if (isinstance(num,str)):
#     return "Invalid input"
#   for j in range (2,num):
#     for i in range(2,j):
#       if j%i==0:
#         break
#     else:
#       print(j)
# print(prime("str"))

# def stutter(word):
#     stuttered_word = word[:2] + '... ' + word[:2] + '... ' + word + '?'
#     return stuttered_word


# word = "incredible"
# stuttered = stutter(word)
# print(stuttered)

# def decimal_to_binary(decimal_number):
#     if decimal_number == 0:
#         return '0'
    
#     binary_representation = ''
#     while decimal_number > 0:
#         remainder = decimal_number % 2
#         binary_representation = str(remainder) + binary_representation
#         decimal_number //= 2
    
#     return binary_representation

# # Example usage
# decimal_number = 25
# binary_number = decimal_to_binary(decimal_number)
# print(f"The binary representation of {decimal_number} is: {binary_number}")

# number = int(input("Enter a number"))
# length = int(input("Enter the number of times you want to multiply"))
# multiples = []

# for i in range(1, length + 1):
#     a=number * i
#     multiples.append(a)

# print(multiples)

hex_number = "1A"  # Replace this with your hex number
binary_number = bin(int(hex_number, 16))[2:]

print("Hex:", hex_number)
print("Binary:", binary_number)

# a=int(input("Enter the total Number of Balls "))
# overs= a/6
# print(f"{overs:.1f}")

# expressions = [
#     "5 + 3",
#     "6 - 3",
#     "7 * 4",
#     "8 / 2"
# ]

# for expression in expressions:
#     expression = expression.strip()

#     operator = None
#     if "+" in expression:
#         operator = "+"
#     elif "-" in expression:
#         operator = "-"
#     elif "*" in expression:
#         operator = "*"
#     elif "/" in expression:
#         operator = "/"

#     if operator is None:
#         print(f"Invalid expression: {expression}")
#         continue

#     operands = expression.split(operator)
#     operand1 = float(operands[0].strip())
#     operand2 = float(operands[1].strip())

#     if operator == "/" and operand2 == 0:
#         print("Division by zero error")
#         continue

#     if operator == "+":
#         result = operand1 + operand2
#     elif operator == "-":
#         result = operand1 - operand2
#     elif operator == "*":
#         result = operand1 * operand2
#     elif operator == "/":
#         result = operand1 / operand2

#     print(f"{expression} = {result}")