#1
#print a list in reverse order
list=[]
#enter 5 values for the list
print("enter 5 values for the list")
for i in range(5):
  no=int(input())
  list.append(no)
print(list) 
list1=[]
#reverse the list
for i in list:
  list1.insert(0,i)
print(list1)  

#recursion
def print_reverse_list(lst, index):
    if index >= 0:
        print(lst[index], end=" ")
        print_reverse_list(lst, index - 1)

lst = []

print("Enter 5 values for the list:")
for i in range(5):
    num = int(input())
    lst.append(num)

print("Original List:", lst)

print("List in Reverse Order:")
print_reverse_list(lst, len(lst) - 1)



#2
#finding gcd of two numbers
a=int(input("enter the first number : "))
b=int(input("enter the second number : "))
if a>b:
  a,b=b,a
for i in range(1,a+1):
  if a%i==0 and b%i==0:
    gcd=i
print("gcd of ",a,", ",b," is :",gcd)    


#3
#program to convert decimal to octal binary and hexadecimal
def dec_bin(n):
  bin=""
  while(n>0):
      t=n%2
      bin=str(t)+bin
      n=n//2
  return(bin)
  
def dec_oct(n):
  oct=""
  while(n>0):
      t=n%8
      oct=str(t)+oct
      n=n//8
  return(oct)
  
def dec_hex(n):
  value_table={10:"A",11:"B",12:"C",13:"D",14:"E",15:"F"}
  hex=""
  while(n>0):
    t=n%16
    if t<10:
      hex=str(t)+hex
    else:
      hex=value_table[t]+hex
    n=n//16
  return(hex)
    
  
no=int(input("enter a decimal no : "))
print("the given decimal no is : ",no)

#decimal to binary
bno=dec_bin(no)
print("the binary equivalent is : ",bno)

#decimal to octal
octno=dec_oct(no)
print("the octal equivalent is : ",octno)

#decimal to hexadecimal
hexno=dec_hex(no)
print("the hexadecimal equivalent is : ",hexno)


#4
#searching element in an array using binary search
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

#5
#finding sum of digits of a number
def sum(lst):
  c=0
  for i in lst:
    c=c+i
  print("the sum of digits of the given number is : ",c) 
  
no=int(input("enter a interger number : "))
print("the given number is : ",no)
no_str=str(no)
list=[]
for i in no_str:
  list.append(int(i))
print("the digits present in the numbers  are : ",list)
sum(list)
