a=int(input("Enter the number of numbers in the list"))
lst=[]
for i in range(a):
    b=int(input())
    lst.append(b)
no=int(input("enter the no to find : "))
if no in lst:
    print("the no is present in the list")
    index=lst.index(no)
    print("the index of the no is",index)
else:
    print("the no is not present in the list")    