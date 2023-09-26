# def printListInreverseOrder(lst, idx):
#   if(idx < 0):
#     return ""
  
#   print(lst[idx])
#   printListInreverseOrder(lst, idx-1)

# lst=[1,2,3,4,5,6,7,8]
# printListInreverseOrder(lst, len(lst)-1)

# def gcd(num1, num2, idx, gcdValue):
#   min = num1 if num1 < num2 else num2
#   if idx  > min:
#     return gcdValue

#   if num1%idx ==0 and num2 %idx == 0:
#     gcdValue = idx

#   return gcd(num1, num2, idx+1, gcdValue)
  
# gcdVal = gcd(2, 4, 2, 1)
# print(gcdVal)


# def decToBin(num, result):
#   if num <= 1:
#     result = str(num) + result
#     return result

#   remainder = num % 2
#   num = num // 2 
#   result = str(remainder)+result
#   return decToBin(num, result)

# bin = decToBin(15, "")
# print(bin)


def binsearch(arr,el):
  l=len(arr)
  c=0
  mid=l//2
  print(mid)
  if el==arr[mid]:
    c=1
  elif el<arr[mid]:
    for i in range(0,mid):
      if arr[i]==el:
        c=1
  else:   
    for i in range(mid+1,l):
      if arr[i]==el:
        c=1
  if c==1:
    print("the element is present in the array")
  else:
    print("the element is not present in the array")
 
n=int(input("enter the no of elements for the array : "))
array=[]
for i in range(n):
  no=int(input())
  array.append(no)
array.sort()
print(array)
elem=int(input("enter the element to be searched : "))
binsearch(array,elem)
