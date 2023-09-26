# aggregate=0
# num=int(input("Enter a Number : "))
# prov=num
# while(num):
#     i=1
#     factorial=1
#     remainder=num%10
#     while(i<=remainder):  
#         factorial=factorial*i    
#         i=i+1
#     aggregate=aggregate+factorial
#     num=num//10
# if (aggregate==prov):
#       print("The number is a strong number.")
# else:
#       print("The number is not a strong number.")


#  a=input("Enter the list of numbers seperated by comma")
#  c=a.split(",")
#  b=[]
#  for i in cy:
#     if int(i) % 5 == 0 and int(i)<=150:
#      b.append(i)
#      print(i)


# num=input("Enter the total numbers of input in the list")
# new=num.split(",")
# m=[]
# for i in new:
#   if int(i)%5==0 and int(i)<=150:
#     m.append(i)
#     print(i)

age = input("Enter your DOB in DD/MM/YYYY format: ")
new = age.split("/")
day = int(new[0])
month = int(new[1])
year = int(new[2])

# Assuming the current date is 17/08/2023
current_day = 17
current_month = 8
current_year = 2023

# Calculate the age in days
days_in_year = 365
days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

# Account for leap years
def is_leap_year(year):
    return year % 4 == 0 and (year % 100 != 0 or year % 400 == 0)

if is_leap_year(year):
    days_in_month[1] = 29

# Calculate the number of days in the birth year
birth_year_days = (days_in_month[month - 1] - day) + sum(days_in_month[month:])

# Calculate the number of days in the current year
current_year_days = sum(days_in_month[:current_month - 1]) + current_day

# Calculate the number of days in the years between birth year and current year
days_in_between = sum(days_in_year for y in range(year + 1, current_year))

# Calculate the age in days
age_in_days = birth_year_days + current_year_days + days_in_between

print("Age in days:", age_in_days)

