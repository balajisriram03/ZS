#build in in fuction 

number =[1,-2,-3,-6]
a=[ ]
for x in number:
    a.append(abs(x))
print (a)

print(list(map(abs,number)))


#user defined fuction

def display(a,b):
    return a*b
a=[1,2,3]
b=[2,1,3]

print(set(map(display,a,b)))
    
#lambda function

print(list(map(lambda a,b:a*b,a,b)))

# array input

arr = list(map(int, input("Enter the array elements separated by white space: ").split()))
print(arr)