array=[79,35,54,19,35,25]
print("the given array :",array,"\n")
array.sort(reverse=True)
print("the reversed array : ",array,"\n")
l=len(array)
r=l//2
if l%2!=0:
  r=r+1
if l%2==0:# even case
  print((r+1)*" " ,array[l-1],"\n")
  print((r+1)*" ",array[l-2],"\n")
  ind=l-3
  ss=r-2
  cs=1
  for i in range(r-1):
    for j in range(ind,0,-1):
      print(ss*" ",array[j],cs*" ",array[j-1])
      ind=ind-2
      ss=ss-1
      cs=cs+2
      break
    print("\r")    
else:# odd case
  print((r+1)*" ",array[l-1],"\n")
  ind=l-2
  ss=r-2
  cs=1
  for i in range(r-1):
    for j in range(ind,0,-1):
      print(ss*" ",array[j],cs*" ",array[j-1])
      ind=ind-2
      ss=ss-1
      cs=cs+2
      break
    print("\r")  
  
  