# """comin=input("Enter four numbers seperated by comma:")
# inp = comin.split(",")
# arr = list(map(int,inp))
# arr2=[]
# for a in arr:
#     for b in arr:
#         for c in arr:
#             for d in arr:
#                 arr2.append(str(a)+str(b)+str(c)+str(d))
# print (arr2)


# """


# numbers = input("Enter 4 individual single-digit numbers separated by commas : ")
# arr = []
# for num in numbers.split(","):
#     arr.append(int(num))
# combinations = []
# for i in arr:
#     for j in arr:
#         if j != i:
#             for k in arr:
#                 if k != i and k != j:
#                     for l in arr:
#                         if l != i and l != j and l != k:
#                             combinations.append([i, j, k, l])
# for combo in combinations:
#     print(combo)


# numbers = []
# for i in range(10):
#     a=int(input("Enter number"))
#     numbers.append(a)
# print (numbers)
# numbers.sort(reversed)
# print(numbers)

# array = [1,2,3,4,5,6,7,8]
# es = 0
# for i in range(0,len(array),2):
#     print(i)
#     es+=array[i]
    
# print (es)

# n = int(input("enter the no of items for the array"))
# list=[]
# for i in range(n):
#     a=input("enter the character")
#     list.append(a)
# list1=[]
# for i in list:
#     list1.append(ord(i))
# print (list1)
# dict = {}
# for i in range(n):
#     dict[list[i]]=list1[i]=list1[i]
# print (dict)

row1=int(input("enter the no of rows for the first matrix : "))
col1=int(input("enter the no of columns for the first matrix : "))
matrix1=[]
print("enter the entries row by row :")
for row in range(row1):
  a=[]
  for col in range(col1):
    entry=int(input())
    a.append(entry)
  matrix1.append(a)
print(matrix1)
for i in range(row1):
  for j in range(col1):
    print (matrix1[i][j],end =" ")
  print("\n")